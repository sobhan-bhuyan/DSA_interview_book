package com.sobhan.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class incrementArbitraryPrecisionInteger {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(9);
        list.add(9);
        list.add(9);
        plusOne(list);

        for (Integer integer : list) {
            System.out.println(integer);
        }

    }

    @SuppressWarnings("UnusedReturnValue") //suppressing the return value not used check in the below function
    public static List<Integer> plusOne(List<Integer> list) {
        int n = list.size() - 1;
        list.set(n, list.get(n) + 1);

        for (int i = n; i > 0 && list.get(i) == 10; --i) {   //if the last digit becomes 10 then we carry over the 1 towards the left
            list.set(i, 0);
            list.set(i - 1, list.get(i - 1) + 1);
        }
        if (list.get(0) == 10) {    //if the most significant digit becomes 10 then we add a 1 to the most significant place and shift everything right
            list.set(0, 0);
            list.add(0, 1);

        }
        return list;

    }
}
