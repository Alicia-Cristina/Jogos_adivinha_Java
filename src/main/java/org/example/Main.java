package org.example;

import java.util.Scanner;

public class Main {public static void main(String[] args) {


    Scanner leitura = new Scanner(System.in);
    String pronto;
    int resposta;
    int tentativa;


    System.out.println("_______________________________");
    System.out.println("|     Jogo da Adivinhação     |");
    System.out.println("###############################");
    System.out.println();
    System.out.println("Regras do Jogo!");
    System.out.println("1- Vou pensar em um número");
    System.out.println("2- Você tenta adivinhar qual número estou pensando");
    System.out.println("3- Te informo se acertou ou não");
    System.out.println("Estã pronto para jogar? (s/n)");
    pronto = leitura.next();

    switch(pronto){
        case "s":
            resposta = 4;
            System.out.println("Qual número entre 0 e 10 estou pensando?");
            tentativa = leitura.nextInt();
            if(tentativa == resposta){
                System.out.println("Parabéns, você acertou");
            }else{
                System.out.println("Que pena, você errou!");
            }
            break;
        case "n":
            System.out.println("Até mais, então.");
            break;
        default:
            System.out.println("Opção Inválida");
    }



}

}