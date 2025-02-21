package String_tooeasy;

public class CharacterRemover {
    public static String removeCharacter(String str, char ch) {
        if (str.isEmpty()) {
            return str;
        }
        if (str.charAt(0) == ch) {
            return removeCharacter(str.substring(1), ch);
        }
        return str.charAt(0) + removeCharacter(str.substring(1), ch);
    }

    public static void main(String[] args) {
        String input = "banana";
        char ch = 'a';
        System.out.println(removeCharacter(input, ch));
    }
}