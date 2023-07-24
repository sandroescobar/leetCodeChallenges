public class removeElements {

public static void main(String[] args){
    int [] nums = {3,2,2,3};
    int val = 3;
    System.out.println(removeElement(nums, val));


}
    public static int removeElement(int[] nums, int val) {

        int count =0;
        int numLength =0;

        for(int i =0;i < nums.length;i++){
            if(nums[i] == val){
                numLength -= 1;
                nums[i] = 95;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 95)
                nums[count++] = nums[i];
        }
        while (count < nums.length)
            nums[count++] = 95;



        int index =0;
        for(int i =0; i < nums.length;i++){
            if(nums[i] != 95){
                index++;
            }
        }

        return index;
    }

}
