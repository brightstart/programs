package com.arrays.top50;

import java.util.Stack;

public class ReverseStrings {
    public String reverseWords(String s){
        Stack<String> stack = new Stack<>();
        String[] words = s.split(" ");
        for (String word : words) {
            if(!word.isEmpty())
                stack.push(word);
        }
        StringBuilder reverseString = new StringBuilder();
        while(!stack.empty())
            reverseString.append(stack.pop()).append(" ");
        return reverseString.toString().stripTrailing();
    }

    public static void main(String[] args){
        ReverseStrings rs = new ReverseStrings();
        System.out.println(rs.reverseWords("a good   example"));
    }
}
