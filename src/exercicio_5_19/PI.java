package exercicio_5_19;

/*
 * Calcule o valor de pi a partir de uma série infinita pi = 4 - (4/3) + (4/5) - (4/7) + (4/9) - (4/11) + …
 * Imprima uma tabela que mostra o valor pi aproximado calculando os 200.000 primeiros termos dessa série. 
 */

public class PI 
{
	public static void main( String[] args ) 
	{
		double pi = 0.0;
		for( int i = 1; i <= 200000; i++ )
		{
			if( i % 2 == 0 ) 
			{
				pi -= ( pi / ( i + 2 ) ); 
			} 
			else 
			{
				pi += ( pi / ( i + 2 ) );
			}
		}
	}
}