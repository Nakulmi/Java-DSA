import java.util.*;

public class oddeven {
    public static void main (String args[]){

        Scanner sc = new Scanner (System.in);
        // System.out.print("Enter the number : ");
        // long num = sc.nextInt();

        // if(num % 2 == 0){
        //     System.out.println("Number is EVEN");
        // }
        // else{
        //     System.out.println("Number is ODD");
        // }

        System.out.print("Enter the Number of Integers : ");
        int count = sc.nextInt();

        int even = 0;
        int odd = 0;

        System.out.println("Enter "+count+" integers, one at a time");

        for (int i = 0; i<count; i++){
            int n = sc.nextInt();

            if (n%2==0){
                even += n;
            }
            else{
                odd += n;
            }
        }

        System.out.println("Sum of EVEN intergs: "+even);
        System.out.println("Sum of ODD intergs: "+odd);
        
        }
    }

    

