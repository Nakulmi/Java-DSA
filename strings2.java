import java.util.*;

public class strings2 {

    public static String uppercase(String upper){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(upper.charAt(0));
        sb.append(ch);

        for (int i =1; i<upper.length();i++){
            if(upper.charAt(i)==' ' && i<upper.length()-1){
                sb.append(upper.charAt(i));
                i++;
                sb.append(Character.toUpperCase(upper.charAt(i)));
            }
            else{
                sb.append(upper.charAt(i));
            }
        }
        return sb.toString(); 
    }

    public static String compress(String str){
        String newStr = "";

        for(int i = 0; i<str.length(); i++){
            Integer count = 1;
            while (i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if(count > 1){
                newStr += count.toString();
            }
        }
        return newStr;
    }

    public static int lc(String lower){
        int count = 0;

        for(int i=0 ; i<lower.length(); i++){
            char ch = lower.charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        return count;
    }

    public static void main(String args[]){

        //String Compression
        // String str = "aaabbbbccdd";
        // System.out.println(compress(str));
        
        //Change First letter of each word to Uppercase
        // String upper = "hi i am nakul mishra";
        // System.out.println(uppercase(upper));

        // String fruits[] = {"mango","apple","banana","melon","grapes"};
        // String largest = fruits[0];

        // for(int i = 1; i<fruits.length; i++){
        //     if(largest.compareTo(fruits[i])<0){
        //         largest = fruits[i];
        //     }
        // }
        // System.out.println("The largest String is = "+largest);
        
        // String str1 = "mango";
        // String str2 = "apple";
        // System.out.println(str1.compareTo(str2));

        // Count Lowescase
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the String = ");
        // String lower = sc.nextLine();
        // System.out.print("Number of lowercase vowels = ");
        // System.out.println(lc(lower));

        // String str = "Attire rtiu".replace("t", "u");
        // System.out.println(str);

        // Two strings are Anagrams
        String str1 = "race";
        String str2 = "dare";

        str1.toLowerCase();
        str2.toLowerCase();

        if(str1.length()==str2.length()){
            char[] str1charArray = str1.toCharArray();
            char[] str2charArray = str2.toCharArray();

            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);
            
            boolean result = Arrays.equals(str1charArray, str2charArray);
            if(result){

                System.out.println("Anagrams");
            }
            else{
                System.out.println("Not Anagrams");
            }
        }
        else{
            System.out.println("Not Anagrams");
        }

        //String Buffer
        StringBuffer sb = new StringBuffer();
        sb.append("Hello");
        sb.append(" ");
        sb.append("world");
        System.out.println(sb);

        char boy[] = {'a','b','c','d'};
        String girl = boy.toString();

        System.out.println(girl);
    }
}
