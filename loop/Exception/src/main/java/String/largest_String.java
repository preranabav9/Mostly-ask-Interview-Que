package String;

public class largest_String {
    public static void main(String[] args) {
        String s[]={"apple","mango","banana"};
        String largest =s[0];
        for(int i=1;i< s.length;i++){

            if(largest.compareTo(s[i]) < 0){
                largest =s[i];
            }

        }
        System.out.println(largest);
}}


//lexiographically we check
//time complexity =using comapreo(x*n)


