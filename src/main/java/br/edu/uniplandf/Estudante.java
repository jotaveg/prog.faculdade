package br.edu.uniplandf;

public class Estudante {
    String nome;
    String sobrenome;
    String matricula;

    boolean matriculado = false;
    boolean presenca = false;

    void saudacoes(String nome){
        System.out.println("Seja bem vindo "+ nome);
    }
    void matricularAluno(boolean matriculado){
        matriculado = true;
    }
    void marcarPresenca(boolean presenca){
        presenca = true;
    }
}
