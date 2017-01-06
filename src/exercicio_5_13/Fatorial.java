package exercicio_5_13;
/*
 * 5.13 Fatoriais costumam ser utilizados em problemas de probabilidade.
 * O fatorial de um inteiro positivo n é igual ao produto dos números
 * inteiros positivos de 1 a n. Escreva um aplicativo que calcula os
 * fatoriais de 1 a 20. Utilize o tipo long. Exiba os resultados em 
 * formato tabular. Que dificuldade poderia impedir você de calcular
 * o fatorial de 100?
 */
public class Fatorial 
{
	public static void main( String[] args ) 
	{	
		for( int i = 1; i <= 20; i++ ) 
		{
			long fatorial = 1;
			
			for( int j = 1; j <= i; j++ ) 
			{
				fatorial *= j;
			}
			
			System.out.printf( "O fatorial de %d! = %d.\n", i, fatorial );
		}		
	}
}