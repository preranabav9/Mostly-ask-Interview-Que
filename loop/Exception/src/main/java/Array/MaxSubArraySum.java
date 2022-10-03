package Array;

public class MaxSubArraySum {
    private static void getMaxSubArray(int[] arr) {
        int CurrSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                CurrSum = 0;
                for (int k = i; k <= j; k++) {
                    CurrSum += arr[k];
                }
                System.out.println(CurrSum);
                if (maxSum < CurrSum) {
                    maxSum = CurrSum;
                }
            }
        }
        System.out.println("max sum = " + maxSum);
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        getMaxSubArray(arr);
    }
}


//Brute force approch
//time complexity = o(n^3)

