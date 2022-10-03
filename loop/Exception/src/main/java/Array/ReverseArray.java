package Array;

public class ReverseArray {
    private static void getReverseArr(int[] arr) {
        int first = 0;
        int end = arr.length - 1;
        while (first < end) {
            int temp = arr[first];
            arr[first] = arr[end];
            arr[end] = temp;
            first++;
            end--;

        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 8};
        getReverseArr(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
//time complexity =o(n);
//space complexity=o(1);
