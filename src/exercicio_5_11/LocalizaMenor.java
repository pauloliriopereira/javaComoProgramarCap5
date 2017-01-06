package exercicio_5_11;

import java.util.Scanner;

public class LocalizaMenor 
{
	private int min;
	
	public static void main( String[] args ) 
	{
		LocalizaMenor localiza = new LocalizaMenor();
		localiza.menuUsuario();
	}
	
	private void alteraMinimo( int numero )
	{
		if( numero < min )
			min = numero;
	}
	
	public void menuUsuario()
	{
		Scanner entrada = new Scanner( System.in );
		int numero;
		
		System.out.print( "Insira um numero: "  );
		numero = entrada.nextInt();
		min = numero;
		do 
		{
			System.out.print( "Insira um numero: "  );
			numero = entrada.nextInt();
			alteraMinimo( numero );
		} 
		while( entrada.hasNext() );
		
		System.out.printf( "O valor minimo e igual a %d.\n", min );
		entrada.close();
	}
}