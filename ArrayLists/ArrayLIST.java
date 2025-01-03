package ArrayLists;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLIST {
    public static void swap(ArrayList<Integer> list, int idx1, int idx2){
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }
    public static void main(String args[]){

        ArrayList<Integer> list = new ArrayList<>();

        // ADD ELEMENT
        list.add(1);
        list.add(8);
        list.add(3);
        list.add(7);
        list.add(5);
        list.add(6);

        // ADD ELEMENT at INDEX
        // list.add(3, 7);
        // System.out.println(list);

        // SORTING AN ARRAYLIST
        System.out.println(list);
        Collections.sort(list);   // ascending order
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder());  // descending order
        System.out.println(list);
        
        // SIZE OF LIST
        //System.out.println(list.size());

        // REVERSE OF AN ARRAYLIST
        // for(int i=list.size()-1; i>=0; i--){
        //     System.out.print(list.get(i)+ " ");
        // }

        // MAXIMUM IN ARRAYLIST
        // int maximum = Integer.MIN_VALUE;
        // for(int i = 0; i<list.size(); i++){
        //     maximum = Math.max(maximum, list.get(i));
        // }
        // System.out.println(maximum);

        // SWAP 2 NUMBER
        // int idx1 = 1, idx2 = 3;
        // System.out.println(list);
        // swap(list, idx1, idx2);
        // System.out.println(list);

        // GET ELEMENT
        // int element = list.get(5);
        // System.out.println(element);

        // REMOVE ELEMENT
        // list.remove(3);
        // System.out.println(list);

        // SET ELEMENT
        // list.set(4, 17);
        // System.out.println(list);

        // CONTAINS ELEMENT
        // System.out.println(list.contains(4));
        // System.out.println(list.contains(17));

    }
}
