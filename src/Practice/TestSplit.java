package Practice;

public class TestSplit {
    public static void main(String[] args) {
        String[] tokens = "Java,C?C#,C++".split("[.,:;?]");

        for (int i = 0; i < tokens.length; i++)
            System.out.println(tokens[i]);
    }
}
