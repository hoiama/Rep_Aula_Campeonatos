package br.com.hoiama.Codility.counting_elements;

import java.util.*;
import java.util.stream.Collectors;

public class PermCheck {



    // converter array para hasset e ver se retorna falso ao tentar passar valores repetidos, neste caso retorna logo zero.
    //após converter em hasset, verificar se dentro dele existe de 1 até o tamanho da lista, ex:
    // lista [0]3,  [1]2, [2]1  a lista correta deve ter tem de 1 até 3 (tamanho da lista)
    // correte incrementeando de 1 té o fim da lista e verificando cada incremento se esta contido no set, se algum der falso retorone 0


    public int solution(int[] A) {
        HashSet hashSet = new HashSet();

        for (int x = 0; x < A.length ; x++ ) {
            if(hashSet.add(A[x])) {
                return 0;
            }
        }


        return 1;
    }










    public int solution3(int[] A) {
        List<Integer> list  = Arrays.stream(A).boxed().collect(Collectors.toList());

        for (int atualValue = 0; atualValue < list.size() ; atualValue++ ) {
            if(list.contains(A[atualValue])) {
                list.remove(atualValue);
            } else{
                return 0;
            }
        }
        return 1;
    }








    public int solution2(int[] A) {
       List<Integer> list  = Arrays.stream(A).boxed().collect(Collectors.toList());
       int maxValue = Collections.max(list);

       for (int atualValue = maxValue; atualValue > 0 ; --atualValue ) {
            int finalAtualValue = atualValue;
            if(maxValue == 1 || ! list.contains(finalAtualValue)) {
                return 0;
            } else{
                list.remove(2);
            }
        }
        return 1;
    }

}
