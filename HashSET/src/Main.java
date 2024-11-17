import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        //Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(1);

        //print
        System.out.println(set);

        //search ---> contains method will return boolean
        if(set.contains(2)){
            System.out.println("Exist");
        }
        if(!set.contains(7)){  // here contains return false so ! -> will make false to true
            System.out.println("Not Exist");
        }

        //remove
        set.remove(3);
        System.out.println(set);

        //size
        System.out.println(set.size());

        //Iterator  --> It has two methods. hasNext->returns boolean && next-> returns next value
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}