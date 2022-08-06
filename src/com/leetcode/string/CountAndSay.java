package com.leetcode.string;

public class CountAndSay {

    public static void main(String[] args) {
        CountAndSay c = new CountAndSay();
        String s = c.countAndSay(5);
    }

    public String countAndSay(int n) {
        String s = "1";
        for (int i = 0; i < n; i++) {
            s = nextNumber(s);
        }
        System.out.println(s);
        return s;
    }

    private String nextNumber(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int count = 1;
            while (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                i++;
                count++;
            }
            sb.append(count).append(s.charAt(i));
        }
        return sb.toString();
    }
}
