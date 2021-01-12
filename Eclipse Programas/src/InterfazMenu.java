import javax.swing.*; 
import java.awt.*;
import java.awt.event.*;

public class InterfazMenu extends JFrame implements ActionListener{

	private JMenuBar menubar; //Solo se puede crear un componente de este tipo
	private JMenu menu1; //Se pueden crear varios
	private JMenuItem menuitem1, menuitem2, menuitem3; //Cada componente del men�
	
	public InterfazMenu() {
		setLayout(null);
		
		//Creaci�n de la barra
		menubar = new JMenuBar();
		setJMenuBar(menubar);
		
		//A�adir la pesta�a al men�
		menu1 = new JMenu("Colores");
		menubar.add(menu1);
		
		//A�adir las opciones en la pesta�a
		menuitem1 = new JMenuItem("Rojo");
		menuitem1.addActionListener(this);
		menu1.add(menuitem1); 
		
		menuitem2 = new JMenuItem("Verde");
		menuitem2.addActionListener(this);
		menu1.add(menuitem2); 
		
		menuitem3 = new JMenuItem("Azul");
		menuitem3.addActionListener(this);
		menu1.add(menuitem3);
	}
	
	public void actionPerformed(ActionEvent e) {
		Container fondo = this.getContentPane(); //Agarrar las dimensiones de la interfaz y almacenarlas en variable
		 if(e.getSource() == menuitem1) {
			 fondo.setBackground(new Color(255,0,0));
		 }
		 
		 if(e.getSource() == menuitem2) {
			 fondo.setBackground(new Color(0,255,0));
		 }
		 
		 if(e.getSource() == menuitem3) {
			 fondo.setBackground(new Color(0,0,255));
		 }
	}
	
	public static void main(String args[]) {
		InterfazMenu formulario = new InterfazMenu();
		formulario.setBounds(0,0,400,300);
		formulario.setVisible(true);
		formulario.setLocationRelativeTo(null); 
	}
}
