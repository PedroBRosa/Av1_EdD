package Pergunta3;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int menu = 0;
        Scanner ler = new Scanner(System.in);
        Deque<PostRedeSocial> deque = new LinkedList<PostRedeSocial>();
        String msg;
        byte relevancia;
        while (menu != 3) {
            System.out.println("============= MENU =============");
            System.out.println("1 - Cadastrar Post");
            System.out.println("2 - Visualizar Posts Relevantes");
            System.out.println("3 - Sair");
            System.out.println("==============================================");
            System.out.println("==Por gentileza escolha uma opção de [1-3]: ==");
            System.out.println("==============================================");
            menu = ler.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("============= Cadastrar Post =============");
                    System.out.println("Escreva seu post: ");
                    msg = ler.next();
                    System.out.printf("\nDigite:\n1 _ para relevante\n2_ para não relevante\n");
                    relevancia = ler.nextByte();
                    if(relevancia==1){
                        PostRedeSocial postRedeSocial = new PostRedeSocial(msg,relevancia);
                        deque.addFirst(postRedeSocial);
                    }else{
                        PostRedeSocial postRedeSocial = new PostRedeSocial(msg,relevancia);
                        deque.addLast(postRedeSocial);
                    }
                    break;
                case 2:
                    System.out.println("============= Visualizar Posts Relevantes =============");
                    for (PostRedeSocial postRedeSocial:deque) {
                        if(postRedeSocial.getRelevancia()==1){

                            System.out.println("Post Relevante: "+postRedeSocial.getMsg());
                        }
                    }
                    break;
                case 3:
                    System.out.println("SISTEMA ENCERRADO!");
                    break;
                default:
                    System.out.println("Opção Invalida!");
                    break;

            }
        }


    }
}
