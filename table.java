import java.util.*;

public class table {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Display the Table of: ");
        int num = sc.nextInt();
        int a = num;

        for (int i =1; i<=10; i++){
            
            System.out.println(""+num+" * "+i+ " = "+(a*i));
        }
    }
}
