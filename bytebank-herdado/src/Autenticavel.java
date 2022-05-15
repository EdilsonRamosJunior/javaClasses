//Contrato de autenticação
	//Quem assina, precisa implementar
		//Método setSenha
		//Método autentica


public abstract interface Autenticavel {

	public abstract void setSenha(int senha);
	
	public boolean autentica(int senha);

}
