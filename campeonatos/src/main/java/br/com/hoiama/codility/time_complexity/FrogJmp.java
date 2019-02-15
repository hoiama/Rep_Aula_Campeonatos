package br.com.hoiama.codility.time_complexity;

/**
 * https://app.codility.com/demo/results/trainingRAW4EU-W7M/
 */
public class FrogJmp {
    public int solution(int X, int Y, int D) {
        return (int) Math.ceil(( (double)Y - (double)X )/D);
    }
}
