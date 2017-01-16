package exercicio_5_28;

/*
 * Descreva de maneira geral como você removeria qualquer instrução continue 
 * de um loop em um programa e a substituiria por alguma equivalente estruturada. 
 * Utilize a técnica que você desenvolve aqui para remover a instrução continue 
 * do programa na figura 5.13.
 */

public class ContinueTeste 
{
	public static void main( String[] args ) 
	{
		int contador;
		
		for( contador = 1; contador <= 10; contador++ ) 
		{	
			if( contador == 5)
				contador++;
			
			System.out.printf( "%d", contador );
		}
		
		System.out.println( "\nA instrução continue foi utilizada para pular a quinta iteracao" );
	}
}