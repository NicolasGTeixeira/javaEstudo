package sintaxeVariaveisFluxo;

public class testeCondicional2 {
	
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		
		int idade = 1;
		int quantidadePessoa = 1;
		boolean acompanhado;
		
		if (quantidadePessoa >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}
		
		if (idade >= 18 || acompanhado) {
			System.out.println("Seja Bem Vindo");
		} else
			System.out.println("Você é menor de idade, volte daqui " + (18 - idade));
	}
}