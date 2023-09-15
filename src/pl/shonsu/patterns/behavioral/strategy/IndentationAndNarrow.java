package pl.shonsu.patterns.behavioral.strategy;

import java.util.List;

public class IndentationAndNarrow implements FormatStrategy {
    @Override
    public String formatContent(List<String> paragraphs) {
        StringBuilder sb = new StringBuilder();
        for (String paragraph : paragraphs) {
            StringBuilder tmp = new StringBuilder(paragraph.indent(4));
            int tmpLength = tmp.length();
            for (int i = 0; i < (tmpLength / 50); i++) {
                tmp.insert((i * 50) + 50 + i, "\n");
            }
            sb.append(tmp);
        }
        return sb.toString();
    }

}
