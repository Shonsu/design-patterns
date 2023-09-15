package pl.shonsu.patterns.behavioral.strategy;

import java.util.List;
import java.util.stream.Collectors;

public class CapitalAllWords implements FormatStrategy {
    @Override
    public String formatContent(List<String> paragraphs) {
        return paragraphs.stream().map(String::toUpperCase).collect(Collectors.joining("\n"));
    }
}
