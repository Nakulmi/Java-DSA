import java.util.Scanner;

public class mm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array of the specified size
        int[] arr = new int[size];

        // Input elements into the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // Display the elements of the array
        System.out.println("Elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.println("Element " + (i + 1) + ": " + arr[i]);
        }

        scanner.close(); // Close the scanner to prevent resource leak
    }
}
