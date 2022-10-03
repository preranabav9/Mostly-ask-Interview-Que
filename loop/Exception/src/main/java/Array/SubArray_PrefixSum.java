package Array;

public class SubArray_PrefixSum {
    private static void getMaxSubArray(int[] arr) {
        int CurrSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        //calculate prefix array
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                CurrSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                if (maxSum < CurrSum) {
                    maxSum = CurrSum;
                }
            }
        }
        System.out.println("max sum = " + maxSum);
    }
    private static void kadnes(int[] arr) {
        int ms=Integer.MIN_VALUE;
        int cs=0;
        for(int i=0;i<arr.length;i++){
            cs=cs+arr[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs,ms);
        }
        System.out.println("kadane :" +ms);
    }

    public static void main(String[] args) {
        int[] arr = {-2,-3,4,-1,-2,1,5,-3};
        kadnes(arr);
        getMaxSubArray(arr);
    }


}

//time complexity = o(n^2)
//kaden time complexity =o(n)