package br.edu.uniplandf;

import java.util.Scanner;

public class Random {
    public static void main(String[] args) {
        //Uma classe para brincar com a função Math.random ou só experimentos aleatórios
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