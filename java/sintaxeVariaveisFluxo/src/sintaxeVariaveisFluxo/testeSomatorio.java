package sintaxeVariaveisFluxo;

public class testeSomatorio {
	public static void main(String[] args) {
		System.out.println("VOCÊ TEM QUE SOMAR DE 0 a 1000");
		int	number = 0;
		int somatorio = 0;
		while(number <= 1000) {
			int oldSomatorio = somatorio;
			somatorio += number ;
			System.out.println("A soma de " + oldSomatorio + " e " + number + " é " + somatorio);
			number++;
		}
	}
}
