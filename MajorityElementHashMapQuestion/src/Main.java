import java.util.HashMap;

//Q. Given an integer array of size n, find all the elements that appear more than (n/3) times. n->size of the array.
public class Main {
    public static void majorityElement(int num[]){
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = num.length;
        //check if key already exist or not
        for(int i=0; i<n; i++){
            if(map.containsKey(num[i])) //return true
            {
                map.put(num[i], map.get(num[i])+1);  //if key exist then add 1 to increase the count
            } else{
                map.put(num[i], 1);  // if key doesnot exist then start count of number by 1
            }
        }
        //print key that exist more than n/3 times
        for(int key : map.keySet()){   //keySet will return the keys
            if(map.get(key) > n/3){
                System.out.println(key);
            }
        }
    }
    public static void main(String[] args) {
       int nums[] = {1,2,3,4,5,3,5,1,1,1};
       majorityElement(nums);
    }
}