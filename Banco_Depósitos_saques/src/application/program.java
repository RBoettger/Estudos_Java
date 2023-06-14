package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Conta_bancaria;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account number: ");		
		int numConta = sc.nextInt();
		System.out.println("Enter account holder:");
		String nomeTitular = sc.next();
		Conta_bancaria conta_bancaria = new Conta_bancaria(numConta, nomeTitular);
		
		System.out.println("Is there na initial deposit (y/n) ?");
		char yesOrNo = sc.next().charAt(0) ;
		
		if(yesOrNo == 'y') {
			System.out.println("Enter initial deposit value: ");
			double deposito = sc.nextDouble();
			conta_bancaria.deposito(deposito);
		}else if(yesOrNo == 'n') {
			conta_bancaria.deposito(0.0);
		}
		
		System.out.println(conta_bancaria.toString());
		
		System.out.println("Enter a deposit value: ");
		double deposito = sc.nextDouble();
		conta_bancaria.deposito(deposito);
		System.out.println("Update account data:");
		System.out.println(conta_bancaria.toString());
		
		System.out.println("Enter a withdraw value: ");
		double saque = sc.nextDouble();
		
		conta_bancaria.setSaque(saque);
		System.out.println("Update account data:");
		System.out.println(conta_bancaria.toString());
		
		sc.close();
	}

}
