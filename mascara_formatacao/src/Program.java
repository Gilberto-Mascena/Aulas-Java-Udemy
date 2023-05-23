import java.util.Locale;

public class Program {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);

        String nome = "Maria";
        int idade = 40;
        double renda = 4000.0;

        /*
         *https://docs.oracle.com/javase/tutorial/java/data/numberformat.html
         *  Opções de formatação de dados com "printf".
         * 
         * %f = ponto flutuante.
         * %d = inteiros.
         * %s = texto.
         * %n = quebra de linha.
         */
        System.out.printf("%s tem %d anos de idade e ganha R$ %.2f reais por mês.%n", nome, idade, renda); 

        int x;
        double y;
        x = 5;
        y = 2 * x;

        System.out.println(x);
        System.out.printf("%.2f%n", y);
    }    
}
