
public class TesteContaSemCliente {

	public static void main(String[] args) {
		Conta contaDaMarcela = new Conta();
		System.out.println(contaDaMarcela.saldo);
		
		contaDaMarcela.titular = new Cliente();
		
		System.out.println(contaDaMarcela.titular.nome);
		contaDaMarcela.titular.nome = "Marcela";
		contaDaMarcela.titular.profissao = "Arquiteta";
		System.out.println(contaDaMarcela.titular.nome);
		System.out.println(contaDaMarcela.titular.profissao);
	}

}
