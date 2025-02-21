package pepcoding;

import java.util.*;

public class findDuplicates {
    public static void duplicate(String st) {
        Map<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < st.length(); i++) {
            hm.put(st.charAt(i), hm.getOrDefault(st.charAt(i), 0) + 1);
        }

        for (Map.Entry<Character, Integer> mapElement : hm.entrySet()) {
            if (mapElement.getValue() > 1) {
                System.out.println(mapElement.getKey() + ", count = " + mapElement.getValue());
            }
        }
    }

    public static void main(String[] args) {
        String st = "Aryan";
        duplicate(st);
    }
}
