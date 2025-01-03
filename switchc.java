import java.util.*;

public class switchc {
    public static void main (String args[]){

        // int number = 2;

        // switch (number){
        //     case 1 : 
        //     System.out.println("Samosa");
        //     break;

        //     case 2 :
        //      System.out.println("burger");
        //     break;

        //     case 3 :
        //      System.out.println("mango");

        //     default :
        //      System.out.println("nothing");
        // }

        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter week number : ");
        // int number = sc.nextInt();

        // switch (number){
        //     case 1 : System.out.println("Monday");
        //     break;

        //     case 2 : System.out.println("Tuesday");
        //     break;

        //     case 3 : System.out.println("Wednesday");
        //     break;
           
        //     case 4 : System.out.println("Thursday");
        //     break;

        //      case 5 : System.out.println("Friday");
        //     break;

        //      case 6 : System.out.println("Saturday");
        //     break;

        //      case 7 : System.out.println("Sunday");
        //     break;

        //     default : System.out.println("Case Invalid");;
           
           
           
        // }

        // Break Statement
        // do{
        //     int i = sc.nextInt();
        //     System.out.println(i);
        //     if(i % 10 == 0){
        //         break;
        //     }
        // }while(true);

        // for (int i = 1; i<=3; i++){
        //     for (int j =1; j<=3; j++){
        //         if(i ==2 && j ==2){
        //             break;
        //         }
        //         System.out.println(i+" "+j);
        //     }
        // }

        // Continue Statement
        // for (int i = 1; i<=10; i++){
        //     if (i==5){
        //         continue;
        //     }
        //     System.out.println(i);
        // }

        // for (int i = 1; i<=3; i++){
        //     for (int j = 1; j<=3; j++){
        //         if (i==2 && j==2){
        //             continue;
        //         }
        //         System.out.println(i+" "+j);
        //     }
        // }
        while (true){
            System.out.print("Enter number : ");
            int i = sc.nextInt();
            if (i%10==0){
                continue;
            }
            System.out.println("Number was : "+i);
        }
        

    }
}
