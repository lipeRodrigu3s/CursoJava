package Aula1;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite seu nome ");
        String nome = ler.nextLine();

        System.out.println("Digite seu sobrenome ");
        String sobre = ler.nextLine();

        System.out.println("Digite sua idade ");
        int idade = ler.nextInt();


        System.out.println(nome + " "+sobre + " e tenho " + idade + " anos");

        ler.close();
    }
}
