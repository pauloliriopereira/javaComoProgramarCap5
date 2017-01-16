package exercicio_5_26;

/*
 * Uma crítica à instrução break e à instrução continue é que elas não são 
 * estruturadas. Na verdade, essas instruções sempre podem ser substituídas 
 * por instruções estruturadas, embora fazer isso possa ser difìcil. 
 * Descreva de maneira geral como você removeria qualquer instrução break 
 * de um loop em um programa e a substituiria por alguma equivalente 
 * estruturada. Dica: a instrução break sai de um loop do corpo do loop. 
 * A outra maneira de sair de um loop é falhando no teste de continuação 
 * do loop. Considere a possibilidade de utilizar no teste de continuação 
 * do loop um segundo teste que indica “saída prévia por causa de uma 
 * condição break”. Utilize a técnica que você desenvolve aqui para remover 
 * a instrução break do aplicativo na Figura 5.12.
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