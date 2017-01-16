package exercicio_5_28;

/*
 * Descreva de maneira geral como voc� removeria qualquer instru��o continue 
 * de um loop em um programa e a substituiria por alguma equivalente estruturada. 
 * Utilize a t�cnica que voc� desenvolve aqui para remover a instru��o continue 
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
		
		System.out.println( "\nA instru��o continue foi utilizada para pular a quinta iteracao" );
	}
}