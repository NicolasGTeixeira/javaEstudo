package sintaxeVariaveisFluxo;

public class testaConversao {
	public static void main(String[] args) {
		double salario = 45.5;
		// Para colocar um DOUBLE dentro de um INT é preciso fazer uma conversão
		int valor = (int) salario;
		System.out.println(valor);
		
		// Algumas peculiaridades do Double
		
		double s = 0.1;
		double d = 0.2;
		double soma = s + d;
		System.out.println(soma);
	}
}