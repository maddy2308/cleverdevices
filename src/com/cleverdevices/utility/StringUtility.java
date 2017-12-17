package com.cleverdevices.utility;

import java.util.HashSet;
import java.util.Set;

public class StringUtility {

    /**
     * The method reverses the order of words in a given sentence and treats space as the delimiter.
     * @param sentence
     *      A {@code String}
     * @return
     */
    public String reverseOrderOfWords(String sentence) {
        if (!isNullOrEmpty(sentence)) {
            StringBuilder sb = new StringBuilder();
            String[] arr = sentence.split("\\s");
            for (int i = arr.length - 1; i >= 0; i--) {
                sb.append(arr[i].trim()).append(" ");
            }
            return sb.toString().substring(0, sb.length() - 1);
        } else {
            return sentence;
        }
    }

    /**
     * The function takes 2 arguments, two strings to compare and find the commonality between them and return the
     * result. If any of the string is empty or null return an empty string
     * @param s1
     *      A {@code String}
     * @param s2
     *      A {@code String}
     * @return
     *      A {@code String}
     */
    public String findIntersectionOfTwoStrings(String s1, String s2) {
        if (isNullOrEmpty(s1) || isNullOrEmpty(s2)) {
            return "";
        } else {
            return findIntersectionOfTwoStrings(s1, s2, false);
        }
    }

    /**
     * The function takes 3 arguments, two strings to compare and find the commonality between them and return the result
     * and third a boolean argument that tells to treat lowercase and uppercase letters as same or not.
     * @param s1
     *      A {@code String}
     * @param s2
     *      A {@code String}
     * @param isUpperAndLowerCaseSame
     *      A {@code Boolean}
     * @return
     *      A {@code String}
     */
    private String findIntersectionOfTwoStrings(String s1, String s2, boolean isUpperAndLowerCaseSame) {
        String s1CaseDependent = s1, s2CaseDependent = s2;
        if (isUpperAndLowerCaseSame) {
            s1CaseDependent = s1.toLowerCase();
            s2CaseDependent = s2.toLowerCase();
        }
        Set<Character> set = createSet(s1CaseDependent);
        StringBuilder sb = new StringBuilder();
        for (char ch :  s2CaseDependent.toCharArray()) {
            if (set.contains(ch)) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    private Set<Character> createSet(String s) {
        Set<Character> set = new HashSet<>();
        for (char ch : s.toCharArray()) {
            set.add(ch);
        }
        return set;
    }

    private boolean isNullOrEmpty(String s) {
        return (s == null || s.length() == 0);
    }
}
