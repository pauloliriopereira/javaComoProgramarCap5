package exercicio_5_18;

/*
 * Modifique o aplicativo na figura 5.6 para utilizar apenas inteiros para calcular os 
 * juros compostos. Dica: trate todas as quantidades monet�rias como n�meros inteiros 
 * em centavos. Ent�o divida o resultado em suas partes d�lar e centavos utilizando 
 * as opera��es divis�o e resto, respectivamente. Insira uma v�rgula entre as partes 
 * d�lar e centavos.
 */

public class JurosCompostos 
{
	public static void main( String[] args ) 
	{
		double amount;
		double principal = 1000.0;
		double rate = 0.05;
		int dolar;
		int centavos;
		int valor;
		
		System.out.printf( "%s%20s \n", "Year", "Amount on deposit" );
		
		for( int year = 1; year <= 10; year++ ) 
		{
			amount = principal * Math.pow( 1.0 + rate, year );
			valor = ( int ) ( principal * Math.pow( 1.0 + rate, year ) * 100 );
			dolar = ( int ) valor / 100;
			centavos = ( int ) valor % 100;
			System.out.printf( "%4d%,20.2f\n", year, amount );
			System.out.printf( "%4d%17d,%d\n", year, dolar, centavos );
		}
	}
}