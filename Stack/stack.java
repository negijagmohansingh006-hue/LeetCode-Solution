import java.util.Stack;

public class stack{
    public static boolean check(String s){
        Stack<Character> stack = new Stack<>();

        for(int i =0 ; i < s.length(); i++){
            char ch = s.charAt(i);
            //opening braces
            if( ch == '('|| ch == '{' || ch == '['){
                stack.push(ch);
            }

            //closing brackit
            else if(ch == ')'|| ch == '}' || ch == ']'){
                if(stack.isEmpty()) return false;
                char top = stack.pop();
                if((ch == ')' && top != '(')||
            (ch == '}' && top != '{')||
        (ch == ']' && ch =='['))return false;

            }


        }
        return stack.isEmpty();
    }
    public static void main(String[] args){
        String sr = "(]";
        boolean ans = check(sr);
        if(ans)System.out.println("balance");
        else{
        System.out.println("not balnce");}

    }
}
