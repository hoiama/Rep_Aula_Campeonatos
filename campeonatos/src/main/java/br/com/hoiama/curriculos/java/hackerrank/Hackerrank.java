package br.com.hoiama.curriculos.java.hackerrank;

import java.util.Scanner;

public class Hackerrank {

    // Complete the solve function below.
    static void solve(double meal_cost, int tip_percent, int tax_percent) {
    	double tip = meal_cost * (double) tip_percent/100;
    	double tax = meal_cost * ((double) tax_percent/100);
    	double total = Math.floor(meal_cost + tip + tax);
    	System.out.printf("The total meal cost is %f dollars.", total);
    	System.out.println(tip);
    	System.out.println(tax);
    	System.out.println(Math.rint(total));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}
