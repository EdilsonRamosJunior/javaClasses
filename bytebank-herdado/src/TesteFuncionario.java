
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario edilson = new Gerente();
		
		edilson.setNome("Edilson Ramos Junior");
		edilson.setCpf("000333666-56");
		edilson.setSalario(15000.0);
		
		
		System.out.println(edilson.getNome());
		System.out.println(edilson.getBonificacao());
		

	}

}
