package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class ContaTeste {
    
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a Agencia: ");
        int ag = sc.nextInt();

        System.out.print("Digite a Conta: ");
        double conta = sc.nextDouble(); 
        sc.nextLine();

        System.out.print("Digite o CPF: ");
        String cpf = sc.nextLine();
       
        System.out.print("Digite o Titular: ");
        String titular = sc.nextLine();

        System.out.print("Digite o Saldo: ");
        double saldo = sc.nextDouble();

        Conta c1 = new Conta(ag, conta, cpf, titular, saldo);  
        
        System.out.println(c1.toString());
        
        sc.close();         
    }
}
