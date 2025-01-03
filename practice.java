import java.util.*;

public class practice {

    public static int sum() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number = ");
        int a = sc.nextInt();
        System.out.print("Enter second number = ");
        int b = sc.nextInt();

        int sum = a + b;
        System.out.println("Sum of numbers = " + sum);

        return sum;
    }

    public static void MAX_OF_3() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number = ");
        int x = sc.nextInt();
        System.out.print("Enter second number = ");
        int y = sc.nextInt();
        System.out.print("Enter third number = ");
        int z = sc.nextInt();

        System.out.print("Greatest number :");
        if (x > y) {
            if (x > z) {
                System.out.println(x);
            } else {
                System.out.println(z);
            }
        } else if (y > z) {
            System.out.println(y);
        } else {
            System.out.println(z);
        }
    }

    public static void prine() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean x = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                x = false;
            }
        }
        if (x == true) {
            System.out.println("PRIME");
        } else {
            System.out.println("Not PRIME");
        }
    }

    public static int natural_number() {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int val = 1;
        int sum = 0;
        while (val <= h) {
            sum += val;
            val++;
        }
        return sum;
    }

    public static void patterun() {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();

        for (int i = 1; i <= p; i++) {
            for (int j = 1; j <= p; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void evenoddsum() {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        int EvenSum = 0;
        int OddSum = 0;

        for (int j = 1; j <= r; j++) {
            System.out.print(j + " ");
        }
        System.out.println();

        for (int i = 1; i <= r; i++) {
            if (i % 2 == 0) {
                EvenSum = EvenSum + i;
            } else {
                OddSum = OddSum + i;
            }
        }
        System.out.println("Even NUmber sum =" + EvenSum);
        System.out.println("Odd NUmber sum =" + OddSum);
    }

    public static void factorial() {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();

        int fact = b;

        for (int i = 1; i < b; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial " + b + "! = " + fact);
    }

    public static void use(int age[]) {
        for (int i = 0; i < age.length; i++) {
            age[i] = age[i] + 1;
        }
    }

    public static int LS(int search[], int key) {
        for (int i = 0; i < search.length; i++) {
            if (search[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        // sum();
        // MAX_OF_3();
        // prine();
        // System.out.println(natural_number());
        // patterun();
        // evenoddsum();
        // factorial();

        int[] arr = {6,8,4,2,7};

        for(int i = 0; i < arr.length; i++) {
            for(int j = i; j < arr.length; j++) {
                for(int k=i; k<=j; k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }

        // Fibonacci Series
        // int a =0, b=1;
        // int sum=0;
        // for(int i=2; i<=7; i++){
        // sum = a+b;
        // a=b;
        // b=sum;
        // }
        // System.out.println(sum);

        // Ternary Operator
        // int u = 76 , v = 67;
        // boolean x = (u > v)?true : false;
        // System.out.println(x);
        // int y = (u > v)?u:v;
        // System.out.println(y);

        // Switch case
        // Scanner sc = new Scanner(System.in);
        // int week = sc.nextInt();
        // switch (week) {
        //     case 1:
        //         System.out.println("Monday");
        //         break;
        //     case 2:
        //         System.out.println("Tuesday");
        //         break;
        //     case 3:
        //         System.out.println("Wednesday");
        //         break;
        //     case 4:
        //         System.out.println("Thursday");
        //         break;
        //     case 5:
        //         System.out.println("Friday");
        //         break;
        //     case 6:
        //         System.out.println("Saturday");
        //         break;
        //     case 7:
        //         System.out.println("Sunday");
        //         break;
        //     default:
        //         System.out.println("Wrong Input");
        // }
        // sc.close();

        // EVEN NO. B/W 9 and 100
        // int n = 9;
        // while(n<=100){
        // if(n%2==0){
        // System.out.print(n+" ");
        // }
        // else{
        // System.out.print("");
        // }
        // n++;
        // }

        // PRINT REVERSE OF A NUMBER
        // Scanner sc = new Scanner(System.in);
        // int y = sc.nextInt();
        // while(y>0){
        // int ld = y%10;
        // System.out.print(ld);
        // y /= 10;
        // }

        // REVERSE THE GIVEN NUMBER
        // Scanner sc = new Scanner(System.in);
        // int z = sc.nextInt();
        // int rev = 0;
        // while (z>0) {
        // int last = z%10;
        // rev = (rev*10)+last;
        // z /= 10;
        // }
        // System.out.println(rev);

        // MULTIPLICATION TABLE
        // Scanner sc = new Scanner(System.in);
        // int h = sc.nextInt();
        // for(int i = 1; i<=10; i++){
        // int mul = h*i;
        // System.out.println(h+"*"+i+" = "+mul);
        // }

        // ARRAY
        // int namo[] = new int[5];
        // int asd[]={75,8,75,4,33,2,4,5};
        // System.out.println(namo.length);
        // System.out.println(asd.length);
        // int age[]={15,52,36,97,20,53};
        // use(age);
        // for(int j = 0; j<age.length;j++){
        // System.out.print(age[j]+" ");
        // }

        // LINEAR SEARCH
        // int search[]={72,81,64,36,16,9,42};
        // Scanner sc = new Scanner(System.in);
        // int key = sc.nextInt();
        // int index = LS(search, key);
        // if(index == -1){
        // System.out.println("No element Found");
        // }
        // else{
        // System.out.println("element found at index "+index);
        // }

        // LARGEST AND SMALLEST in ARRAY
        // int num[]={4, 12, 54, 23, 35, 71};
        // int largest = Integer.MIN_VALUE;
        // int smallest = Integer.MAX_VALUE;
        // for(int i = 0; i<num.length; i++){
        // if(largest<num[i]){
        // largest = num[i];
        // }
        // if(smallest>num[i]){
        // smallest = num[i];
        // }
        // }
        // System.out.println(largest);
        // System.out.println(smallest);

        // PAIR IN ARRAY
        // int pair[]={2,4,6,8,10,12};
        // for(int i = 0; i<pair.length; i++){
        // for(int j = i+1; j<pair.length; j++){
        // System.out.print("("+pair[i]+","+pair[j]+") ");
        // }
        // System.out.println();
        // }

        // PRINT SUB-ARRAY
        // int subarray[]={1,3,5,7,9,11};
        // for(int i =0; i<subarray.length; i++){
        // for(int j = i; j<subarray.length; j++){
        // for(int k = i; k<=j; k++){
        // System.out.print(subarray[k]+" ");
        // }
        // System.out.println();
        // }
        // System.out.println();
        // }
    }
}