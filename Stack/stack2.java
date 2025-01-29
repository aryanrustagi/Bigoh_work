package Stack;

import java.util.Stack;

public class stack2 {
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                st.push(s.charAt(i));
            } else {
                
                if ((s.charAt(i) == ')' && st.peek() == '(') ||
                        (s.charAt(i) == '}' && st.peek() == '{') ||
                        (s.charAt(i) == ']' && st.peek() == '[')) {
                    st.pop();
                } else {
                    return false;
                }
            }
        }
        if(st.size()==0){return true;}
        else{return false;}
    }

    public static void main(String[] args) {
        String s = "[()[]{}]{}";
        System.out.println(isValid(s));
    }
}
