package exercicio_5_16;

import java.util.Scanner;

/*
 * 5.16 Uma aplicação interessante dos computadores é exibir diagramas e 
 * gráficos de barras. Escreva um aplicativo que leia cinco números entre
 * 1 e 30. Para cada número que é lido, seu programa deve exibir o número 
 * de asteriscos adjacentes. Exiba a barra dos asteriscos depois de ler 
 * os cinco números.
 */

public class GraficoDeAsteriscos 
{
	
	private int num1;
	private int num2;
	private int num3;
	private int num4;
	private int num5;
	
	public GraficoDeAsteriscos( int numero1, int numero2, int numero3, int numero4, int numero5 )
	{
		num1 = numero1;
		num2 = numero2;
		num3 = numero3;
		num4 = numero4;
		num5 = numero5;
	}
	
	public int getNum1() 
	{
		return num1;
	}

	public int getNum2() 
	{
		return num2;
	}

	public int getNum3() 
	{
		return num3;
	}

	public int getNum4() 
	{
		return num4;
	}

	public int getNum5() 
	{
		return num5;
	}

	public static void main( String[] args ) 
	{
		Scanner entrada = new Scanner( System.in );
		System.out.print( "Insira cinco numeors separados por espacos: " );
		
		GraficoDeAsteriscos grafico = 
				new GraficoDeAsteriscos(entrada.nextInt(), 
										entrada.nextInt(), 
										entrada.nextInt(), 
										entrada.nextInt(), 
										entrada.nextInt() );
		System.out.println( "Grafico" );
		
		grafico.imprGrafAsterisco( grafico.getNum1() );
		grafico.imprGrafAsterisco( grafico.getNum2() );
		grafico.imprGrafAsterisco( grafico.getNum3() );
		grafico.imprGrafAsterisco( grafico.getNum4() );
		grafico.imprGrafAsterisco( grafico.getNum5() );
	}
	
	public void imprGrafAsterisco( int numero )
	{
		for( int i = 0; i < numero; i++ ) 
		{
			System.out.print( '*' );
		}
		System.out.println();
	}
}