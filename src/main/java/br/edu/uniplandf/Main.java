package br.edu.uniplandf;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}

class Teste{
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Pedro";
        estudante.matricula = "12345";
        System.out.println("nome: "+estudante.nome);
    }
}

class Cadastro{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Estudante aluno = new Estudante();
        System.out.println("Informe sua matrícula");
        aluno.matricula = scanner.next();
        System.out.println("Informe seu nome");
        aluno.nome = scanner.next();

        System.out.println("Você é o aluno "+aluno.nome+" de matrícula "+aluno.matricula);
        aluno.saudacoes(aluno.nome);
        scanner.close();
    }
}