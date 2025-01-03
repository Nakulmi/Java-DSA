package PracticeQuestions.Strings;

class PracticeStrings{
    public static void main(String args[]){
        String str = "i=like=this=program";
        String ans = "";
        String[] arr = str.split("\\=");
        for(int i = arr.length-1; i>=0; i--){
            if(i==0){
                ans += arr[i];
            }else{
                ans += arr[i] + ".";
            }
        }
        System.out.println(ans);
    }
}