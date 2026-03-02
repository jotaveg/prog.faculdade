package br.edu.uniplandf;

import java.util.Arrays;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        //Uma classe para brincar com estruturas de repetição
    }
}

class LoopExample{
    public static void main(String[] args) {
        System.out.println("Counting:");
        int sum = 0;
        for (int i = 1; i <=10; i++) {
            System.out.println(i);
            sum = sum+i;

        }
        System.out.println("Sum: "+ sum);
    }
}

class Score{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Digite suas notas em sequência (5 notas)");
        int[] notas ={0,0,0,0,0};
        for (int i = 0;i<5;i++){
            System.out.println("Digite a nota "+ (i+1));
            notas[i] = scanner.nextInt();
        }
        int score = notas[0];
        char[] nota = {'D','D','D','D','D'};

        for (int i = 0;i<notas.length;i++) {
            score = notas[i];
            if (score >= 90) {
                nota[i] = 'A';
            } else if (score >= 80) {
                nota[i] = 'B';
            } else if (score >= 70) {
                nota[i] = 'C';
            } else if (score < 70) {
                nota[i] = 'F';
            }
        }
        System.out.println("Suas nota: " + Arrays.toString(nota));

    }
}
