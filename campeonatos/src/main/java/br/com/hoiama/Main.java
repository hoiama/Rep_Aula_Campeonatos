package br.com.hoiama;

import br.com.hoiama.Codility.counting_elements.PermCheck;

public class Main {

    public static void main(String[] args){
//        Solution solution = new Solution();
//        System.out.println("REtorno de Solucion" + solution.solution(74901729));

//        int list[] = {11,22,33,11,22,11,11};
//        Arrays1 array = new Arrays1();
//        int retorno = array.solution2(list);
//        System.out.println(retorno);

        int list[] = {4,1,3,2};
        int list2[] = {1,1};
        int list3[] = {4,1,3};
        int list4[] = {9, 5, 7, 3, 2, 7, 3, 1, 10, 8};
        PermCheck permCheck = new PermCheck();
        int retorno = permCheck.solution(list4);
        System.out.println(retorno);
    }
}
