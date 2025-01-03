package PracticeQuestions.Arrays;

public class TargetSum {

    public static int findTargetSumWays(int[] nums, int target){
        int neg =0;
        int count=0;
        int cool = nums.length;

        while(cool > 0){

            if(currSum(nums,neg) == target){
                count++;
            }
            neg++;
            cool--;
        }
        return count;
    }
    public static int currSum(int[] nums, int neg){
        int sum =0;
        for(int i =0; i<nums.length; i++){
            if(i == neg){
                sum -= nums[i];
            }
            else{
                sum += nums[i];
            }
        }
        return sum;
    }
    public static void main(String[] args){
        int nums[] = {1,1,1,1,1};
        int target = 3;

        System.out.println(findTargetSumWays(nums,target));
    }
}
