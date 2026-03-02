package br.edu.uniplandf;


import java.util.Scanner;

public class Matematicos {
    public static void main(String[] args) {
        //Uma classe para funções mais matemáticas
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

class Calculadora{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Escolha o primeiro número");
        int num1 = scanner.nextInt();
        System.out.println("Escolha o operador");
        char op = scanner.next().charAt(0);
        System.out.println("Escolha o segundo número");
        int num2 = scanner.nextInt();

        switch (op){
            case '+':
                System.out.println("Resultado: ");
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println("Resultado: ");
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println("Resultado: ");
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println("Resultado: ");
                System.out.println(num1 / num2);
                break;
            case '%':
                System.out.println("Resultado: ");
                System.out.println(num1 % num2);
                break;
            default:
                System.out.println("Operador inválido, tente denovo");

        }

    }
}

class ThermometerTest {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Temperature: ");
        int temperature = scanner.nextInt();

        if (temperature >=30){
            System.out.println("It's hot");
        }else if (temperature >=15){
            System.out.println("It's moderate");

        }else if (temperature<15){
            System.out.println("It's cold");
        }

    }
}

class OperatorsTest{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Type in a price");
        int price = scanner.nextInt();
        System.out.println("Type in a quantity");
        int quantity = scanner.nextInt();
        int calculus = price*quantity;
        boolean check = calculus>150;
        System.out.println("price * quantity = "+ calculus);
        System.out.println("check (greater than 150) = " + check);
    }
}