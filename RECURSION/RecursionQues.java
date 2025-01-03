package RECURSION;

public class RecursionQues {
    //ALL OCCURENCES OF ELEMENTS IN AN ARRAY
    public static void allOccur(int arr[], int key, int n){
        if(n == arr.length){
            return;
        }
        if(arr[n] == key){
            System.out.print(n+" ");        
        }
        allOccur(arr, key, n+1);
    }
    //CONVERT NUMBER TO A STRING
    static String digits[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    public static void printDigits(int number){
        if(number == 0){
            return;
        }
        int lastDigit = number%10;
        printDigits(number/10);
        System.out.print(digits[lastDigit]+" ");
    }
    //LENGTH OF A STRING USING RECURSION
    public static int length(String str){
        if(str.length() == 0){
            return 0;
        }
        return length(str.substring(1))+1;
    }    
    public static void main(String args[]){
        String str = "nakul";
        System.out.println(length(str));

        // int number = 1234;
        // printDigits(number);

        // int arr[] = {3,2,4,5,6,2,7,2,2};
        // allOccur(arr, 5, 0);
    }
}
