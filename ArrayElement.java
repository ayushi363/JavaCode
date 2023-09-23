import java.util.Scanner;

public class ArrayElement {

    // Function to check if the given integer is present in the array
    public static boolean isIntegerPresent(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the integer to search for: ");
        int target = scanner.nextInt();

        boolean isPresent = isIntegerPresent(arr, target);

        if (isPresent) {
            System.out.println(target + " is present in the array.");
        } else {
            System.out.println(target + " is not present in the array.");
        }

        scanner.close();
    }
}
