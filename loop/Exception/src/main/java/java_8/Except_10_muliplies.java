package java_8;

public class Except_10_muliplies {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            if(i %10==0){
                System.out.println(" ");
                continue;
            }
            System.out.println(i);
        }
    }
}

