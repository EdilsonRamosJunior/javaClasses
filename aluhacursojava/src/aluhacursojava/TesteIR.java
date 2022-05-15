package aluhacursojava;

public class TesteIR {

    public static void main(String[] args) {

        double salario = 2000;
        double deducao;

        if (salario <= 2800.00) {
        	deducao = salario * 0.075;
        	System.out.printf("Dedução é de: %.2f", deducao);
        }
        else if (salario > 2800.00 && salario <= 3751.00) {
        		 deducao = salario * 0.15;
        		 System.out.printf("Dedução é de: %.2f", deducao);
        	 }
        else {
        	deducao = salario * 0.225;
        	System.out.printf("Dedução é de: %.2f", deducao);
        	 }
        	
        }
    }
