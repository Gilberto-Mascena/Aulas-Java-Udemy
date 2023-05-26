import java.util.Scanner;

public class Main02 {

    /*
     * Estrutura de repetição: "while".
     * 
     * Usado principalmente quando não se sabe a quantidade de entrada de dados.
     * Regra: verdadeiro executa, falso pula fora.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = 0;
        int y = 4;

        while (x < 3) {
            x += 1;     
            y += 2;

            System.out.println(x + " - " + y);
        }

        sc.close();
    }
}
