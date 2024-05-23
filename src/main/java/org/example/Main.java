package org.example;

import java.util.Scanner;

public class Main {public static void main(String[] args) {


    Scanner leitura = new Scanner(System.in);
    String pronto;
    int resposta = (int) Math.round(Math.random()*10);
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
              jogo_for();
              
            break;
        case "n":
            System.out.println("Não quer jogar? Ok.");
            break;
        default:
            System.out.println("Sério? Essa opção não existef");
       }

   }

   public static void jogo_for(){

       Scanner leitura = new Scanner(System.in);
       String pronto;
       int resposta = (int) Math.round(Math.random()*10);
       int tentativa;

       for(int contador = 0;contador<10;contador++){
           System.out.println("Qual número entre 0 e 10 estou pensando?");
           tentativa = leitura.nextInt();
           if(tentativa == resposta){
               System.out.println("Assim não tem graça, você acertou \uD83D\uDE12");
           }else{
               System.out.println("Que peninha, você errou \uD83E\uDD23");
               System.out.println("A resposta era "+resposta);
           }

           resposta = (int) Math.round(Math.random()*10);

       }


   }

}





