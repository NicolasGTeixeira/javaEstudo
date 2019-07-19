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
	
	public void saca(BigDecimal valor) {
		int val = this.saldo.compareTo(valor);
		// val = 0 --> this.saldo = valor
		// val = 1 --> this.saldo > valor
		// val = -1 --> this.saldo < valor
		if(val >= 0) {
			this.saldo = this.saldo.subtract(valor);
		} else {
			System.err.println("Saldo Insuficiente para o Saque");
			
		}
	}
}