package exercicio_5_21;

/*
 * Um triângulo retângulo pode ter lados cujos comprimentos são todos inteiros.
 * O conjunto de três valores inteiros para os comprimentos dos lados de um 
 * triângulo retângulo é chamado triplos de Pitágoras. Os comprimentos dos três
 * lados devem satisfazer a relação de que a soma dos quadrados de dois dos
 * lados é igual ao quadrado da hipotenusa. Escreva um aplicativo para 
 * exibir uma tabela dos triplos de Pitágoras para side1, side2 e a hipotenusa,
 * todos não maiores que 500. Utilize um loop for triplamente aninhado que
 * tenta todos as possibilidades. Esse é um método de computação de
 * “força bruta”. Você aprenderá nos cursos de ciência da computação mais 
 * avançados que para muitos problemas interessantes não há uma abordagem 
 * algorítmica conhecida além do uso de força bruta absoluta.
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