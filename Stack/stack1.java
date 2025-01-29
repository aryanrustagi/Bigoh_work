package Stack;

import java.util.*;

public class stack1 {
    public static String RemoveAdjacentElement(String s) {
            Stack<Character> st = new Stack<>();
    
            for(int i=0;i<s.length();i++){
                if(st.size()==0 || st.peek() != s.charAt(i)){
                    st.push(s.charAt(i));
                }else{
                    st.pop();
                }
            }
    
            char[] arr = new char[st.size()];
            for(int i=arr.length-1;i>=0;i--){
                arr[i] = st.pop();
            }
            return String.valueOf(arr);
        }
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            String s = scn.nextLine();
            System.out.println(RemoveAdjacentElement(s));
            scn.close();
    }
}