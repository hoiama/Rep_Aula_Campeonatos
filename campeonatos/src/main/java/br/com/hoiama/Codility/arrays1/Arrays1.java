package br.com.hoiama.codility.arrays1;

import java.util.*;

public class Arrays1 {
    public int solution2(int[] A){
        Set<Integer> set = new HashSet<>();
        for (int name : A) {
            if (!set.add(name)) {
               set.remove(name);
            }
        }
        return Integer.valueOf(set.toString().replaceAll("\\D" ,""));
    }
}

//https://app.codility.com/demo/results/trainingWRJ9PS-A7R/