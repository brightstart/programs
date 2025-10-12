package com.arrays.top50;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class MaximizeProfit {
    public static void main(String[] args) {
        MaximizeProfit mp = new MaximizeProfit();
        System.out.println(mp.maxProfit(new int[]{7,1,5,3,4}));
    }

    public int maxProfit(int[] prices) {

        List<Map<Integer, Integer>> buySellPairList = new ArrayList<>();
        AtomicInteger maxProfit = new AtomicInteger();
        for(int i = 1 ; i<prices.length ; i++){
            Map<Integer, Integer> buySellPair = new HashMap<>();
            if(prices[i] > prices[i-1])
                buySellPair.put(prices[i-1], prices[i]);
            if(!buySellPair.isEmpty())
                buySellPairList.add(buySellPair);
        }

        for(Map<Integer, Integer> buySellPair : buySellPairList){
            buySellPair.forEach((key,value) -> {
                maxProfit.addAndGet(value-key);
            });
        }
        return maxProfit.get();


    }
}
