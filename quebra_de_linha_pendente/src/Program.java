import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x;
        String s1, s2, s3;

        /*
         * next() lê apenas uma palavra, para lêr toda a linha é necessário o nextLine().
         */
        x = sc.nextInt();

        /*
         *  ATENÇÃO: quebra de linha pendente.
         *  Quando você usa um comando de leitura diferente do nextLine() e dá alguma quebra de linha, essa quebra de linha fica "pendente" na entrada padrão.
         *  Se você então fizer um nextLine(), aquela quebra de linha pendente será absorvida pelo nextLine().
         */
        sc.nextLine();
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close();
    }
}
