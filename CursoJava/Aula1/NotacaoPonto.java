package Aula1;

public class NotacaoPonto {
    public static void main(String[] args) {
        
        String s = "Fellipe";
        s = s.replace("e", "i");
        s = s.toUpperCase();
        s = s.concat(" e tenho 22 anos");
        System.out.println(s);

        String x = "Leo".replace("o","e").toUpperCase().concat(".on");
        System.out.println(x);

    }
}