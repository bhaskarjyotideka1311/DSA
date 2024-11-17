public class Main {

    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {

        int arr[] = {2,5,3,8,1};

        //Bubble sort
//        for(int i=0; i<arr.length-1; i++){
//            for(int j=0; j<arr.length-i-1; j++){
//                if(arr[j]>arr[j+1]){
//                    //Swap
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }

//        //Selection Sort
//        for(int i=0; i<arr.length-1; i++){
//            int smallest = i;
//            for(int j=i+1; j<arr.length; j++){
//                if(arr[smallest] > arr[j]){
//                    smallest = j;
//                }
//            }
//            //Swap
//            int temp = arr[smallest];
//            arr[smallest] = arr[i];
//            arr[i] = temp;
//        }

        //Insertion Sort
        for(int i=1; i<arr.length; i++){
            int current = arr[i];
            int j = i-1;
            while(j>=0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            //Placement
            arr[j+1] = current;
        }

        printArray(arr);
    }
}