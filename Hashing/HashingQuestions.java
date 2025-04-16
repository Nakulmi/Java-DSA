package Hashing;
import java.util.*;
public class HashingQuestions {

    // Method to check ANAGRAM
    public static boolean isAnagram(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> check = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            check.put(ch, check.getOrDefault(ch, 0)+1);
        }
        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            if(check.get(ch) != null){
                if(check.get(ch) == 1){
                    check.remove(ch);
                }
                else{
                    check.put(ch, check.get(ch)-1);
                }
            }
            else{
                return false;
            }
        }
        return check.isEmpty();
    }
    
    // Method to find FIrst city of Itinerary
    public static String startPoint(HashMap <String, String> map){
        HashMap <String, String> revMap = new HashMap<>();

        for (String key  : map.keySet()) {
            revMap.put(map.get(key), key);
        }
        for (String key : map.keySet()) {
            if(!revMap.containsKey(key)){
                return key;
            }
        }
        return null;
    }
    public static void main(String args[]){

        // //MAJORITY ELEMENT
        // int arr[] = {1,2,3,5,1,3,1,5,1};
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for (int i=0; i<arr.length; i++) {
        //     // if(map.containsKey(arr[i])){
        //     //     map.put(arr[i], map.get(arr[i])+1);
        //     // }
        //     // else{
        //     //     map.put(arr[i], 1);
        //     // }
        //     map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        // }
        // System.out.println(map);
        // //Set<Integer> keyset = map.keySet();
        // for (Integer key : map.keySet()) {
        //     if(map.get(key) > arr.length/3){
        //         System.out.println(key);
        //     }
        // }

        //VALID ANAGRAM
        // String s = "race";
        // String t = "car";
        // System.out.println(isAnagram(s, t));

        // Count Distinct Elemnts
        // int[] nums = {4,3,2,5,6,7,3,4,2,1};
        // HashSet<Integer> count = new HashSet<>();
        // for(int i=0; i<nums.length; i++){
        //     count.add(nums[i]);
        // }
        // System.out.println(count.size());
    
        // Union and Intersection of 2 Arrays
        // int[] arr1 = {7,3,9};
        // int[] arr2 = {6,3,9,2,9,4};
        // // For UNION
        // HashSet<Integer> union = new HashSet<>();
        // for(int i=0; i<arr1.length; i++){
        //     union.add(arr1[i]);
        // }
        // for(int j=0; j<arr2.length; j++){
        //     union.add(arr2[j]);
        // }
        // System.out.println("Union = "+union.size());
        // // For INTERSECTION
        // HashSet<Integer> intersection = new HashSet<>();
        // int count =0;
        // for(int i=0; i<arr1.length; i++){
        //     intersection.add(arr1[i]);
        // }
        // for(int j=0; j<arr2.length; j++){
        //     if(intersection.contains(arr2[j])){
        //         count++;
        //         intersection.remove(arr2[j]);
        //     }
        // }
        // System.out.println("Intersection = "+count);
    
        // Itinerary from Tickets
        // HashMap <String, String> map = new HashMap<>();
        // map.put("Chennai", "Bengaluru");
        // map.put("Mumbai", "Delhi");
        // map.put("Goa", "Chennai");
        // map.put("Delhi", "Goa");
        // String sp = startPoint(map);
        // System.out.print(sp);
        // for (String key : map.keySet()) {
        //     System.out.print("-> "+map.get(sp));
        //     sp = map.get(sp);
        // }

        // Largest Subarry with 0(zero) sum 
        // int[] arr = {15,-2,2,-8,1,7,10};
        // HashMap <Integer, Integer> map = new HashMap<>();
        // int sum = 0;
        // int len = 0;
        // for(int j=0; j<arr.length; j++){
        //     sum += arr[j];
        //     if(map.containsKey(sum)){
        //         len = Math.max(len, j-map.get(sum));
        //     }
        //     else{
        //         map.put(sum, j);
        //     }
        // }
        // System.out.println(len);

        // Count of Subarray Sum equal to K
        // int[] arr = {10,-2,2,-20,10};
        // int k = -10;
        // HashMap <Integer, Integer> map = new HashMap<>();
        // map.put(0, 1);
        // int sum=0;
        // int ans=0;
        // for(int j=0; j<arr.length; j++){
        //     sum += arr[j];
        //     if(map.containsKey(sum-k)){
        //         ans += map.get(sum-k);
        //     }
        //     map.put(sum, map.getOrDefault(sum, 0)+1);
        // }
        // System.out.println(ans);
    
        int[] arr = {2,7,11,15,25,27};
        int target = 26;

        HashMap <Integer, Integer> v = new HashMap<>();

        for(int j=0; j<arr.length; j++){
            int diff = target - arr[j];

            if(v.containsKey(diff)){
                System.out.println(j +" and "+v.get(diff));
                return;
            }
            v.put(arr[j], j);
        }
    }  
}
