import java.util.Scanner;

public class AddThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int number1 = scanner.nextInt();

        System.out.println("Enter the second number:");
        int number2 = scanner.nextInt();

        System.out.println("Enter the third number:");
        int number3 = scanner.nextInt();

        int sum = number1 + number2 + number3;

        System.out.println("The sum of the three numbers is: " + sum);

        scanner.close();
    }
}
