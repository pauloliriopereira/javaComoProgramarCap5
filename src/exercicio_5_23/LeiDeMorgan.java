package exercicio_5_23;

/*
 * Neste capítulo, discutimos os operadores lógicos &&, &, | |, |,^ e !. 
 * As leis de Morgan às vezes podem tornar mais conveniente para nós 
 * expressar uma expressão lógica. Essas leis afirmam que a expressão 
 * !(condition1 && condition2) é logicamente equivalente à expressão 
 * (!condição1 | | !condição2). Além disso, a expressão 
 * !(condição1 | | condição2) é logicamente equivalente à expressão 
 * (!condição1 && !condição2). Utilize as leis de Morgan para escrever 
 * expressões equivalentes para cada uma das expressões a seguir, 
 * então escreva um aplicativo para mostrar que tanto a expressão 
 * original como a nova expressão em cada caso produzem o mesmo valor.
 */

public class LeiDeMorgan 
{
	public static void main( String[] args ) 
	{
		int x = 0;
		int y = 0;
		int a = 0;
		int b = 0;
		int g = 0;
		int i = 0;
		int j = 0;
		System.out.printf( "%s = %s %s = %s\n", 
				"!(x<5) && !(y>=7)", !(x<5) && !(y>=7), "!((x<5) || (y>=7))", !((x<5)||(y>=7)) );
		System.out.printf( "%s = %s %s = %s\n", 
				"!(a==b) || !(g!=5)", !(a==b) || !(g!=5), "!((a==b) && (g!=5))", !((a==b) && (g!=5)) );
		System.out.printf( "%s = %s %s = %s\n", 
				"!((x<=8) && (y>4))", !((x<=8) && (y>4)), "(!(x<=8) || !(y>4))", (!(x<=8) || !(y>4)) );
		System.out.printf( "%s = %s %s = %s\n", 
				"!((i>4) || (j<=6))", !((i>4) || (j<=6)), "(!(i>4) && !(j<=6))", (!(i>4) && !(j<=6)) );
	}
}