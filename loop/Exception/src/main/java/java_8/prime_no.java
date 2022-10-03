package java_8;

public class prime_no {
    public static boolean isPrime(int n) {
        if(n==2){
            return true;
        }
        for (int i = 2; i <=Math.sqrt(n); i++) {
            if (n % i == 0) {
              return false;
            }
        }
       return true;
    }
    private static void printInRange(int n) {
        for (int i=2;i<n;i++){
            if(isPrime(i)){
                System.out.println(i+ " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        printInRange(15);
    }


}
