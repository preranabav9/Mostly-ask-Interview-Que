package Array;

public class BinarySearch {
    private static int getTheValue(int[] arr, int key) {
        int start =0 , end = arr.length-1;
        while(start <= end){
            int mid =(start +end)/2;
            if(arr[mid] == key){
              return mid;
            }
            if(arr[mid] < key){
                start =mid+1;
            }
            if(arr[mid] > key){
                end =mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr ={2,4,8,10,16,13};
        int key=10;
        System.out.println("index of our key " +getTheValue(arr,key));
    }
}
//time complexity = o(logn)