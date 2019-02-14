package br.com.hoiama.codility.counting_elements;

import java.util.*;

public class PermCheck {
    public int solution(int[] A) {
        int highest = A[0];
        Set hashSet = new HashSet();
        for (int index = 0; index < A.length; index ++) {
            if (A[index] > highest) highest = A[index];
            if(! hashSet.add(A[index])) return 0;
        }
        if(A.length != highest) return 0;
        return 1;
    }
}

//https://app.codility.com/demo/results/trainingBKZ9NP-J3D/