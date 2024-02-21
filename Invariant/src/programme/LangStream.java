package programme;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LangStream<T> {
    private Stream<T> objStream = null;
    private IntStream intStream = null;

    LangStream(T element) {
        objStream = Stream.of(element);
    }

    <A, B> LangStream(LangStream<A> s1, LangStream<B> s2) {
        objStream = null;
    }

    LangStream(int[] array) {
        intStream = IntStream.of(array);
    }

    LangStream(int seed, IntUnaryOperator f) {
        intStream = IntStream.iterate(seed, f);
    }

    LangStream(int start, int end) {
        intStream = IntStream.range(start, end);
    }

    public LangStream<T> product() {
        return null;
    }

    public LangStream<T> reverse() {
        var array = intStream.toArray();
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return new LangStream<T>(array);
    }

    public LangStream<T> limit(int maxSize) {
        intStream = intStream.limit(maxSize);
        return this;
    }

    public LangStream<T> skip(int n) {
        intStream = intStream.skip(n);
        return this;
    }

    public LangStream<T> filter(IntPredicate predicate) {
        intStream = intStream.filter(predicate);
        return this;
    }

    public LangStream<T> map(IntUnaryOperator mapper) {
        intStream = intStream.map(mapper);
        return this;
    }

    public LangStream<T> flatMap(IntFunction<? extends IntStream> mapper) {
        intStream = intStream.flatMap(mapper);
        return this;
    }

    public int reduce(int identity, IntBinaryOperator op) {
        return intStream.reduce(identity, op);
    }

    public long count() {
        return intStream != null ? intStream.count() : objStream.count();
    }

    public int sum() {
        return intStream.sum();
    }

    public OptionalInt min() {
        return intStream.min();
    }

    public OptionalInt max() {
        return intStream.max();
    }

    public OptionalDouble average() {
        return intStream.average();
    }

    public OptionalInt findFirst() {
        return intStream.findFirst();
    }

    public OptionalInt findAny() {
        return intStream.findAny();
    }

    public boolean allMatch(IntPredicate predicate) {
        return intStream.allMatch(predicate);
    }

    public boolean anyMatch(IntPredicate predicate) {
        return intStream.anyMatch(predicate);
    }

    public boolean noneMatch(IntPredicate predicate) {
        return intStream.noneMatch(predicate);
    }

    public LangStream<T> groupingBy(Function<Integer, Integer> classifier, BinaryOperator<Integer> aggregator) {
        var map = intStream.boxed().collect(Collectors.groupingBy(classifier));
        var mapStream = map.entrySet().stream();
        intStream = mapStream.mapToInt((s) -> s.getValue().stream().reduce(0, aggregator));
        return this;
    }
}
