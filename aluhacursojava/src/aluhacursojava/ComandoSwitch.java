package aluhacursojava;

public class ComandoSwitch {

	public static void main(String[] args) {
		
		int mes = 4;
		
		switch (mes) {
			case 1:
				System.out.println("Janeiro");
				break;
			case 2:
				System.out.println("Fevereito");
				break;
			case 3:
				System.out.println("Mar�o");
				break;
			case 4:
				System.out.println("Abril");
				break;
			case 5:
				System.out.println("Maior");
				break;
			default:
				System.out.println("Mes invalido");
				break;
				
		}

	}

}
