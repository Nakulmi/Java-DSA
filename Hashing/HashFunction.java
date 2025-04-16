package Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class HashFunction {
    public static void main(String[] args){

        //HashMap<String, Integer> hm = new HashMap<>();

        // PUT Operation - 
        // hm.put("Earth", 3);
        // hm.put("Mars", 4);
        // hm.put("Jupiter", 5);
        //System.out.println(hm);
        // hm.put("Mars", 2);
        // System.out.println(hm);

        //GET Operation -
        // int place = hm.get("Earth");
        // System.out.println(place);
        // System.out.println(hm.get("Venus"));

        //ContainsKey Operation - 
        // System.out.println(hm.containsKey("Jupiter"));
        // System.out.println(hm.containsKey("Venus"));

        // Remove Operation
        // System.out.println(hm.remove("Mars"));
        // System.out.println(hm);

        // Size Operation
        //System.out.println(hm.size());

        // ITERATION on HashMap
        HashMap<String, Integer> country = new HashMap<>();
        country.put("India", 100);
        country.put("China", 150);
        country.put("Nepal", 15);
        country.put("US", 50);
        country.put("Bhutan", 5);

        // System.out.println(country);
        // System.out.println(country.size());

        // Set<String> keys = country.keySet();
        //System.out.println(keys);

        //Using set
        // for (String k : keys) {
        //     System.out.println("Key - "+k+" , Value - "+country.get(k));
        // }

        //Using EntrySet
        for (Map.Entry<String,Integer> e : country.entrySet()) {
            System.out.println(e.getKey()+" , "+e.getValue());
        }
    }
}
