package exercicio_5_25;

import java.util.Scanner;

/*
 * Modifique o aplicativo que você escreveu no exercício 5.24 para ler um 
 * número  ímpar no intervalo 1 a 19 para especificar o número de linhas no 
 * losango. Seu programa ent�o deve exibir um losango do tamanho apropriado.
 */

public class ImprimeLosangulo 
{
	public static void main( String[] args ) 
	{
		Scanner entrada = new Scanner( System.in );
		System.out.print("Insira um valor impar entre 1 a 19: ");
		int tamanho = entrada.nextInt();
		int meio = ( ( tamanho % 2 == 0 ) ? ( tamanho / 2 ) : ( ( tamanho / 2 ) + 1) );
		
		for( int i = 0, k = tamanho; i < tamanho; i++ ) 
		{
			if( ( i + 1 ) <= meio )
			{
				for( int j = 1; j <= meio + i; j++ ) 
				{
					if( j <= Math.abs( ( meio + i ) - ( ( 2 * i ) + 1 ) ) ) 
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
				for( int j = 1; j <= meio + i; j++ ) 
				{
					if( j <= Math.abs( ( meio + i ) - ( ( 2 * i ) + 1 ) ) ) 
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
		
		entrada.close();
	}
}