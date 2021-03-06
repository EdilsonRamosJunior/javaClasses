
public abstract class Conta{
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
		//System.out.printf("H� %s contas na ag�ncia\n", total);
		
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public void saca(double valor) throws SaldoInsuficienteException{

        if(this.saldo < valor) {
            throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
        } 
        	this.saldo -= valor;       
}
	
	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException{
			this.saca(valor);
			destino.deposita(valor);
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Numero de conta inv�lido");
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
			System.out.println("Numero de agencia inv�lido");
			return;
		}
		this.agencia = agencia;
	}
	
	public static int getTotal(){
	    return Conta.total;
	}
}