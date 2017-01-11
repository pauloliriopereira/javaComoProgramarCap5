package exercicio_5_21;

/*
 * Um tri�ngulo ret�ngulo pode ter lados cujos comprimentos s�o todos inteiros.
 * O conjunto de tr�s valores inteiros para os comprimentos dos lados de um 
 * tri�ngulo ret�ngulo � chamado triplos de Pit�goras. Os comprimentos dos tr�s
 * lados devem satisfazer a rela��o de que a soma dos quadrados de dois dos
 * lados � igual ao quadrado da hipotenusa. Escreva um aplicativo para 
 * exibir uma tabela dos triplos de Pit�goras para side1, side2 e a hipotenusa,
 * todos n�o maiores que 500. Utilize um loop for triplamente aninhado que
 * tenta todos as possibilidades. Esse � um m�todo de computa��o de
 * �for�a bruta�. Voc� aprender� nos cursos de ci�ncia da computa��o mais 
 * avan�ados que para muitos problemas interessantes n�o h� uma abordagem 
 * algor�tmica conhecida al�m do uso de for�a bruta absoluta.
 */

public class TriplosPitagoricos 
{
	public static void main( String[] args ) 
	{
		int lado1; 
		int lado2;
		int hipotenusa;
		
		for( int i = 1; i <= 22; i++ ) 
		{
			lado1 = i;
			
			for( int j = 1; j <= 22 ; j++ ) 
			{
				lado2 = j;
				
				for( int j2 = 1; j2 <= 22; j2++ )
				{
					hipotenusa = j2;
					
					if( verificaHipotenusa( hipotenusa, lado1, lado2 ) )
					{
						System.out.printf( "a2 = %d, b2 = %d, c2 = %d\n", hipotenusa, lado1, lado2 );
					}
				}
			}
		}
	}
	
	public static boolean verificaHipotenusa( int a, int b, int c )
	{
		a = (int) Math.pow( a, 2 );
		b = (int) Math.pow( b, 2 );
		c = (int) Math.pow( c, 2 );
		
		if( a == ( b + c ) )
		{
			return true;
		}
		
		return false;
	}
}