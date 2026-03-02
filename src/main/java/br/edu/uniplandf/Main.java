package br.edu.uniplandf;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {}
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
//teste
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

class Oraculo{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Eu sou o oráculo, diga a sua dúvida");
                String pergunta = scanner.nextLine();
                String[] respostas = {"Tudo indica que sim", "Não, jamais", "Açúcar em cubos", "Sem dúvidas, sim", "Sem dúvidas, não", "Eu não faria isso", "microondas eletrolux", "Talvez sim, Talvez não"};
                int gerarResposta = (int) (Math.random()*respostas.length);
                System.out.println(respostas[gerarResposta]);
                scanner.close();
    }
}

class Vidente{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Eu vou advinhar a sua idade em apenas dois passos");
        System.out.println("Primeiro eu quero que você pegue sua idade e multiplique por 10");
                int idade = scanner.nextInt();
                System.out.println("Agora eu quero que você me conte sua idade");
                        int menteAi = scanner.nextInt();
                System.out.println("Sua idade é: "+ idade/10);

    }
}

class Cadastro{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Informe sua matrícula");
        long matricula = scanner.nextLong();
        System.out.println("Informe seu nome");
        String nome = scanner.next();

        System.out.println("Você é o aluno "+nome+" de matrícula "+matricula);
        scanner.close();
    }
}