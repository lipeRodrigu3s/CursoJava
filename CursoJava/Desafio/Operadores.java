package Desafio;

public class Operadores {
    public static void main(String[] args) {
        
       var a = 6 * (3+2);
       double b = Math.pow(a, 2)/(3*2);
       System.out.println(b);

        int c = (1-5) * (2-7) / 2;
        double d = Math.pow(c, 2);
        System.out.println(d);

        double e = b - d;
        double f = Math.pow(e, 3);
        double g = Math.pow(10, 3);
        double h = f/g;
        System.out.println("O resultado foi de: "+h);


    }
}
