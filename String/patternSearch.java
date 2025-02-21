package String;

class patternSearch {
    int search(String text, String pat) {
        // Create a combined string with a delimiter
        String s1 = pat + "#" + text;
        int[] lps = LPS(s1); // Calculate the LPS array
        for (int i = 0; i < s1.length(); i++) {
            if (lps[i] == pat.length()) {
                return 1;
            }
        }
        return 0;
    }

    public int[] LPS(String s) {
        int n = s.length();
        int[] lps = new int[n];
        int len = 0;
        int i = 1;
        lps[0] = 0;

        while (i < n) {
            if (s.charAt(i) == s.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }
}