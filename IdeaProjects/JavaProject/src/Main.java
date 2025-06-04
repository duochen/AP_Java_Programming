//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int number = 25;
        int i;

        boolean isPrime = true;
        for (i = 2; i < number && isPrime; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }
        System.out.println("i is " + i + " isPrime is " + isPrime);
    }
}