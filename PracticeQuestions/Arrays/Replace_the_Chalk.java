package PracticeQuestions.Arrays;

class Replace_the_Chalk{
    public static int chalkReplacer(int[] chalk, int k) {
        int i =0;
        
        while (k>=0){
            if(chalk[i] > k){
                return i;
            }
            k = k-chalk[i];
            i++;
            if(i == chalk.length){
                i=0;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int chalk[] = {3,4,1,2};
        System.out.println(chalkReplacer(chalk, 25));
    }
} 