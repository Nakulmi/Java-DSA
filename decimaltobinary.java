import java.util.*;

public class decimaltobinary {
    public static void decimal (int decNum){
        int pow = 0;
        int bin = 0;
        int a = decNum;
        while (decNum > 0){
            int rem = decNum % 2;
            bin = bin + (rem * (int)Math.pow (10 ,pow));
            pow++;

            decNum = decNum/2;
        } 
        System.out.print ("Binary number "+a+" is : "+bin);
    }

    public static void main (String args[]){
        decimal(7);
    
    }
}
