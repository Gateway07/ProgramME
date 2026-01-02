package org.tracing;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.BaseStream;

final class RepresentationAdapter {
	private RepresentationAdapter() {
	}

	static String toJson(Object obj, TracingAspectService.Options options) {
		TracingAspectService.Options nonNullOptions = options == null ? new TracingAspectService.Options(null, null, 10) : options;
		IdentityHashMap<Object, Boolean> visiting = new IdentityHashMap<>();
		StringBuilder sb = new StringBuilder(128);
		appendJsonValue(sb, obj, nonNullOptions, visiting, 0);
		return sb.toString();
	}

	private static void appendJsonValue(StringBuilder out, Object obj, TracingAspectService.Options options, IdentityHashMap<Object, Boolean> visiting, int depth) {
		if (obj == null) {
			out.append("null");
			return;
		}

		Class<?> objectClass = obj.getClass();
		if (obj instanceof CharSequence) {
			appendJsonString(depth > 0, out, obj.toString());
			return;
		}
		if (obj instanceof Boolean b) {
			out.append(b ? "true" : "false");
			return;
		}
		if (obj instanceof Number n) {
			if (n instanceof Double d && (Double.isNaN(d) || Double.isInfinite(d))) {
				appendJsonString(false, out, String.valueOf(n));
			} else if (n instanceof Float f && (Float.isNaN(f) || Float.isInfinite(f))) {
				appendJsonString(false, out, String.valueOf(n));
			} else {
				out.append(n);
			}
			return;
		}
		if (obj instanceof Character) {
			String s = String.valueOf(obj);
			appendJsonString(depth > 0, out, s);
			return;
		}
		if (obj instanceof Enum<?> e) {
			appendJsonString(depth > 0, out, e.name());
			return;
		}
		if (obj instanceof Class<?> c) {
			appendJsonString(depth > 0, out, c.getName());
			return;
		}
		if (obj instanceof Throwable t) {
			appendThrowable(out, t);
			return;
		}
		if (isUnsafeType(obj)) {
			appendJsonString(depth > 0, out, String.valueOf(obj));
			return;
		}
		int maxDepth = options.maxDepthLimit() <= 0 ? 5 : options.maxDepthLimit();
		if (depth > maxDepth) {
			out.append("{\"#depth-limit-ref\":");
			appendJsonString(true, out, String.valueOf(obj));
			out.append("}");
			return;
		}
		if (visiting.put(obj, Boolean.TRUE) != null) {
			out.append("{\"#recursive-ref\":");
			appendJsonString(true, out, String.valueOf(obj));
			out.append("}");
			return;
		}
		try {
			if (objectClass.isArray()) {
				appendLimitedArray(out, obj, options, visiting, depth);
				return;
			}
			if (obj instanceof Map<?, ?> map) {
				appendLimitedMap(out, map, options, visiting, depth);
				return;
			}
			if (obj instanceof java.util.Collection<?> collection) {
				appendLimitedCollection(out, collection, options, visiting, depth);
				return;
			}
			if (obj instanceof Iterable<?> iterable) {
				appendLimitedIterable(out, iterable, options, visiting, depth);
				return;
			}
			appendObjectAsJson(out, obj, options, visiting, depth);
		} catch (Throwable t) {
			appendJsonString(depth > 0, out, String.valueOf(obj));
		} finally {
			visiting.remove(obj);
		}
	}

	private static void appendThrowable(StringBuilder out, Throwable t) {
		out.append('{');
		appendJsonString(true, out, "message");
		out.append(':');
		appendJsonString(true, out, t.getMessage());
		out.append('}');
	}

	private static void appendLimitedArray(StringBuilder out, Object array, TracingAspectService.Options options, IdentityHashMap<Object, Boolean> visiting, int depth) {
		int limit = getSizeLimit(array.getClass(), options);
		if (limit < 0) {
			appendJsonString(depth > 0, out, String.valueOf(array));
			return;
		}

		int size = Array.getLength(array);
		out.append('{');
		appendJsonString(depth > 0, out, "#size");
		out.append(':');
		out.append(size);
		out.append(", \"#values\"=[");
		int emitted = 0;
		for (int i = 0; i < size && emitted < limit; i++) {
			if (emitted > 0)
				out.append(',');
			appendJsonValue(out, Array.get(array, i), options, visiting, depth + 1);
			emitted++;
		}
		out.append(']');
		if (emitted < size) {
			out.append(", \"#limited\":true");
		}
		out.append('}');
	}

