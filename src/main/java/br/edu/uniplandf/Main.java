package br.edu.uniplandf;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {}
}

class OperatorsTest{
    public static void main(String[] args){
        int price = 25;
        int quantity = 4;
        int calculus = price*quantity;
        boolean check = calculus>150;
        System.out.println("price * quantity = "+ calculus);
        System.out.println("check (greater than 150) = " + check);
    }
}

class ThermometerTest {
    public static void main(String[] args){
        int temperature = 13;

        if (temperature >=30){
            System.out.println("It's hot");
        }else if (temperature >=15){
            System.out.println("It's moderate");

        }else if (temperature<15){
            System.out.println("It's cold");
        }

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

class ArraysExample{
    public static void main(String[] args) {
        int[] numbers = {15, 23, 8, 42, 16};
        int largest = numbers[0];
        int smallest = numbers[0];
        for (int i = 0;i<numbers.length;i++){
            if (numbers[i]>largest){
                largest = numbers[i];
            }
        }
        for (int i = 0;i<numbers.length;i++){
            if (numbers[i]<smallest) {
                smallest = numbers[i];
            }
        }
        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);
    }
}

class Score{
    public static void main(String[] args) {

        int[] subject= {85,92,78,88,81};
        int score = subject[0];
        char grade = 'D';
        if (score>=90){
            grade = 'A';
        }else if (score>=80){
            grade = 'B';
        }else if (score>=70){
            grade = 'C';
        }else if (score<70){
            grade = 'F';
        }
        System.out.println("Your grade: " + grade);


        for(int i = 0;i<subject.length;i++){
            if(score<70){
                System.out.println();
            }
        }
    }
}

class Cachorro{
    public static void main(String[] args) {
        String[] meusPets= {"paçoca", "aipim", "pitoco", "lasanha"};
        String[] acoes={" mordeu", " latiu para", " sorriu para", " aborreceu", " restaurou a união soviética com"};
        int listaPets = meusPets.length;
        int listaAcoes = acoes.length;
        int randPets = (int) (Math.random()*listaPets);
        int randAcoes = (int) (Math.random()*listaAcoes);

        String diaHoje= meusPets[randPets] + acoes[randAcoes];

        System.out.println("Hoje, "+ diaHoje + " o vizinho");
    }
}