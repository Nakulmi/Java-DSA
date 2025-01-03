import java.util.*;

public class linearsearch {

//     public static int linearSearch(String[] array, String target) {
//         // Iterate through each element of the array
//         for (int i = 0; i < array.length; i++) {
//             // Check if the current element is equal to the target
//             if (array[i].equals(target)) {
//                 // Return the index if the target is found
//                 return i;
//             }
//         }

//         // Return -1 if the target is not found in the array
//         return -1;
//     }

//     public static void main(String[] args) {
//         String[] stringArray = {"apple", "banana", "orange", "grape", "kiwi"};
//         String target = "orange";

//         // Perform linear search
//         int result = linearSearch(stringArray, target);

//         // Display the result
//         if (result != -1) {
//             System.out.println("Target '" + target + "' found at index " + result);
//         } else {
//             System.out.println("Target '" + target + "' not found in the array");
//         }
//     }

    public static int select(String food[], String f){
        for (int i = 0; i<food.length; i++){
            if (food[i]==f){
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        String food[] = {"apple", "banana", "orange", "grape", "kiwi"};
        // Scanner sc = new Scanner(System.in);
        // String f = sc.next();
        String f = "kiwi";

        int result = select(food,f);
        if (result == -1){
            System.out.println("Not Found");
        }
        else{
            System.out.println("Item is found at index : "+result);
        }
    }
}
