package Desafios;

import java.util.Scanner;

public class Conversao {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("digite seu primeiro salario ");
        String n1 = leia.nextLine();


        System.out.println("digite seu segundo salario ");
        String n2 = leia.nextLine();


        System.out.println("digite seu terceiro salario ");
        String n3 = leia.nextLine();

        double nu1 = Double.parseDouble(n1);
        double nu2 = Double.parseDouble(n2);
        double nu3 = Double.parseDouble(n3);
        double media = (nu1 + nu2 + nu3)/3;

        System.out.println("A soma dos ultimos salarios é " + media +"R$");
        
        leia.close();
    }
}
