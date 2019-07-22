package bytebank;

import java.math.BigDecimal;

public class usandoMetodo {
	
	public static void main(String[] args) {
		Conta usandoMetodo = new Conta();
		
		// Iniciando o saldo
		
		usandoMetodo.saldo = new BigDecimal(200);
		// System.out.println(usandoMetodo.saldo);
		usandoMetodo.agencia = 4123;
		usandoMetodo.numero = 83648763;
		
		// Deposita X reais
		//usandoMetodo.deposita(new BigDecimal(400));
		// System.out.println(usandoMetodo.saldo);
		
		// Saca Y reais
		// usandoMetodo.saca(new BigDecimal(50), usandoMetodo.saldo);
		// System.out.println(usandoMetodo.saldo);
		
		// Transfere Conta X para a Conta Y
		
		// Declarando e Iniciando Conta que vai receber a trânsferencia
		
		Conta contaRecebe = new Conta();
		contaRecebe.saldo = new BigDecimal(500);
        contaRecebe.agencia = 4123;
        contaRecebe.numero = 123145654;
        
        
        
        // Fazendo a transferencia
        
        System.out.println("ANTES");
        // contaRecebe.saldo = 500
        // usandoMetodo.saldo = 200
        System.out.println("Conta Recebe = " + contaRecebe.saldo);
        System.out.println("Conta Transfere = " + usandoMetodo.saldo);
        System.out.println("============================");
        
        usandoMetodo.transfere(new BigDecimal(100), usandoMetodo.saldo, contaRecebe.saldo);
        
        System.out.println("DEPOIS");
        // contaRecebe.saldo = 600
        // usandoMetodo.saldo = 100
        System.out.println("Conta Recebe = " + contaRecebe.saldo);
        System.out.println("Conta Transfere = " + usandoMetodo.saldo);
        System.out.println("============================");
	}
}
