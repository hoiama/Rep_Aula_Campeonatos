package br.com.hoiama.codility.iterations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BinaryGap {
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
