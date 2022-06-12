package Practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TestWrite {
    public static void main(String[] args) {
        File file = new File("test.txt");
        if (file.exists()) {
            System.out.println("File already exists");
            System.exit(0);
        }


        try (
                PrintWriter output = new PrintWriter(file);
                )
        {
            output.print("John T Smith");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
