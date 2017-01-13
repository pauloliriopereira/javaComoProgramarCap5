package exercicio_5_23;

/*
 * Neste cap�tulo, discutimos os operadores l�gicos &&, &, | |, |,^ e !. 
 * As leis de Morgan �s vezes podem tornar mais conveniente para n�s 
 * expressar uma express�o l�gica. Essas leis afirmam que a express�o 
 * !(condition1 && condition2) � logicamente equivalente � express�o 
 * (!condi��o1 | | !condi��o2). Al�m disso, a express�o 
 * !(condi��o1 | | condi��o2) � logicamente equivalente � express�o 
 * (!condi��o1 && !condi��o2). Utilize as leis de Morgan para escrever 
 * express�es equivalentes para cada uma das express�es a seguir, 
 * ent�o escreva um aplicativo para mostrar que tanto a express�o 
 * original como a nova express�o em cada caso produzem o mesmo valor.
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