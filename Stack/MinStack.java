package Stack;

import java.util.*;

class MinStack {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> min = new Stack<>();

    public MinStack() {
    }

    public void push(int val) {
        if (st.size() == 0) {
            st.push(val);
            min.push(val);
            return;
        }
        st.push(val);
        int temp = Math.min(val, min.peek());
        min.push(temp);
    }

    public void pop() {
        st.pop();
        min.pop();
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return min.peek();
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();

        minStack.push(11);
        minStack.push(10);
        System.out.println(minStack.getMin());

        minStack.push(12);
        minStack.push(7);
        System.out.println(minStack.getMin());

        minStack.pop();
        System.out.println(minStack.getMin());

        System.out.println(minStack.top());
    }
}
