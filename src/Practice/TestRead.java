package Practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestRead {
    public static void test() {
        Scanner input = new Scanner(System.in);
        int v1 = input.nextInt();
        int v2 = input.nextInt();
        String line = input.nextLine();
        System.out.println(v1 + v2 + line);
    }
    public static void main(String[] args) {
        test();

        File file = new File("test.txt");

        try (Scanner input = new Scanner(file);)
        {
            while (input.hasNext()) {
                String firstName = input.next();
                String mi = input.next();
                String lastName = input.next();
                System.out.println(firstName + " " + mi + " " + lastName);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
