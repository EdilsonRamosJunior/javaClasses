//Contrato de autentica��o
	//Quem assina, precisa implementar
		//M�todo setSenha
		//M�todo autentica


public abstract interface Autenticavel {

	public abstract void setSenha(int senha);
	
	public boolean autentica(int senha);

}
