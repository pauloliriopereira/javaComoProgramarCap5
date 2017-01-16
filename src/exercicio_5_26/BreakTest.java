package exercicio_5_26;

/*
 * Uma cr�tica � instru��o break e � instru��o continue � que elas n�o s�o 
 * estruturadas. Na verdade, essas instru��es sempre podem ser substitu�das 
 * por instru��es estruturadas, embora fazer isso possa ser dif�cil. 
 * Descreva de maneira geral como voc� removeria qualquer instru��o break 
 * de um loop em um programa e a substituiria por alguma equivalente 
 * estruturada. Dica: a instru��o break sai de um loop do corpo do loop. 
 * A outra maneira de sair de um loop � falhando no teste de continua��o 
 * do loop. Considere a possibilidade de utilizar no teste de continua��o 
 * do loop um segundo teste que indica �sa�da pr�via por causa de uma 
 * condi��o break�. Utilize a t�cnica que voc� desenvolve aqui para remover 
 * a instru��o break do aplicativo na Figura 5.12.
 */

public class BreakTest 
{
	public static void main( String[] args ) 
	{
		int contador;
		
		for( contador = 1; contador <= 10; contador++ ) 
		{
			if( contador == 5)
				contador = 11;

				System.out.printf( "%d", contador );
		}
		
		System.out.printf( "\nSaida do Loop quando contador = %d\n", contador );
	}
}