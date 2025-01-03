import java.util.*;

public class binarytodecimal {
    
    public static void binary (int a){
        int pow = 0;
        int dec = 0;
        int num = a;
        
        while (num > 0){
            int ld = num%10;
            dec = dec + (ld * (int)Math.pow (2 ,pow));   // Math.pow(base , power) to find power of number

            pow++;

            num = num/10;
        }
        System.out.println("Decimal of "+a+" is : "+dec);
    }

    public static void main (String args[]){
        binary(1000);
    }
}
