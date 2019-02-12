package br.com.hoiama.Codility.arrays1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Arrays1 {
    public int solution(int[] A){
       List<Integer> lista = Arrays.stream(A).boxed().collect(Collectors.toList());

       lista.stream().forEach(element -> {
             long quantidadeElements =  lista
                   .stream()
                   .filter(elementoFilter -> elementoFilter.equals(element))
                   .count();
             if(quantidadeElements == 1){
               return quantidadeElements;
             }
        });

        return 0;
    }
}
// comparar cada elemento com os demais da lista verificando repetições
// caso não encontre repedição retonar o elemento unico.

// https://javarevisited.blogspot.com/2012/11/4-ways-to-search-object-in-java-array-example.html