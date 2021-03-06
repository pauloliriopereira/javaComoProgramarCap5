package exercicio_5_20;

/*
 * Calcule o valor de pi a partir de uma s�rie infinita pi = 4 - (4/3) + (4/5) - (4/7) + (4/9) - (4/11) + �
 * Imprima uma tabela que mostra o valor pi aproximado calculando os 200.000 primeiros termos dessa s�rie. 
 */

public class PI 
{
	public static void main( String[] args ) 
	{
		double pi = 0.0;
		
		for( int i = 1, j = 1; i <= 376900; i++, j += 2 )
		{
			if( i % 2 == 0 ) 
			{
				pi -= ( 4.0 / j ); 
			} 
			else 
			{
				pi += ( 4.0 / j );
			}
		}
		
		System.out.printf( "Valor de pi e %.10f", pi );
	}
}