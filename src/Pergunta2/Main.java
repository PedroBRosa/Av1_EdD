package Pergunta2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Stack pilha1 = new Stack();
        Stack pilha2 = new Stack();
        Stack pilha3 = new Stack();

        Scanner p1 = new Scanner(new File("C:\\Users/pbrit/OneDrive/ProvaEstruturaDeDados/src/Pergunta2/pilha1.txt"));
        Scanner p2 = new Scanner(new File("C:\\Users/pbrit/OneDrive/ProvaEstruturaDeDados/src/Pergunta2/pilha2.txt"));
        Scanner p3 = new Scanner(new File("C:\\Users/pbrit/OneDrive/ProvaEstruturaDeDados/src/Pergunta2/pilha3.txt"));

        while (p1.hasNextLine()){
            pilha1.push(p1.nextLine());
        }
        while (p2.hasNextLine()){
            pilha2.push(p2.nextLine());
        }
        while (p3.hasNextLine()){
            pilha3.push(p3.nextLine());
        }
        while (!pilha1.empty() && !pilha2.empty() && !pilha3.empty()){
            System.out.println("Assistente 1 - prato:"+pilha1.pop());
            System.out.println("Assistente 2 - prato:"+pilha2.pop());
            System.out.println("Assistente 3 - prato:"+pilha3.pop());

        }
    }
}
