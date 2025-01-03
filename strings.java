import java.util.*;

public class strings {

    public static boolean palindrome(String S1){
        for(int i = 0; i<S1.length()/2; i++){
            if(S1.charAt(i)!=S1.charAt(S1.length()-i-1)){
                return false;
            }
        }
        return true;
    }

    public static float shortestPath(String path){
        int x =0, y=0;
        for(int i=0; i<path.length(); i++){
            char dir = path.charAt(i);
            if(dir == 'N'){
                y++;
            }
            else if(dir == 'S'){
                y--;
            }
            else if(dir == 'E'){
                x++;
            }
            else{
                x--;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2+Y2);
    }

    public static String sub(String str, int si, int ei){
        String str1 = "";
        for(int i = si; i<ei; i++){
            str1 += str.charAt(i);
        }
        return str1;
    }

    public static void main(String args[]){

        // String path = "WNEENESENNN";
        // System.out.println(shortestPath(path));

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the String : ");
        // String S1 = new String();
        // S1 = sc.nextLine();
        //System.out.println(palindrome(S1));

        //Comparsion of Strings
        // String a = "Stark";
        // String b = "Stark";
        // String c = new String("Stark");
        // if(a==b){
        //     System.out.println("True");
        // }
        // else{
        //     System.out.println("False");
        // }
        // if(a==c){
        //     System.out.println("True");
        // }
        // else{
        //     System.out.println("False");
        // }

        // System.out.println(a.equals(c));

        //SubString
        String str = "HelloWorld!";
        System.out.println(sub(str, 4, 6));
        System.out.println(str.substring(2,6));

        // char[] ch={'j','a','v','a','t','p','o','i','n','t'}; 
        
        // // creation of string
        // String x = "HELLO";
        // String s=new String();

        // // Input in a string
        // Scanner sc = new Scanner(System.in);
        // s = sc.nextLine();

        // // to change string to lower case
        // System.out.println(s.toLowerCase());

        // //to find length of string
        // System.out.println(s.length());

        // String s1 = "Nakul";
        // String s2 = "Mishra";

        // // concatenation
        // String s4 = s1+s2;
        // String s3 = s1.concat(s2);
        // System.out.println(s3+" "+s4);

        // //to find characters from the string
        // for(int i =0; i<s3.length(); i++){
        //     System.out.print(s3.charAt(i)+" ");
        // }
        // String str = new String();
        // str = sc.nextLine();
        // System.out.println(str);
    }
}
