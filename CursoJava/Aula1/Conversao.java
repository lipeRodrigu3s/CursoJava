package Aula1;

import javax.swing.JOptionPane;

public class Conversao {
    public static void main(String[] args) {
        
        double a = 1; //Implícito
        System.out.println(a);

        int c = 5;
        byte g = (byte) c; //Eplicita(CAST)
        System.out.println(g);

        Integer f = 1000;
        System.out.println(f.toString().length());
        System.out.println("" + f);

        String v1 = JOptionPane.showInputDialog(
            "Digite o primeiro número");


















    }
}
