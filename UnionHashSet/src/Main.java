import java.util.HashSet;

//Q. make union of two arrays
public class Main {
    public static int unionArray(int arr1[], int arr2[]){
        HashSet<Integer> set = new HashSet<>();
        for (int i=0; i<arr1.length; i++){
            set.add(arr1[i]);
        }

        for (int j =0; j<arr2.length; j++){
            set.add(arr2[j]);
        }
        return set.size();
    }
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {2,5,6,7,8};
        System.out.println(unionArray(arr1,arr2));
    }
}