package Array;

public class PrimeNo {
    private static boolean isPrimeNo(int no) {
        if(no <=1)
        {
            return false;
        }
        for(int i=2;i<no-  1;i++){
            if(no % i == 0){
                return true;

            }
        }
        return false;
    }
    public static void main(String[] args) {
        int no=5;
        System.out.println(isPrimeNo(no));
    }


}
