package String;

public class reverseString {
    public static String reverse(String s){
        char[] ch = s.toCharArray();
        int left = 0;
        int right = s.length()-1;
        int mid = (left+right)/2;
        while(left<mid){
            char temp = ch[left];
            ch[left] = ch[mid];
            ch[mid] = temp;
            left++;
            mid--;
        }
        return String.valueOf(ch);
    }
    public static void main(String[] args) {
        String s = "abhishek";
        System.out.println(reverse(s));
    }
}