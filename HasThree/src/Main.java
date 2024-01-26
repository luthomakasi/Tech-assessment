public class Main {

    public static boolean hasThree(int num1, int num2) {
        // Check if either of the numbers is 3
        boolean hasThree = (num1 == 3 || num2 == 3);

        // Check if the sum contains a 3
        int sum = num1 + num2;
        while (sum > 0) {
            if (sum % 10 == 3) {
                hasThree = true;
                break;
            }
            sum /= 10;
        }

        return hasThree;
    }

    public static void main(String[] args) {
        // Example usage
        int number1 = 3;
        int number2 = 13;

        boolean result = hasThree(number1, number2);
        System.out.println(result); // Output: true
    }
}
