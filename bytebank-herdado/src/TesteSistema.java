
public class TesteSistema {

	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setSenha(2222);
		
		Administrador adm = new Administrador();
		adm.setSenha(3333);
		
		Cliente cl = new Cliente();
		cl.setSenha(3333);
		
		SistemaInterno sis = new SistemaInterno();
		sis.autentica(g);
		sis.autentica(adm);
		sis.autentica(cl);
				
	}

}
