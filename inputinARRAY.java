import java.util.*;

public class inputinARRAY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask the user for the size of the array
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        // Create an array of the specified size
        int[] arr = new int[size];

        // Input elements into the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        // Display the elements of the array
        System.out.println("Elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.println("Element " + (i + 1) + ": " + arr[i]);
        }
    }
}
