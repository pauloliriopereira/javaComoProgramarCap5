package exercicio_5_1;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Formas extends JPanel
{
	private int escolha;
	
	public Formas( int escolhaDoUsuario )
	{
		escolha = escolhaDoUsuario;
	}
	
	public void paintComponent( Graphics g )
	{
		super.paintComponent( g );
		
		for( int i = 0; i < 10; i++ )
		{
			switch( escolha )
			{
				case 1:
					g.drawRect( 10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10 );
					break;
				case 2:
					g.drawOval( 10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10 );
					break;
				case 3:
					g.drawOval( 150 - ( ( 10 + i * 10 ) / 2 ) , ( 150 - ( 10 + i * 10 ) / 2 ), 10 + i * 10, 10 + i * 10 );
					break;
			}
		}
	}
}