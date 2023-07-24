public class Main {
    public static void main(String[] args) {
    int x = 121;
        System.out.println(isPalindrome(x));



    }


    public static boolean isPalindrome(int x) {
        int k = x;
        int revesed = 0;
        int digit;
        while(k > 0){
            digit = k % 10;
            revesed = (revesed* 10) + digit;
            k /= 10;

        }
        if(x == revesed){
            return true;
        }
        else{
            return false;
        }
    }
}