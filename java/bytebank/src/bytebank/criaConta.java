package bytebank;

public class criaConta {
	
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		
		primeiraConta.saldo = 200;
		primeiraConta.agencia = 2040;
		primeiraConta.numero = 4006534;
		primeiraConta.titular = "Nicolas Gabriel Texeira";
		
		System.out.println("A primeira conta do banco é:");
		System.out.println("Titular: " + primeiraConta.titular);
		System.out.println("Agência: " + primeiraConta.agencia);
		System.out.println("Numero: " + primeiraConta.numero);
		System.out.println("Saldo: " + primeiraConta.saldo);
	}  	
}
