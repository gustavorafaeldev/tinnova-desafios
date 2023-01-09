package desafio04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num;
        int soma = 0;

        System.out.print("Digite um número (Serão verificados os números abaixo dele) : ");
        num = scan.nextInt();
        List<Integer> multiplos = new ArrayList<>();

        for(int i=1; i<num; i++) {
            if(i % 3 == 0 || i % 5 == 0) {
                multiplos.add(i);
                soma += i;
            }
        }

        System.out.println("Os múltiplos de 3 ou 5 entre 1 à "+ (num-1) + " são: " + multiplos);
        System.out.println("E a soma entre eles é de: " + soma);
    }
}
