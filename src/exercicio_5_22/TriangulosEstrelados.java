package exercicio_5_22;

public class TriangulosEstrelados 
{

/*
 * Modifique o exercício 5.15 para combinar seu código dos quatro triângulos 
 * de asteriscos separados de modo que todos os quatro padrões sejam impressos
 * lado a lado. Dica: faça uso inteligente de loops for aninhados.
 */
	
	public static void main( String[] args ) 
	{
		for( int i = 0; i < 10; i++ ) 
		{
			// primeiro triângulo
			for( int j = 0; j < 10; j++ ) 
			{
				if( i < j ) 
				{
					System.out.print( ' ' );
				} 
				else 
				{
					System.out.print( '*' );
				}
			}
			
			System.out.print( '\t' );
			
			// segundo triângulo
			for( int k = 0; k < 10; k++ ) 
			{
				if( 10 - i > k ) 
				{
					System.out.print( '*' );
				} 
				else 
				{
					System.out.print( ' ' );
				}
			}
			
			System.out.print( '\t' );
			
			// terceiro triângulo
			for( int l = 0; l < 10; l++ ) 
			{
				if( i <= l ) 
				{
					System.out.print( '*' );
				} 
				else 
				{
					System.out.print( ' ' );
				}
			}
			
			System.out.print( '\t' );
			
			// quarto triângulo
			for( int m = 0; m < 10; m++ ) 
			{
				if( ( 10 - i - 1 ) > m ) 
				{
					System.out.print( ' ' );
				} 
				else 
				{
					System.out.print( '*' );
				}
			}
			
			System.out.println();
		}
	}
}