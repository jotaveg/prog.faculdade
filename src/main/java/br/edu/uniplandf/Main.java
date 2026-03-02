package br.edu.uniplandf;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
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