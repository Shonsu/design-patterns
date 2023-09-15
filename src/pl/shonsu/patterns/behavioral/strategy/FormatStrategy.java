package pl.shonsu.patterns.behavioral.strategy;

import java.util.List;

public interface FormatStrategy {
    String formatContent(List<String> paragraphs);
}
