package jw222tf_assign3;

/**
 * Created by JorianWielink on 03/12/2016.
 */
public class TextAnalyzerMain {
    public static void main(String[] args) {
        String text = "My name is Anakin Skywalker. My age is 42.";
        TextAnalyzer ta = new TextAnalyzer(text);

        System.out.println("Char Count: "+ ta.charCount());
        System.out.println("Upper Case Count: "+ ta.upperCaseCount());
        System.out.println("Whitespace Count: "+ ta.whiteSpaceCount());
        System.out.println("Digit Count: "+ ta.digitCount());

        if (ta.containsChar('x'))
            System.out.println("The text contains char \'x\'");

        if (ta.containsString("nakin"))
            System.out.println("The text contains substring \"nakin\"");
    }
}
