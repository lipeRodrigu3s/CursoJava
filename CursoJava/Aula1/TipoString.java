package Aula1;

public class TipoString {
    public static void main(String[] args) {
        
        //System.out.println("Meu nome é fellipe".charAt(0));

        String f = "Meu nome é Fellipe".toLowerCase()
        .concat(" e tenho 22 anos")
        .concat("!!!");
        System.out.println(f);
        System.out.println(f.length());
        
        //var n = "Fellipe";
        //var s = "Augusto";
        //var i = 22;
        //var g = 2000.00;

        //System.out.println("Eu f a tenho 22 anos e recebo um salario de g".format(f, n,s,i,g));

    }
}
