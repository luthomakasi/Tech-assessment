import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int limit = 10; // You can change this value to any desired limit
        sumOfMultiples(limit);
    }

    private static void sumOfMultiples(int limit) {
        int sum = 0;

        for (int i = 0; i < limit; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }

        System.out.println("The sum of multiples of 3 or 5 below " + limit + " is: " + sum);
    }
}
