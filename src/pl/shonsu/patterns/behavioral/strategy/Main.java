package pl.shonsu.patterns.behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FormatStrategy formatStrategy = new CapitalAllWords();
        String s1 = "lorem ipsum dolor sit amet, fonsectetur adipiscing elit. fusce at nisi interdum nisi ultrices mattis. Sed nisi nibh, interdum id auctor at, scelerisque nec dolor. Praesent id libero diam. Nunc nec ligula in mauris commodo dapibus at at libero. Nulla ut dignissim massa. Donec vitae finibus eros. Aliquam quis aliquam leo, porta varius tellus. Mauris rhoncus velit eu dolor ullamcorper, id mollis felis facilisis. Maecenas eget sem eu augue aliquet elementum eleifend eu felis. Integer commodo ultrices scelerisque.";
        String s2 = "nullam sodales imperdiet scelerisque. praesent vel metus nisl. Sed quis tempus enim, vitae gravida neque. Phasellus auctor quam felis, sed tempus dui tempor quis. Fusce consequat metus quis orci efficitur imperdiet. Donec nisi ante, consequat ut quam non, rhoncus consectetur purus. Ut id lobortis neque. Nunc ornare orci a enim dapibus, vel viverra purus commodo. Nam malesuada diam vel scelerisque ullamcorper. Donec efficitur porttitor iaculis. Sed lacinia tincidunt sapien quis tincidunt. Nunc vel diam placerat, venenatis est eu, dapibus tortor.";
        String s3 = "Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Phasellus interdum felis quis commodo semper. Suspendisse elementum turpis et lectus molestie, nec accumsan massa malesuada. Quisque in mollis arcu. Sed at tellus enim. Cras tempus luctus nulla, sed iaculis urna condimentum vel. Maecenas in lacus quis massa hendrerit gravida ac a orci. Cras ut dictum velit. In vitae sapien porttitor, condimentum mauris gravida, ultricies est. Nunc id arcu quis dolor vehicula semper. Sed blandit bibendum vehicula.";
        String s4 = "quisque ultrices tortor in mauris interdum malesuada. pellentesque nibh nunc, bibendum a viverra ac, fringilla at lectus. aliquam ut sodales metus. Sed et augue nisi. Fusce eu sem mi. Nunc lacinia nisi vel dolor elementum, ornare ullamcorper ligula ullamcorper. Duis nec semper tellus, at convallis est. Mauris tristique efficitur maximus.";
        List<String> paragraphs = new ArrayList<>();
        paragraphs.add(s1);
        paragraphs.add(s2);
        paragraphs.add(s3);
        paragraphs.add(s4);

        String format = formatStrategy.formatContent(paragraphs);
        System.out.println(format);
        formatStrategy = new UpperCaseWords();
        System.out.println(formatStrategy.formatContent(paragraphs));
    }
}
