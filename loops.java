import java.util.*;

public class loops {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        // While Loop
        // System.out.print("Enter number : ");
        // int n = sc.nextInt();
        // int counter = 1;
        // int sum = 0;
        // while (counter <= n){
        //     System.out.print(counter+ " ");
        //     sum += counter;
        //     counter ++;
        // }
        // System.out.println("\nSum is : "+sum);

        // int i =0;
        // while (i <= 4){
        //     System.out.println("* * * *");
        //     i++;
        // }

        // For Loop
        // for (int i = 1; i<=4; i++){
        //     System.out.println("* * * *");
        //     }

        for (int i = 1; i<=6; i++){
            for (int j = 1; j<=i; j++){
                 System.out.print("* ");
              }
             System.out.println();
        }

        //  for (int i = 1; i<=5; i++){
        //      for (int j = 5; j>=i; j--){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // for (int i = 1; i <= 3; i++){
        //     for (int j = 1; j<=3; j++){
        //         System.out.println(i+ " " +j);
        //     }
        // }

        //do-while loop
        // int i = 1;
        // do{
        //     System.out.println(i+ " Hello");
        //     i++;
        // }while(i<=5);

        }
    }

