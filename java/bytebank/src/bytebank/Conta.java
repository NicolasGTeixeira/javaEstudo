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
	
	// Metodo de validação de saldo
	
	private Boolean validaSaldo(BigDecimal valor, BigDecimal saldo) {
		
		//  0 --> this.saldo = valor
		//  1 --> this.saldo > valor
        // -1 --> this.saldo < valor
		
		if(this.saldo.compareTo(valor) >= 0) {
			return true;
		} else {
			return false;
		}
	}
	
	// Metodo Adiciona na conta
	
	private void adiciona(BigDecimal valor, BigDecimal saldo) {
		this.saldo = saldo.add(valor);
	}
	
	// Metodo Subtrai na conta
	
	private void subtrai(BigDecimal valor, BigDecimal saldo) {
		this.saldo = saldo.subtract(valor);
	}
	
	// Metodo Sacar
	
	public void saca(BigDecimal valor, BigDecimal saldo) {
		if(validaSaldo(valor,saldo).equals(true)) {
			System.out.println("SAQUE REALIZADO COM SUCESSO");
			subtrai(valor,saldo);
		} else {
			System.out.println("SALDO INSUFICIENTE PARA SAQUE");
		}
	}

	// Metodo Transferir
	
	public void transfere(BigDecimal valor, BigDecimal saldoTransfere, BigDecimal saldoRecebe) {


	if(validaSaldo(valor,saldoTransfere).equals(true)) {
	
		subtrai(valor,saldoTransfere);
		
		adiciona(valor,saldoRecebe);
		
		System.out.println("TRANSFERENCIA REALIZADA COM SUCESSO");
		
	} else {
		System.out.println("SALDO INSUFICIENTE PARA TRANSFERENCIA");
	}
  }
}