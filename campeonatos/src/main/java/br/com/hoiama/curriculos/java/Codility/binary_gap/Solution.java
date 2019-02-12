package br.com.hoiama.curriculos.java.Codility.binary_gap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int solution(int N) {
        String binaryNumber = Integer.toBinaryString(N);
        List<String> blockSeparetedByOnes = new ArrayList<>(Arrays.asList(binaryNumber.split("([^0][1]*[^0]|[1])")));

        System.out.println("numero" + binaryNumber);
        System.out.println("quantidade de blocos: " + blockSeparetedByOnes);

        if(blockSeparetedByOnes.size() > 0 ){
            blockSeparetedByOnes = blockSeparetedByOnes.subList(1, blockSeparetedByOnes.size() - 1);
            System.out.println("quantidade de blocos: " + blockSeparetedByOnes);
            return blockSeparetedByOnes.stream().map(block-> block.length()).reduce(0, (element1, element2) -> element1 > element2 ? element1 : element2);
        }
        return 0;
    }
}

//1 - pegar o numero e cocverter em binario
//2 - blocar nos pontos em que houver 1
//3 - remover o inicio e o final do array
//3 - pegar os blocos que sobraram e retornar o maior deles