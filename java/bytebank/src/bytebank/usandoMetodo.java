package bytebank;

import java.math.BigDecimal;

public class usandoMetodo {
	
	public static void main(String[] args) {
		
		// CONTA A
		
		Conta contaA = new Conta();
		contaA.saldo = new BigDecimal(200);
		contaA.agencia = 4123;
		contaA.numero = 83648763;
		
		// CONTA B
		
		Conta contaB = new Conta();
		contaB.saldo = new BigDecimal(500);
		contaB.agencia = 4123;
		contaB.numero = 123145654;
		
		// DEPOSITA
		
		 Transferencia.deposita(contaA, new BigDecimal(200));
		 System.out.println(contaA.saldo);
		
		// SACA
		 
		 Transferencia.saca(contaA, new BigDecimal(200));
		 System.out.println(contaA.saldo);
		    
        
        // TRANSFERE
        
		System.out.println("============================");
        System.out.println("ANTES");
        System.out.println("Conta Recebe = " + contaB.saldo);
        System.out.println("Conta Transfere = " + contaA.saldo);
        System.out.println("============================");
        
        Transferencia.transfere(contaA, contaB, new BigDecimal(100));
        
        System.out.println("============================");
        System.out.println("DEPOIS");
        System.out.println("Conta Recebe = " + contaB.saldo);
        System.out.println("Conta Transfere = " + contaA.saldo);
        System.out.println("============================");
	}
}
