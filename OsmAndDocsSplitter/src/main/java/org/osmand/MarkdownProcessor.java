package org.osmand;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MarkdownProcessor {

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java MarkdownProcessor <inputDir> <outputDir>");
            return;
        }

        Path inputDir = Paths.get(args[0]);
        Path outputDir = Paths.get(args[1]);
        if (!Files.isDirectory(inputDir)) {
            System.out.println("Input directory does not exist.");
            return;
        }

        try {
            processDirectory(inputDir, outputDir);
            System.out.println("Processing complete.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void processDirectory(Path inputDir, Path outputDir) throws IOException {
        Files.walk(inputDir)
                .filter(path -> Files.isRegularFile(path) && path.toString().endsWith(".md"))
                .forEach(file -> {
                    try {
                        processFile(file, inputDir, outputDir);
                    } catch (IOException e) {
                        System.out.println("Error processing file: " + file.toString());
                        e.printStackTrace();
                    }
                });
    }

    private static void processFile(Path file, Path inputDir, Path outputDir) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file.toFile()));
        StringBuilder currentContent = new StringBuilder();
        String currentTopicName = null;

        Path relativePath = inputDir.relativize(file.getParent());
        Pattern topicPattern = Pattern.compile("^(## |### )(?!\\[)(.+)");
        String line;
        while ((line = reader.readLine()) != null) {
            Matcher matcher = topicPattern.matcher(line);
            if (matcher.find()) {
                if (currentTopicName != null) {
                    writeToFile(outputDir, relativePath, file.toFile().getName(), currentContent.toString(), currentTopicName);
                }
                currentTopicName = matcher.group(2).trim();
                currentContent.setLength(0); // Clear content
            }
            currentContent.append(line).append(System.lineSeparator());
        }

        if (currentTopicName != null) {
            writeToFile(outputDir, relativePath, file.toFile().getName(), currentContent.toString(), currentTopicName);
        }
        reader.close();
    }

    private static String toFileName(String name) {
        return sanitize(name, "_") + ".md";
    }

    private static String sanitize(String name, String replacement) {
        // Replace or remove problematic characters including ':' and other special symbols
        name = name.trim();
        return name.replaceAll("[^a-zA-Z0-9_.-]", replacement)
                .replaceAll("[:*?\"<>|]", replacement)  // Additional special characters
                .replaceAll("_{2,}", replacement)
                .trim();
    }

    private static void writeToFile(Path outputDir, Path relativePath, String fileName, String content, String topic) throws IOException {
        if (content.length() - topic.length() <= 512)
            return;

        Path outputPath = outputDir.resolve(relativePath).resolve(toFileName(topic));
        Files.createDirectories(outputPath.getParent());
        content += "\nURL: https://osmand.net/docs/user/" + relativePath.toString().replace('\\', '/') + "/" + fileName.substring(0, fileName.length() - 3) + "#" + sanitize(topic, "-").toLowerCase();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath.toFile()))) {
            writer.write(content);
        }
    }
}
