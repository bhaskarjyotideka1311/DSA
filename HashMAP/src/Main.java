import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Key->Country && Value->population
        HashMap<String,Integer> map = new HashMap<>();

        //Insert
        map.put("India",120);
        map.put("China",200);
        map.put("SriLanka",80);

        //print
        System.out.println(map);

        map.put("China", 250);  // It will update the value of China
        System.out.println(map);

        //Searching
        if(map.containsKey("China")){    // containsKey returns boolean
            System.out.println("Exist");
        } else {
            System.out.println("Not Exist");
        }

        System.out.println(map.get("China"));  // print the value of that key
        System.out.println(map.get("Pakistan")); // if not exist then it prints null

        //Iteration 1
        for(Map.Entry<String,Integer> e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        //Iteration 2
        Set<String> keys = map.keySet();
        for(String s : keys){
            System.out.println(s + " " + map.get(s));
        }

        // Remove
        map.remove("China");
        System.out.println(map);
    }
}