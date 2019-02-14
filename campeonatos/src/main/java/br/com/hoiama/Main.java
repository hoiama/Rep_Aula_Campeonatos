package br.com.hoiama;

import br.com.hoiama.Codility.counting_elements.PermCheck;
import br.com.hoiama.Codility.time_complexity.Solution;

public class Main {

    public static void main(String[] args){
//        Solution solution = new Solution();
//        System.out.println("REtorno de Solucion" + solution.solution(74901729));

//        int[] list = {00,11,22,33,00,11,22};
//        Arrays1 array = new Arrays1();
//        System.out.println(array.solution(list));

//        Solution solution = new Solution();
//        int retorno = solution.solution(5, 105, 3);
//        System.out.println(retorno);

        int[] list = {4,1,3};
        PermCheck permCheck = new PermCheck();
        int retorno = permCheck.solution(list);
        System.out.println(retorno);
    }
}
