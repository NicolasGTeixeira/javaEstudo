package bytebank;

import java.math.BigDecimal;

public class Transferencia {

	public static void transfere(Conta ContaTransfere, Conta ContaRecebe, BigDecimal valor) {
		if (ContaTransfere.validaSaldo(valor)) {
			ContaTransfere.credita(valor);
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