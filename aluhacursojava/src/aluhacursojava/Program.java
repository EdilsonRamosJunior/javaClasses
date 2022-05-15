package aluhacursojava;
public class Program {

	public static void main(String[] args) {
		
		System.out.println("*-Teste-*");
		int idade = 15;
		int quantidadePessoas = 2;
		if (idade >= 18) {
			System.out.println("Maior");
		} 
		else {
			System.out.println("Menor");
			if (quantidadePessoas > 2) {
				System.out.println("Pode entrar acompanhado");
			}
			else {
				System.out.println("Infelizmente nao pode entrar");
			}
		}
	}

}
