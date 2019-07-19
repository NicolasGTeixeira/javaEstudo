package bytebank;

import java.math.BigDecimal;

public class testeReferencia {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = new BigDecimal(300);
		
		System.out.println("Saldo da primeira: " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		
		System.out.println("Saldo da segunda: " + segundaConta.saldo);
	
		segundaConta.saldo = segundaConta.saldo.add(segundaConta.saldo);
		
		System.out.println("Saldo da primeira: " + primeiraConta.saldo);
		
			
		System.out.println("Saldo da segunda: " + segundaConta.saldo);
	
	}
}
