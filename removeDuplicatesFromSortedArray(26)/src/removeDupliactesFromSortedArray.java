import java.util.ArrayList;
import java.util.Arrays;

public class removeDupliactesFromSortedArray {

    public static void main(String[] args){
        int [] nums = {1,1,2};
        System.out.println(removeDuplicates(nums));
    }


    public static int removeDuplicates(int[] nums) {

        ArrayList<Integer> idk = new ArrayList<Integer>();
        int index=0;
        for(int i =0; i < nums.length;i++){
            for(int j =i+1; j < nums.length;j++){
                if(nums[i] == nums[j]){
                    nums[j] = 200;
                }

            }
            Arrays.sort(nums);
            if(nums[i] != 200 ){
                idk.add(nums[i]);
                index++;
            }
        }


        return index;
    }




}
