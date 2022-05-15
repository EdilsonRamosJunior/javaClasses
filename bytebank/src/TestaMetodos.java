
public class TestaMetodos {

	public static void main(String[] args) {
		Conta contaJunior = new Conta();
		Conta contaWene = new Conta();
		
		contaJunior.saldo = 200;
		System.out.println(contaJunior.saldo);
		contaJunior.saca(30);
		System.out.println(contaJunior.saldo);
		
		contaWene.saldo = 1000;
		
		contaWene.transfere(300, contaJunior);
		System.out.println("A conta de Junior R$ " + contaJunior.saldo);
		System.out.println("A conta de Wene R$  " + contaWene.saldo);
		contaWene.deposita(3000);
		System.out.println("A conta de Wene R$ " + contaWene.saldo);
		contaWene.transfere(1000, contaJunior);
		System.out.println("A conta de Junior R$  " + contaJunior.saldo);
		System.out.println("A conta de Wene R$  " + contaWene.saldo);
		
	}

}
