package desafio02;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] v = {5, 3, 2, 4, 7, 1, 0, 6, 11, 20, 22, 13, 15, 12};

        System.out.println("Vetor original :: " + Arrays.toString(v));


        for (int i = 0; i < v.length - 1; i++) {
            for (int j = 0; j < v.length - 1; j++) {
                int aux = 0;
                if (v[j] > v[j + 1]) {
                    aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;
                }
            }
        }

        System.out.println("Vetor ordenado :: " + Arrays.toString(v));
    }
}
