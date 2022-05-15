
public class TestaGeteSet {

	public static void main(String[] args) {
		
		Conta conta = new Conta(1256, 10002);
		Conta conta1 = new Conta(1256, 10003);
		Conta paulo = new Conta(1256, 10005);
		Conta wene = new Conta(1256, 10006);
		
		conta.getTitular().setNome("Paulo Sousa");
		
		System.out.println(paulo.getTitular());
		
		
	
		
		
		//System.out.println(conta.getTitular().getNome());
		//System.out.println("O numero da conta é " + conta1.getNumero());
		//System.out.println("O numero da conta é " + conta.getNumero());
	}

}
