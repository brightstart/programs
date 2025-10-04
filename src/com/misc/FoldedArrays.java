package com.misc;
//Your goal is to fold that array twice
//[1, 2, 3, 4, 5] -> [6, 6, 3] -> [9, 6]
//[1,2,3,4,5,6,7] -> [16,12]

import java.util.Arrays;

public class FoldedArrays {

    public static void main(String []args){

        FoldedArrays cb = new FoldedArrays();

        int []arr = {1, 2, 3, 4, 5} ;

        System.out.println(Arrays.toString(cb.fold(cb.fold(arr))));

    }

    public int[] fold(int[] arr){

        int foldedLength = (arr.length / 2 ) + 1;

        int[] folded = new int[foldedLength];

        for(int i = 0, j = arr.length - 1, f = 0; i<=j ; i++, j--, f++){
            folded[f] = arr[i] + arr[j];
            if(i==j)
                folded[f] = arr[i];
        }
        return folded;
    }


}
