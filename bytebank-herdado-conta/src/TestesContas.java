
public class TestesContas {

	public static void main(String[] args) throws SaldoInsuficienteException{
		
		ContaCorrente cc1 = new ContaCorrente(111, 111);
		cc1.deposita(100);
		
		ContaPoupanca cp1 = new ContaPoupanca(222, 222);
		cp1.deposita(200);
		
		cc1.transfere(10, cp1);
		
		System.out.println("Saldo da CC " + cc1.getSaldo());
		System.out.println("Saldo da CP " + cp1.getSaldo());

	}

}
