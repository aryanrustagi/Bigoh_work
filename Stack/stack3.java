package Stack;
import java.util.*;

public class stack3 {
    public int[] astroidCollision(int[] astroids) {
        Stack<Integer> st = new Stack<>();
        for (int ast : astroids) {
            boolean destroyed = false;

            while (!st.isEmpty() && ast < 0 && st.peek() > 0) {
                if (Math.abs(ast) > st.peek()) {
                    st.pop();
                } else if (Math.abs(ast) < st.peek()) {
                    destroyed = true;
                    break;
                } else {
                    st.pop(); 
                    destroyed = true;
                    break;
                }
            }
            if (!destroyed) {
                st.push(ast);
            }
        }
        int[] result = new int[st.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = st.pop();
        }
        return result;
    }

    public static void main(String[] args) {
        stack3 obj = new stack3();
        int[] asteroids = {-10, 12, 16, -14, -18, -20, 24};
        System.out.println(Arrays.toString(obj.astroidCollision(asteroids)));
    }
}