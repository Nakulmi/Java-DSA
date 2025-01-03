import java.util.*;

public class pattern {
    public static void main(String args[]){
        // System.out.println("****");
        // System.out.println("***");
        // System.out.println("**");
        // System.out.println("*");

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        // for(int i =1; i<=a; i++){
        //     for (int j=1; j<=i; ++j){
        //         System.out.print("* ");
        
        //     }
        //     System.out.println();
        // }

        // for (int i=1; i<=a; i++){
        //     for(int j=a; j>=i; j--){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // for (int i=1; i<=a; i++){
        //     for (int j=1; j<=i; j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }

        char ch = 'A';
        for (int i=1; i<=a; i++){
            for (int j=1; j<=i; j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
    
}
