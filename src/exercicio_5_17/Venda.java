package exercicio_5_17;

/*
 * 5.17 Um varejista online vende cinco produtos cujos preços no varejo
 * são como seguem: produto1, US$ 2,98; produto2, US$ 4,50; produto3, 
 * US$ 9,98; produto4, US$ 4,49; e produto5, US$ 6,87. Escreva um aplicativo
 * que leia uma série de pares de números como segue:
 *	a) número de produto.
 *  b) quantidade vendida.
 * Seu programa deve utilizar uma instrução switch para determinar o preço 
 * de varejo de cada produto. Você deve calcular e exibir o valor de varejo 
 * total de todos os produtos vendidos. Utilize um loop controlado por 
 * sentinela para determinar quando o programa deve parar o loop e exibir
 * resultados finais.
 */

public class Venda 
{
	private double precoDeVenda;
	
	private double determinaValorProduto( int codigo )
	{
		double valor = 0.0;
		
		switch( codigo ) 
		{
			case 1 : valor = 2.98;
			break;
			case 2 : valor = 4.50;
			break;
			case 3 : valor = 9.98;
			break;
			case 4 : valor = 4.49;
			break;
			case 5 : valor = 6.87;
			break;
		}
		
		return valor;
	}
	
	public void somaVenda( int codigo )
	{
		double valor;
		valor = determinaValorProduto( codigo );
		precoDeVenda += valor; 
	}
	
	public void apresentaValor()
	{
		System.out.printf( "Valor total de vendas %.2f\n", precoDeVenda );
	}
}