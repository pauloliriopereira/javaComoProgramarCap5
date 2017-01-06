package exercicio_5_3_a;

public class SomaInteirosImpares 
{
	public static void main( String[] args ) 
	{
		//SomaInteirosImpares.soma();
		//SomaInteirosImpares.potencia();
		//SomaInteirosImpares.imprimeInteirosWhile();
		//SomaInteirosImpares.imprimeInteirosFor();
		SomaInteirosImpares.testaFor();
	}
	
	public static void soma()
	{
		int soma = 0;
		for ( int i = 1; i <= 9 ; i++ ) 
		{
			if( i % 2 != 0 )
			{
				soma += i;
			}
		}
		System.out.printf( "Soma = %d.\n", soma );
	}
	
	public static void potencia()
	{
		System.out.printf( "Potencia = %.2f.\n", Math.pow( 2.5, 3) );
	}
	
	public static void imprimeInteirosWhile()
	{
		int i = 1;
		while( i <= 20 )
		{
			System.out.print( i );
			if ( i % 5 == 0 ) 
			{
				System.out.println();
			} 
			else 
			{
				System.out.printf( "\t" );
			}
			i++;
		}
	}
	
	public static void imprimeInteirosFor()
	{
		for( int i = 1; i <= 20; i++ )
		{
			System.out.print( i );
			if ( i % 5 == 0 ) 
			{
				System.out.println();
			} 
			else 
			{
				System.out.printf( "\t" );
			}
		}
	}
	
	public static void testaFor()
	{
		double k;
		for( k = 0.1; k <= 1.0; k += 0.1 )
			System.out.println(k);
	}
}