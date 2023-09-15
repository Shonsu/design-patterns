package pl.shonsu.patterns.behavioral.strategy;

import java.util.List;
import java.util.regex.Pattern;

public class UpperCaseWords implements FormatStrategy{
    @Override
    public String formatContent(List<String> paragraphs) {
        StringBuilder sb = new StringBuilder();
        for (String paragraph : paragraphs) {
            String[] split = paragraph.strip().split("\\.");
            Pattern compile = Pattern.compile("\\b(\\w)");
            for (String s : split) {
                s = s.strip();
                String tmp = compile.matcher(s).replaceAll(matchResult -> matchResult.group().toUpperCase());
                sb.append(tmp).append(". ");
            }
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }
}
