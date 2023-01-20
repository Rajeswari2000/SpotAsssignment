package Question1;

import java.util.Stack;

public class Question1 {
    public static void main(String[] args) {
        String input  = "([a+b])";

        boolean answer = isValid(input);
        System.out.println(answer);

    }

    public static boolean isValid(String input){
        Stack<Character> stack = new Stack<>();
        int i;

        for(i=0;i<input.length();i++){
            char ch = input.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{'){
                stack.push(ch);
            }
            else if(ch==')'){
                if(stack.peek()=='('){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
            else if(ch=='}'){
                if(stack.peek()=='{'){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
            else if(ch==']'){
                if(stack.peek()=='['){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
            else if(Character.isAlphabetic(ch)) {
                if (input.charAt(i - 1) != '*' && input.charAt(i - 1) != '+' && input.charAt(i - 1) != '/' && input.charAt(i - 1) != '-') {
                    if (input.charAt(i + 1) != '*' && input.charAt(i + 1) != '+' && input.charAt(i + 1) != '/' && input.charAt(i + 1) != '-') {
                        return false;
                    }
                }
            }
            else if(ch=='*' || ch=='+' || ch=='/' || ch=='-'){
                if(!Character.isAlphabetic(input.charAt(i-1)) && !Character.isAlphabetic(input.charAt(i+1))){
                    return false;
                }


            }

        }

        if(stack.size()==0){
            return true;
        }
        else {
            return false;
        }

    }
}