	private static void appendLimitedCollection(StringBuilder out, java.util.Collection<?> collection, TracingAspectService.Options options, IdentityHashMap<Object, Boolean> visiting, int depth) {
		int limit = getSizeLimit(collection.getClass(), options);
		if (limit < 0) {
			appendJsonString(depth > 0, out, String.valueOf(collection));
			return;
		}

		out.append('{');
		appendJsonString(true,out, "#size");
		out.append(':');
		out.append(collection.size());
		out.append(", \"#values\":[");
		int emitted = 0;
		for (Object v : collection) {
			if (emitted >= limit) {
				break;
			}
			if (emitted > 0)
				out.append(',');
			appendJsonValue(out, v, options, visiting, depth + 1);
			emitted++;
		}
		out.append(']');
		if (emitted < collection.size()) {
			out.append(", \"#limited\":true");
		}
		out.append('}');
	}

	private static void appendLimitedIterable(StringBuilder out, Iterable<?> iterable, TracingAspectService.Options options, IdentityHashMap<Object, Boolean> visiting, int depth) {
		int limit = getSizeLimit(iterable.getClass(), options);
		if (limit < 0) {
			appendJsonString(depth > 0, out, String.valueOf(iterable));
			return;
		}

		out.append('[');
		int emitted = 0;
		for (Object v : iterable) {
			if (emitted >= limit) {
				break;
			}
			if (emitted > 0) {
				out.append(',');
			}
			appendJsonValue(out, v, options, visiting, depth + 1);
			emitted++;
		}
		out.append(']');
	}

	private static void appendLimitedMap(StringBuilder out, Map<?, ?> map, TracingAspectService.Options options, IdentityHashMap<Object, Boolean> visiting, int depth) {
		int limit = getSizeLimit(map.getClass(), options);
		if (limit < 0) {
			appendJsonString(depth > 0, out, String.valueOf(map));
			return;
		}

		out.append('{');
		appendJsonString(true, out, "#size");
		out.append(':');
		out.append(map.size());
		out.append(", \"#values\":{");
		int emitted = 0;
		for (Map.Entry<?, ?> entry : map.entrySet()) {
			if (emitted >= limit) {
				break;
			}
			if (emitted > 0)
				out.append(',');
			appendJsonString(true, out, String.valueOf(entry.getKey()));
			out.append(':');
			appendJsonValue(out, entry.getValue(), options, visiting, depth + 1);
			emitted++;
		}
		out.append('}');
		if (emitted < map.size()) {
			out.append(", \"#limited\":true");
		}
		out.append('}');
	}

	private static void appendObjectAsJson(StringBuilder out, Object obj, TracingAspectService.Options options, IdentityHashMap<Object, Boolean> visiting, int depth) {
		int mode = getObjectRepresentationMode(obj.getClass(), options);
		try {
			Map<String, Object> fields = new LinkedHashMap<>();
			if (mode <= 0) {
				appendPublicFields(obj, fields);
			} else {
				appendDeclaredFields(obj, fields);
				if (mode >= 2) {
					appendGetterProperties(obj, fields);
				}
			}

			out.append('{');
			boolean first = true;
			for (Map.Entry<String, Object> entry : fields.entrySet()) {
				if (!first) {
					out.append(',');
				}
				first = false;
				appendJsonString(true, out, entry.getKey());
				out.append(':');
				appendJsonValue(out, entry.getValue(), options, visiting, depth + 1);
			}
			out.append('}');
		} catch (Throwable t) {
			appendJsonString(depth > 0, out, String.valueOf(obj));
		}
	}

	private static void appendPublicFields(Object obj, Map<String, Object> out) {
		for (Field f : obj.getClass().getFields()) {
			if (Modifier.isStatic(f.getModifiers())) {
				continue;
			}
			try {
				out.put(f.getName(), f.get(obj));
			} catch (Throwable t) {
				out.put(f.getName(), t.getMessage());
			}
		}
	}

	private static void appendDeclaredFields(Object obj, Map<String, Object> out) {
		Field[] declaredFields;
		try {
			declaredFields = obj.getClass().getDeclaredFields();
		} catch (Throwable t) {
			appendPublicFields(obj, out);
			return;
		}
		for (Field f : declaredFields) {
			if (Modifier.isStatic(f.getModifiers())) {
				continue;
			}
			try {
				try {
					f.setAccessible(true);
				} catch (Throwable ignored) {
				}
				out.put(f.getName(), f.get(obj));
			} catch (Throwable t) {
				out.put(f.getName(), t.getMessage());
			}
		}
	}

