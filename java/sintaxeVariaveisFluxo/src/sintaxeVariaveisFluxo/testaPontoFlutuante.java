package sintaxeVariaveisFluxo;

public class testaPontoFlutuante {

	public static void main(String[] args) {
		
		double salario;
		salario = 120.70;
		System.out.println("Meu salario é R$" + salario);
		
        // Um numero inteiro cabe dentro de um DOUBLE, mas numeros quebrados não cabe em um INT
		
		double divisao = 3.14/2;
		System.out.println(divisao);
		
		int outraDivisao = 5/2;
		System.out.println(outraDivisao);
		
		double novaTentativa = 5/2.0;
		System.out.println(novaTentativa);
	}
}
