public class findTheIndexOfTheFirstOccurenceInAString {

public static void main(String[] args){
    String fuckOff = "sadbutsad";
    String needle = "sad";
    System.out.println(strStr(fuckOff, needle));


}
    public static  int strStr(String haystack, String needle) {
        int idk = haystack.indexOf(needle);

        if( idk != -1){
            return idk;
        }
        else{
            return -1;
        }




    }


}
