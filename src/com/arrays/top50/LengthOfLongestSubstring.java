package com.arrays.top50;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {

    public static void main(String[] args) {
        LengthOfLongestSubstring ls = new LengthOfLongestSubstring();
        int length = ls.lengthOfLongestSubstring("bab");
        System.out.println(length);
    }

    public int lengthOfLongestSubstring(String s) {

        if(s.isEmpty())
            return 0;
        else {
            int left = 0;
            int maxLen = 0;
            Set<Character> nonRep = new HashSet<>();
            for (int right = 0; right < s.length(); right++) {
                while (nonRep.contains(s.charAt(right))) {
                    nonRep.remove(s.charAt(left));
                    left++;
                }
                nonRep.add(s.charAt(right));
                maxLen = Math.max(maxLen, right - left + 1);
            }
            return maxLen;


        }
    }
}
