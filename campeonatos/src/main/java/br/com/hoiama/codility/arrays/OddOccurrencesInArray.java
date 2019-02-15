package br.com.hoiama.codility.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddOccurrencesInArray {
    public int solution(int[] A){
       List<Integer> lista = Arrays.stream(A).boxed().collect(Collectors.toList());
        return lista
               .stream()
               .filter(element -> {
                   return Long.valueOf(1).equals(lista
                            .stream()
                            .filter(elementoFilter -> elementoFilter.equals(element))
                            .count());
               }).mapToInt(i -> i)
                 .findFirst().getAsInt();
    }
}