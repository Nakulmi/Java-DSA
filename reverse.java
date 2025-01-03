import java.util.*;

public class reverse {
    public static void main(String args[]){

       // Print reverse of a number
        int i = 10899;
        while (i > 0){
            int lastdigit = i%10;          // modulo by 10 to get the last digit of a number
            System.out.print(lastdigit);
            i = i/10;                      // divide by 10 to remove the last digit of a number
        }

        // Reverse the given number
        int j = 1452;
        int rev = 0;

        while (j > 0){
            int last = j%10;
            rev = (rev * 10) + last;      // Logic to reverse the given number
            j /= 10;
        } 
        System.out.println(" " +rev);
    }
}
