package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class ContaTeste {
    
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Número da agência: ");
        int ag = sc.nextInt();
        System.out.print("Número da conta: ");
        double numeroDaConta = sc.nextDouble();
        System.out.print("Número do CPF: ");
        String cpf = sc.next();
        System.out.print("Nome do titular: ");
        String titular = sc.next();

        Conta conta = new Conta(ag, numeroDaConta, cpf, titular, 0.0);
                
        System.out.println(conta);      
        
        sc.close();         
    }
}
