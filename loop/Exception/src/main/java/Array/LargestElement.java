package Array;

public class LargestElement {
    private static int largestElement(int[] arr) {
        int large = Integer.MIN_VALUE;
        int small =Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (large < arr[i]) {
                large = arr[i];
            }
            if(small > arr[i]){
                small =arr[i];
            }
        }
        System.out.println("smallest element : " +small);
   return large;
    }
        public static void main (String[]args){
            int[] arr = {1, 2, 6, 3, 5};
           int ele= largestElement(arr);
            System.out.println("largest element is: " +ele);
        }
    }
