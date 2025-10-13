package com.strings.medium;

public class DecodedStringAtIndex {
    public String decodeAtIndex(String s, int k){
        if(k==1 || k==0)
            return String.valueOf(s.charAt(0));
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(!Character.isDigit(ch))
                sb.append(ch);
            else{
                int numOfRep = Integer.parseInt(String.valueOf(ch));
                numOfRep--;
                while(numOfRep>0) {
                    sb.append(sb);
                    numOfRep--;
                }
            }
        }
        if(k-1 <= sb.length())
            return String.valueOf(sb.charAt(k-1));
        else
            return "";

    }
    public static void main(String[] args){
        DecodedStringAtIndex decodedStringAtIndex = new DecodedStringAtIndex();
        System.out.println(decodedStringAtIndex.decodeAtIndex("a23", 6));
    }
}
