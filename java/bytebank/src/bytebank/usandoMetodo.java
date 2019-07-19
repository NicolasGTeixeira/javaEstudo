package bytebank;

import java.math.BigDecimal;

public class usandoMetodo {
	
	public static void main(String[] args) {
		Conta usandoMetodo = new Conta();
		
		// Iniciando o saldo
		
		usandoMetodo.saldo = new BigDecimal(200);
		System.out.println(usandoMetodo.saldo);
		
		// Deposita X reais
		usandoMetodo.deposita(new BigDecimal(400));
		System.out.println(usandoMetodo.saldo);
		
		// Saca Y reais
		usandoMetodo.saca(new BigDecimal(1000));
		System.out.println(usandoMetodo.saldo);
	}
}
