package exercicio_5_1;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FormaTeste 
{

	public static void main( String[] args ) 
	{
		String entrada = JOptionPane.showInputDialog( "Insira 1 para desenhar retangulos\n" +
													  "Insira 2 para desenhar ovais\n" +
													  "Insira 3 para desenhar circulos" );
		int escolha = Integer.parseInt( entrada );
		
		Formas painel = new Formas( escolha );
		
		JFrame aplicacao = new JFrame();
		
		aplicacao.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		aplicacao.add( painel );
		aplicacao.setSize( 300, 300 );
		aplicacao.setVisible( true );
	}
}