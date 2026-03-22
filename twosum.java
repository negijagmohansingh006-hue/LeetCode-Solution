import java.util.Arrays;

public class twosum{

    public static int[] twosu(int[] nums,int target){
        
        for(int i = 0; i < nums.length; i++){

            for(int j = i+1; j <nums.length; j++){

                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }

        return new int[]{0,0};
    }
    public static void main(String[] args){

        int[] nums = {10,20,43,65};
        int target = 30;

        int[] check = new int[2];
        check = twosu(nums,target);

        System.out.println(Arrays.toString(check));






    }
}