	private static void appendGetterProperties(Object obj, Map<String, Object> out) {
		for (Method m : obj.getClass().getMethods()) {
			if (Modifier.isStatic(m.getModifiers())) {
				continue;
			}
			if (m.getParameterCount() != 0) {
				continue;
			}
			if (m.getReturnType() == Void.TYPE) {
				continue;
			}
			String name = m.getName();
			if ("getClass".equals(name)) {
				continue;
			}
			String propertyName = getterToPropertyName(name);
			if (propertyName == null || out.containsKey(propertyName)) {
				continue;
			}
			try {
				out.put(propertyName, m.invoke(obj));
			} catch (Throwable t) {
				out.put(propertyName, t.getMessage());
			}
		}
	}

	private static String getterToPropertyName(String methodName) {
		if (methodName.startsWith("get") && methodName.length() > 3) {
			return decapitalize(methodName.substring(3));
		}
		if (methodName.startsWith("is") && methodName.length() > 2) {
			return decapitalize(methodName.substring(2));
		}
		return null;
	}

	private static String decapitalize(String name) {
		if (name.isEmpty()) {
			return name;
		}
		char first = name.charAt(0);
		char lower = Character.toLowerCase(first);
		if (first == lower) {
			return name;
		}
		return lower + name.substring(1);
	}

	private static int getSizeLimit(Class<?> objectClass, TracingAspectService.Options options) {
		Map<String, Integer> limits = options.sizeLimitPerContainerClass();
		Integer limit;
		if (objectClass.isArray()) {
			limit = limits.get(Array.class.getName());
			if (limit != null) {
				return limit;
			}
		}
		limit = findLimitByTypeHierarchy(limits, objectClass);
		return limit == null ? 10 : limit;
	}

	private static int getObjectRepresentationMode(Class<?> objectClass, TracingAspectService.Options options) {
		Map<String, Integer> modes = options.objectRepresentationModePerClass();
		Integer mode = findLimitByTypeHierarchy(modes, objectClass);
		if (mode == null) {
			return 0;
		}
		if (mode < 0) {
			return 0;
		}
		return Math.min(mode, 2);
	}

	private static Integer findLimitByTypeHierarchy(Map<String, Integer> map, Class<?> objectClass) {
		if (map == null || map.isEmpty() || objectClass == null) {
			return null;
		}
		for (Class<?> c = objectClass; c != null; c = c.getSuperclass()) {
			Integer direct = map.get(c.getName());
			if (direct != null) {
				return direct;
			}
			Integer limit = findInterfaceMatch(map, c.getInterfaces(), new HashSet<>());
			if (limit != null) {
				return limit;
			}
		}
		return null;
	}

	private static Integer findInterfaceMatch(Map<String, Integer> map, Class<?>[] interfaces, Set<Class<?>> visited) {
		if (interfaces == null) {
			return null;
		}
		for (Class<?> clazz : interfaces) {
			if (clazz == null || !visited.add(clazz)) {
				continue;
			}
			Integer v = map.get(clazz.getName());
			if (v != null) {
				return v;
			}
			Integer nested = findInterfaceMatch(map, clazz.getInterfaces(), visited);
			if (nested != null) {
				return nested;
			}
		}
		return null;
	}

	private static boolean isUnsafeType(Object obj) {
		return obj instanceof Thread ||
				obj instanceof ClassLoader ||
				obj instanceof BaseStream<?, ?> ||
				isIoStreamType(obj);
	}

	private static boolean isIoStreamType(Object obj) {
		String name = obj.getClass().getName();
		return name.startsWith("java.io.") || name.startsWith("java.nio.");
	}

	private static void appendJsonString(boolean quoted, StringBuilder out, String value) {
		if (value == null || "null".equals(value)) {
			out.append("null");
			return;
		}
		if (!quoted) {
			appendJsonStringContent(out, value);
			return;
		}
		out.append('"');
		appendJsonStringContent(out, value);
		out.append('"');
	}

	private static void appendJsonStringContent(StringBuilder out, String value) {
		for (int i = 0; i < value.length(); i++) {
			char c = value.charAt(i);
			switch (c) {
				case '"' -> out.append("\\\"");
				case '\\' -> out.append("\\\\");
				case '\b' -> out.append("\\b");
				case '\f' -> out.append("\\f");
				case '\n' -> out.append("\\n");
				case '\r' -> out.append("\\r");
				case '\t' -> out.append("\\t");
				default -> {
					if (c < 0x20) {
						out.append("\\u");
						String hex = Integer.toHexString(c);
						out.append("0".repeat(4 - hex.length()));
						out.append(hex);
					} else {
						out.append(c);
					}
				}
			}
		}
	}
}
