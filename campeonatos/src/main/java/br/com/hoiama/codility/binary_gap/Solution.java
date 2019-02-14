package br.com.hoiama.Codility.binary_gap;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public int solution(int N) {
        String binaryNumber = Integer.toBinaryString(N);
        Matcher matcher = Pattern
                .compile("(?<=1)0*(?=1+)")
                .matcher(binaryNumber);
        int maiorValor = 0;
        while (matcher.find()) {
           if(matcher.group().length() > maiorValor) {
               maiorValor = matcher.group().length();
           }
        }
        return maiorValor;
    }
}
