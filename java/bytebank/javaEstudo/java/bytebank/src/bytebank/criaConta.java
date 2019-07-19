package bytebank;

import java.math.BigDecimal;

public class criaConta {
	
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		
		primeiraConta.saldo = new BigDecimal("200");
		primeiraConta.agencia = 2040;
		primeiraConta.numero = 4006534;
		primeiraConta.titular = "Nicolas Gabriel Texeira";
		
		System.out.println("A primeira conta do banco é:");
		System.out.println("Titular: " + primeiraConta.titular);
		System.out.println("Agência: " + primeiraConta.agencia);
		System.out.println("Numero: " + primeiraConta.numero);
		System.out.println("Saldo: " + primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
			
		segundaConta.saldo = new BigDecimal("50");
		segundaConta.agencia = 2040;
		segundaConta.numero = 4408515;
		segundaConta.titular = "Beatriz Barros Mendes";
		
		System.out.println("A primeira conta do banco é:");
		System.out.println("Titular: " + segundaConta.titular);
		System.out.println("Agência: " + segundaConta.agencia);
		System.out.println("Numero: " + segundaConta.numero);
		System.out.println("Saldo: " + segundaConta.saldo);
	}  	
}
