/* JEITO FALADO
 * tipo Conta: 
 *      saldo
 *      agencia
 *      numero
 *      titular
*/

package bytebank;

import java.math.BigDecimal;

public class Conta {
	BigDecimal saldo;
	Integer agencia;
	Integer numero;
	String titular;

	// Metodo Depositar

	public BigDecimal deposita(BigDecimal valor) {
		return this.saldo = this.saldo.add(valor);
	}

	// Metodo Sacar

	public void saca(BigDecimal valor) throws Exception {

		// 0 --> this.saldo = valor
		// 1 --> this.saldo > valor
		// -1 --> this.saldo < valor
		realmenteSaca(valor);
	}

	public void saca(BigDecimal valor, BigDecimal valor2) throws Exception {
		if (valor != null) {
			realmenteSaca(valor);
		} else if (valor2 != null) {
			realmenteSaca(valor2);
		} else {
			System.out.println("sem valor");
		}
	}
	
	private void realmenteSaca(BigDecimal valor) {
		if (this.saldo.compareTo(valor) >= 0) {
			this.saldo = this.saldo.subtract(valor);
		} else {
			System.out.println("Saldo Insuficiente para o Saque");
		}
	}

	// Metodo Transferir
}