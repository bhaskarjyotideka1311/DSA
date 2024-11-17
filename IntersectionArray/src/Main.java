import java.util.HashSet;

//Q. Intersection of two array
public class Main {
    public static int intersectionArray(int arr1[], int arr2[]){
        HashSet<Integer> set = new HashSet<>();
        int count = 0;

        for(int i=0; i<arr1.length; i++){
            set.add(arr1[i]);
        }

        for (int j=0; j<arr2.length; j++){
            if(set.contains(arr2[j])){   //compare arr2 elements with set elements
                count++;   // if match element found then count
                set.remove(arr2[j]);   //remove the common element from set
            }
        }
        return count;
    }
    public static void main(String[] args) {

        int arr1[] = {1,2,3,4,5};
        int arr2[] = {2,5,6,7,8};
        System.out.println(intersectionArray(arr1,arr2));
    }
}