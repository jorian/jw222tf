package jw222tf_assign3;

/**
 * Created by JorianWielink on 03/12/2016.
 */
public class TextAnalyzer {
    private String text;


    public TextAnalyzer(String str) {
        text = str;
    }

    public int charCount() {
        return text.length();
    }

    public int upperCaseCount() {
        int counter = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) >= 'A' && text.charAt(i) <= 'Z') {
                counter++;
            }
        }
        return counter;
    }

    public int whiteSpaceCount() {
        int counter = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                counter++;
            }
        }
        return counter;
    }

    public int digitCount() {
        int counter = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) >= '0' && text.charAt(i) <= '9') {
                counter++;
            }
        }
        return counter;
    }

    public boolean containsChar(char ch) {
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ch) {
                return true;
            }
        }
        return false;
    }

    public boolean containsString(String str) {
        return text.contains(str);
    }
}
