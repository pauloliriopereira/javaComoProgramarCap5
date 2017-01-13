package exercicio_5_24;

/*
 * Escreva um aplicativo que imprime a seguinte forma de um losango. Voc� pode 
 * utilizar instru��es de sa�da que imprimem um �nico asterisco(*), um �nico 
 * espa�o ou um �nico caractere de nova linha. Maximize sua utiliza��o de 
 * repeti��o (com instru��es for aninhadas) e minimize o n�mero de instru��es 
 * de sa�da.
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