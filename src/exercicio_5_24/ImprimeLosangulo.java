package exercicio_5_24;

/*
 * Escreva um aplicativo que imprime a seguinte forma de um losango. Você pode 
 * utilizar instruções de saída que imprimem um único asterisco(*), um único 
 * espaço ou um único caractere de nova linha. Maximize sua utilização de 
 * repetição (com instruções for aninhadas) e minimize o número de instruções 
 * de saída.
 */

public class ImprimeLosangulo 
{
	public static void main( String[] args ) 
	{
		for( int i = 0, k = 9; i < 9; i++ ) 
		{
			if( ( i + 1 ) <= 5)
			{
				for( int j = 1; j <= 5 + i; j++ ) 
				{
					if( j <= Math.abs( ( 5 + i ) - ( ( 2 * i ) + 1 ) ) ) 
					{
						System.out.print( ' ' );
					} 
					else
					{
						System.out.print( '*' );
					}
				}
			}
			else
			{
				for( int j = 1; j <= 5 + i; j++ ) 
				{
					if( j <= Math.abs( ( 5 + i ) - ( ( 2 * i ) + 1 ) ) ) 
					{
						System.out.print( ' ' );
					} 
					else if( j < k  )
					{
						System.out.print( '*' );
					}
				}
				k--;
			}
			System.out.println();
		}
	}
}