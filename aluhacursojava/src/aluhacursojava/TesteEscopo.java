package aluhacursojava;

public class TesteEscopo {

    public static void main(String[] args){
        System.out.println("testando condicionais");

        int idade = 2;
        int quantidadePessoas = 1;    
        boolean acompanhado;

        if (quantidadePessoas >= 2) {
            acompanhado = true;
        }else {
            acompanhado = false;
        }

        if (idade >=18 || acompanhado){

            System.out.println("Seja bem vindo"); 
        } else {
            System.out.println("infelizmente voce nao pode entrar");
    }

}
}