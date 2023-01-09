package desafio03;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int fatorial;
        int num;

        System.out.print("Deseja o fatorial de qual número: ");
        fatorial = scan.nextInt();
        num = fatorial;

        if(fatorial == 0) {
            fatorial = 1;
        }

        for(int i=1; i<num; i++) {
            fatorial *= i;
        }
        System.out.println(num + "! = " + fatorial);
    }
}
