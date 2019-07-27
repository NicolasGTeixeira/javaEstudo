package bytebank;

import java.math.BigDecimal;

public class Transferencia {

	public static void transfere(Conta ContaTransfere, Conta ContaRecebe, BigDecimal valor) {
		
		BigDecimal valorCredita;

		if(!ContaTransfere.agencia.equals(ContaRecebe.agencia)) {
			valorCredita = valor.add(new BigDecimal(2.75));	
		} else {
			valorCredita = valor;
		}
		
		if (ContaTransfere.validaSaldo(valorCredita)) {
			ContaTransfere.credita(valorCredita);
			ContaRecebe.debita(valor);
			System.out.println("TRANSFERENCIA REALIZADA COM SUCESSO");
		} else {
			System.out.println("SALDO INSUFICIENTE PARA TRANSFERENCIA");
		}
	}
	
	public static void saca(Conta ContaCredita, BigDecimal valor) {
		if (ContaCredita.validaSaldo(valor)) {
			ContaCredita.credita(valor);
			System.out.println("SAQUE REALIZADO COM SUCESSO");
		} else {
			System.out.println("SALDO INSUFICIENTE PARA SAQUE");
		}
	}

	public static void deposita(Conta ContaDebita, BigDecimal valor) {
			ContaDebita.debita(valor);
			System.out.println("DEPOSITO REALIZADO COM SUCESSO");
	}
}