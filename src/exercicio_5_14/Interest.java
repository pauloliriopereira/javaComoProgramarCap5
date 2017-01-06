package exercicio_5_14;

/*
 * 5.14 Modifique o aplicativo de juros compostos da figura 5.6 para 
 * repetir os passos para taxas de juros de 5%... 10%. Utilize um 
 * loop for para variar a taxa de juros.
 */

public class Interest 
{
	public static void main( String[] args ) 
	{
		double amount;
		double principal = 1000.0;

		System.out.printf( "%s%20s \n", "Year", "Amount on deposit" );
		for( double rate = 0.05; rate < 0.1; rate += 0.01 ) 
		{
			System.out.println(rate);
			for( int year = 1; year <= 10; year++ )
			{
				amount = principal * Math.pow( 1.0 + rate, year );
				
				System.out.printf( "%4d%,20.2f\n", year, amount );
			}
		}
	}
}