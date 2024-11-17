import java.util.HashMap;

public class Main {
    public static String getStart(HashMap<String, String> tick){
        HashMap<String,String> reverseMap = new HashMap<>();
        for(String key: tick.keySet()){
            reverseMap.put(tick.get(key), key);
        }

        for(String key : tick.keySet()){
            if(!reverseMap.containsKey(key)){
                return key;
            }
        }

        return null;
    }
    public static void main(String[] args) {
        HashMap<String,String> tickets = new HashMap<>();
        tickets.put("Mumbai","Delhi");
        tickets.put("Chennai","Bangalore");
        tickets.put("Delhi","Goa");
        tickets.put("Goa","Chennai");

        String start = getStart(tickets);
        while(tickets.containsKey(start)){
            System.out.print(start + "->");
            start = tickets.get(start);
        }
        System.out.println(start);
    }
}