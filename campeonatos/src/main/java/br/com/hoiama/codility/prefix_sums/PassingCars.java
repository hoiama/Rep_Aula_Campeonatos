package br.com.hoiama.codility.prefix_sums;

import java.util.ArrayList;
import java.util.Arrays;

public class PassingCars {

    public int solution(int[] array) {
        int contador = 0;
        ArrayList arrayList = new ArrayList();
        for(int a = 0; a < array.length; a++){
            if(array[a] == 0){
                arrayList.add(a);
            }

//        for(int b = 0; b < array.length; b++){
//            int i = Integer.valueOf()arrayList.get(b) - array.length;
//
//        }
        }
        return contador;
    }


    public int solution3(int[] array) {
        int contador = 0;
        for(int a = 0; a < array.length; a++){
            if(array[a] == 0){
               contador += Arrays.stream(array, a, array.length).sum();
            }
        }
        return contador;
    }


    public int solution2(int[] A) {
        int contador = 0;
        for(int a = 0; a < A.length; a++){
            if(A[a] == 0){
                for(int b = a+1; b < A.length; b++){
                    if(A[b] == 1){
                        contador++;
                    }
                }
            }
        }
        return contador;
    }


}
