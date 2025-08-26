package day1;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SimpleWordCounter{
    public static void main(String[] args) {
        String paragraph = "The news today is about the rise in technology trends.";

        Map<String, Long> wordCounts = Arrays.stream(paragraph.split("\\s+"))
            .map(word -> word.replaceAll("[^a-zA-Z]", "").toLowerCase())
            .filter(word -> !word.isEmpty())
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        
        System.out.println("Word Frequencies: " + wordCounts);
    }
}