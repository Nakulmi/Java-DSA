package RECURSION;

public class Recursion2 {

    //TILING PROBLEM
    public static int tileProblem(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        int vertical = tileProblem(n-1);
        int horizontal = tileProblem(n-2);
        int total = vertical+horizontal;

        return total;
    }
    //REMOVE DUPLICATES FROM STRING
    public static void dupString(String str, int idx, StringBuilder newStr, boolean map[]){
        if( idx == str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar - 'a']==true){
            dupString(str, idx+1, newStr, map);
        }
        else{
            map[currChar - 'a']=true;
            dupString(str, idx+1, newStr.append(currChar), map);
        }
    }
    //n FRIEND PAIRING PROBLEM
    public static int friendPROBLEM(int n){
        if(n==1 || n==2){
            return n;
        }
        int single = friendPROBLEM(n-1);
        int pair = (n-1)*friendPROBLEM(n-2);
        int totWays = single + pair;
        return totWays;
    }
    
    public static void main(String args[]){
        System.out.println(friendPROBLEM(4));

        // String str = "appnacollege";
        // dupString(str, 0, new StringBuilder(""), new boolean[25]);

        // int n = 7;
        // System.out.println(tileProblem(n));
    }
}

