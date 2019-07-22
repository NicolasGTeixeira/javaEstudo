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
	
	// VALIDA SALDO
	
	public Boolean validaSaldo(BigDecimal valor) {
		
		//  0 --> this.saldo = valor
		//  1 --> this.saldo > valor
        // -1 --> this.saldo < valor
		
		if(saldo.compareTo(valor) >= 0) {
			return true;
		} else {
			return false;
		}
	}
	
	// DEBITA NA CONTA
	
	public void debita(BigDecimal valor) {
		saldo = saldo.add(valor);
	}
	
	// CREDITA NA CONTA
	
	public void credita(BigDecimal valor) {
		saldo = saldo.subtract(valor);
	}
}