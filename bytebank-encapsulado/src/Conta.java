
public class Conta{
	private double saldo;
	private int numero;
	private int agencia;
	private Cliente titular;
	private static int total;
	
	public Conta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		total++;
		//System.out.printf("A conta %s foi criada\n", numero);
		//System.out.printf("Há %s contas na agência\n", total);
		
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if (saldo >= valor) {
			this.saldo -= valor;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		return false;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Numero de conta inválido");
			return;
		}
		this.numero = numero;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Numero de agencia inválido");
			return;
		}
		this.agencia = agencia;
	}
	
	public static int getTotal(){
	    return Conta.total;
	}
}