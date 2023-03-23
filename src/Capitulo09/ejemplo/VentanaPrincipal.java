package Capitulo09.ejemplo;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VentanaPrincipal extends JFrame{
	
	public VentanaPrincipal() {
		super("Título de la ventana");
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		this.setContentPane(getPrincipalPanel());
	}
	
	/**
	 * 
	 * @return
	 */
	private JPanel getPrincipalPanel() {
		JPanel jpn = new JPanel();
		
		jpn.setLayout(new GridBagLayout());
		
		//Fila 1
		//Primer elemento
		GridBagConstraints c = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = 0;
		c.fill = GridBagConstraints.NONE;
		c.weightx = 0;
		c.weighty = 1;
		
		JLabel jlb = new JLabel("Introduzca identificador del fabricante: ");
		jpn.add(jlb, c);
		
		//Segundo elemento
		c = new GridBagConstraints();
		c.gridx = 1;
		c.gridy = 0;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 1;
		c.weighty = 1;

		JTextField jtf = new JTextField("Hola buenas tardes");
		jpn.add(jtf, c);
		
		//Tercer elemento
		c = new GridBagConstraints();
		c.gridx = 2;
		c.gridy = 0;
		c.fill = GridBagConstraints.NONE;
		c.weightx = 0;
		c.weighty = 1;
		
		JButton jbt = new JButton("Botón");
		jpn.add(jbt, c);
		
		return jpn;
	}
	
	
}
