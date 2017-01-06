package exercicio_5_12;

public class Produto 
{
	public static void main( String[] args ) 
	{
		int produto = 1;
		for( int i = 1; i <= 15; i++ ) 
		{
			if( i % 2 != 0 ) 
			{
				produto *= i;
			}
		}
		System.out.printf( "Produto dos impares de 1 a 15 impares e igual a %d.", produto );
	}
}