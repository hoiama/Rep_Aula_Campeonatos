package br.com.hoiama;

import br.com.hoiama.codility.arrays.OddOccurrencesInArray;
import br.com.hoiama.codility.counting_elements.PermCheck;
import br.com.hoiama.codility.iterations.BinaryGap;
import br.com.hoiama.codility.prefix_sums.PassingCars;
import br.com.hoiama.codility.time_complexity.FrogJmp;

public class Main {

    public static void main(String[] args){

        //Prefix_Sums
        PassingCars();

        //Arrays
        //OddOccurrencesInArray();

        //Conuting elements
        //PermCheck();

        //Time Complexity
        //FrogJmp();

        //Iterations
        //BinaryGap();
    }

    private static int list1[] = {4,1,3,2};
    private static int list2[] = {1,1};
    private static int list3[] = {4,1,3};
    private static int list4[] = {9, 5, 7, 3, 2, 7, 3, 1, 10, 8};
    private static int list5[] = {11,22,33,11,22,11,11};
    private static int list6[] = {0,1,0,1,1};

    public static void PassingCars(){
        PassingCars passingCars = new PassingCars();
        System.out.println(passingCars.solution(list6));
    }

    public static void BinaryGap(){
        BinaryGap binaryGap = new BinaryGap();
        System.out.println("Retorno de Solucion" + binaryGap.solution(74901729));
    }

    public static void FrogJmp(){
        FrogJmp frogJmp = new FrogJmp();
        System.out.println(frogJmp.solution(10, 85, 300));
    }

    public static void OddOccurrencesInArray(){
        OddOccurrencesInArray array = new OddOccurrencesInArray();
        System.out.println(array.solution(list5));
    }

    public static void PermCheck(){
        PermCheck permCheck = new PermCheck();
        System.out.println(permCheck.solution(list4));
    }
}
