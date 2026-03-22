public class palindrome {

    public static int palndrom(int nums){
        int rev_nums = 0;


        while(nums > 0){

            int digit = nums%10;
            rev_nums = (rev_nums*10)+digit;
            nums = nums/10;

        }
       
        System.out.println(rev_nums);
        return rev_nums;
    }


    public static boolean check(int i){
        if( i  >= 0 && i < 10) return true;

        if(i < 0 || i % 10 == 0) return false;

        int original = i;
        int reversed = palndrom(i);

        return original == reversed;
        

    }

    public static void main(String[] args){
        int x = 11;
        boolean ans =check(x);
        System.out.println(ans);


    }
    
}
