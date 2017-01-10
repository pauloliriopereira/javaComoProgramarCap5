package exercicio_5_17;

import java.util.Scanner;

public class TestaVenda 
{
	public static void main( String[] args ) 
	{
		int codigo = 0;
		Venda venda = new Venda();
		Scanner entrada = new Scanner( System.in );
		do 
		{
			System.out.print( "Insira o codigo do produto: " );
			codigo = entrada.nextInt();
			venda.somaVenda( codigo );
		} 
		while( codigo != 0 );
		
		venda.apresentaValor();
		entrada.close();
	}
}