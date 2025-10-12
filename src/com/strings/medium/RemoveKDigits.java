package com.strings.medium;

import java.util.ArrayList;
import java.util.List;

/*
Given string num representing a non-negative integer num, and an integer k, return the smallest possible integer after removing k digits from num.



Example 1:

Input: num = "1432219", k = 3
Output: "1219"
Explanation: Remove the three digits 4, 3, and 2 to form the new number 1219 which is the smallest.
Example 2:

Input: num = "10200", k = 1
Output: "200"
Explanation: Remove the leading 1 and the number is 200. Note that the output must not contain leading zeroes.
Example 3:

Input: num = "10", k = 2
Output: "0"
Explanation: Remove all the digits from the number and it is left with nothing which is 0.
 */
public class RemoveKDigits {
    public static String removeKdigits(String num, int k) {
        if(num.isEmpty())
            return "0";
        if(k==0)
            return num;
        List<Integer> numbers = new ArrayList<>();
        for(int i=0 ; i+k<num.length(); i++){
            numbers.add(Integer.parseInt(num.substring(0, i)+num.substring(i+k)));
        }
        if(numbers.isEmpty())
            return "0";
        int min = numbers.getFirst();
        for(int number : numbers){
            if(number<min)
                min = number;
        }
        return String.valueOf(min);
    }

    public static void main(String[] args) {
        String res = removeKdigits("10200", 1);
        System.out.println(res);
    }
}
