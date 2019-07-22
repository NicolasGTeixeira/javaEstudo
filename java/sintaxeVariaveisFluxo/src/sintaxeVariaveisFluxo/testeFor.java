package sintaxeVariaveisFluxo;

public class testeFor {
	public static void main(String[] args) {
		int valor = 0;
		for(int contador = 0; contador <= 1000; contador++) {
			int oldValor = valor;
			valor += contador;
			System.out.println("A soma de " + oldValor + " e " + contador + " é " + valor);
		}
	}
}
