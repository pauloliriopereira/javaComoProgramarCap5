package exercicio_5_15;

public class Padrao 
{
	public static void main( String[] args ) 
	{
		// primeiro padr�o
		for( int i = 0; i < 10; i++ ) 
		{
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
			
			System.out.println();
		}
		
		System.out.println();
		
		// segundo padr�o
		for( int i = 0; i < 10; i++ ) 
		{
			for( int j = i; j < 10; j++ ) 
			{
				if( i <= j ) 
				{
					System.out.print( '*' );
				} 
				else 
				{
					System.out.print( ' ' );
				}
			}
			
			System.out.println();
		}
		
		System.out.println();
		
		// terceiro padr�o
		for( int i = 0; i < 10; i++ ) 
		{
			for( int j = 0; j < 10; j++ ) 
			{
				if( i <= j ) 
				{
					System.out.print( '*' );
				} 
				else 
				{
					System.out.print( ' ' );
				}
			}
			
			System.out.println();
		}
		
		System.out.println();
		
		// quarto padr�o
		for( int i = 1; i <= 10; i++ ) 
		{
			for( int j = 1; j <= 10; j++ ) 
			{
				if( ( 10 - i ) >= j ) 
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
		
		System.out.println();
	}	
}