import java.util.Scanner;

public class Main01 {

    /*
     * Estrutura de repetição: "while".
     * 
     * Usado principalmente quando não se sabe a quantidade de entrada de dados.
     * Regra: verdadeiro executa, falso pula fora.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int soma = 0;

        while (x != 0) {
            soma += x;
            x = sc.nextInt();
        }

        System.out.println(soma);

        sc.close();
    }
}
