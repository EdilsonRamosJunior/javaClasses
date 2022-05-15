package aluhacursojava;

public class TesteWhile {
	
    public static void main(String[] args) {
    	//int contador = 0;
    	//while(contador <=10) {
    		//System.out.println(contador);
    		//contador++;
    	//}
        
       /* for (int contador=0;contador<=10;contador++) {
        	
            System.out.println(contador);   
        }*/
    	for(int linha = 0; linha < 5; linha++) {
    	   for (int coluna = 0; coluna < 5; coluna++) {
    	       if (coluna > linha) {
    	          break;
    	}
    	System.out.print( coluna +1 );
    	}
    	System.out.println();
    	        }
    	    }
    	
    }
