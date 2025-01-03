import java.util.*;

public class operator {
    public static void main (String args[]){


        // Binary Operator
        // int a = 25;
        // int b = 5;
        // System.out.println("Add : "+(a+b));
        // System.out.println("Sub : "+(a-b));
        // System.out.println("Mul : "+(a*b));
        // System.out.println("Div : "+(double)(a/b));
        // System.out.println("Mod : "+(a%b));  
        // System.out.println((double)(10*105+3-1*4/3));       


        // Unary Oeprator
        // int x = 25;
        // int y = ++x;

        //  int x = 25;
        // int y = x++;
        // System.out.println(x);
        // System.out.println(y);

        // int p = 17;
        // int q = --p;
        // System.out.println(p);
        // System.out.println(q);

        //  int p = 17;
        // int q = p--;
        // System.out.println(p);
        // System.out.println(q);

        // Relational Operators
        //     int m = 90;
        //     int n = 90;
        //     System.out.println(m!=n);

        // Logical Operators
        // System.out.println( (9<5) && (5<6));
        // System.out.println( (9>5) && (5<6));
        // System.out.println( (9<5) || (5>6));
        // System.out.println( !(5<6));

        // Assignment Operators
        // int a = 15;
        // System.out.println(a+=10);
        // System.out.println(a-=10);
        // System.out.println(a*=10);
        // System.out.println(a/=15);
        // System.out.println(a%=15);

        //Example
        // int x = 9, y = 12;
        // int a = 2, b = 4, c = 6;
        // int exp = 4/3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b*y);
        // System.out.println(exp);

        //Ternary operator
        // String type = (5%2==0) ? "even":"odd";
        // System.out.println(type);

        // int marks = 32;
        // String status = (marks > 33) ? "Pass" : "Fail";
        // System.out.println(status);
        int a = 63; int b = 36;
        boolean x = (a < b ) ? true : false;
        int y = (a > b ) ? a : b;

        System.out.println(x);
        System.out.println(y);
    }
}