public class Main {

    // Factorial of a number n (denoted as n!) is defined as:
    // n! = n × (n - 1)!
    // 0! = 1 (base case)
    // Recursive method to calculate factorial
    public static int factorial(int n) {
        if (n == 0) {
            return 1; // base case
        } else {
            return n * factorial(n - 1); // recursive case
        }
    }

    public static void main(String[] args) {
        int number = 5;
        int result = factorial(number);
        System.out.println(number + "! = " + result); // Output: 5! = 120
    }
}