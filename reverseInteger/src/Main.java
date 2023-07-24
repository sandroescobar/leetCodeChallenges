public class Main {
    public static void main(String[] args) {

        int x = 123;
        System.out.println(reverse(x));


    }


    public static int reverse(int x) {
        long rev = 0;
        while(x !=0){
            int digit = x %10;
            rev = rev * 10 + digit;
            x/=10;
        }

        if(  rev <= -2147483648 ) { return 0;}
        else if(rev >= 2147483647 ){ return 0;}
        else {return (int) rev;}


    }
}