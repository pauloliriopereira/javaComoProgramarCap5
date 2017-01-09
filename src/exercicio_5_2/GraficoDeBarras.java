package exercicio_5_2;

import java.awt.Graphics;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;

import exercicio_5_16.GraficoDeAsteriscos;

/*
 * 5.16 Uma aplicação interessante dos computadores é exibir diagramas e 
 * gráficos de barras. Escreva um aplicativo que leia cinco números entre
 * 1 e 30. Para cada número que é lido, seu programa deve exibir o número 
 * de asteriscos adjacentes. Exiba a barra dos asteriscos depois de ler 
 * os cinco números.
 */

public class GraficoDeBarras extends JPanel 
{
	private int num1;
	private int num2;
	private int num3;
	private int num4;
	private int num5;
	
	public GraficoDeBarras( int numero1, int numero2, int numero3, int numero4, int numero5 )
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
		
		GraficoDeBarras grafico = 
				new GraficoDeBarras(	entrada.nextInt(), 
										entrada.nextInt(), 
										entrada.nextInt(), 
										entrada.nextInt(), 
										entrada.nextInt() );
		
		JFrame aplicacao = new JFrame();
		
		aplicacao.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		aplicacao.add( grafico );
		aplicacao.setSize( 300, 300 );
		aplicacao.setVisible( true );
		
		entrada.close();
	}
	
	public void imprGrafBarras( int numero )
	{
		System.out.println();
		for( int i = 0; i < numero; i++ ) 
		{
			System.out.print( '*' );
		}
		System.out.println();
	}
	
	public void paintComponent( Graphics g )
	{
		super.paintComponent( g );
		
		g.drawRect( 0,   0, 10 * getNum1(), 20 );
		g.drawRect( 0,  30, 10 * getNum2(), 20 );
		g.drawRect( 0,  60, 10 * getNum3(), 20 );
		g.drawRect( 0,  90, 10 * getNum4(), 20 );
		g.drawRect( 0, 120, 10 * getNum5(), 20 );
	}
}