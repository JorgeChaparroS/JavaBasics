import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class InterfazSubmenu extends JFrame implements ActionListener{

	private JMenuBar menubar; 
	private JMenu menu1, submenu1, submenu2; //Acá se agregan las pestañas desplegables (De la barra y los submenús)
	private JMenuItem menuitem1, menuitem2, menuitem3, menuitem4; //Componentes del menú y submenú
	private JButton botoncerrar; 
	
	public InterfazSubmenu() {
		setLayout(null); 
		
		menubar = new JMenuBar(); 
		setJMenuBar(menubar);
		
		menu1 = new JMenu("Opciones");
		menubar.add(menu1);
		
		submenu1 = new JMenu("Tamaño de la ventana");
		menu1.add(submenu1); 
		
		submenu2 = new JMenu("Color de fondo");
		menu1.add(submenu2); 
		
		menuitem1 = new JMenuItem("300x200");
		submenu1.add(menuitem1);
		menuitem1.addActionListener(this);
		
		menuitem2 = new JMenuItem("640x480");
		submenu1.add(menuitem2); 
		menuitem2.addActionListener(this);
		
		menuitem3 = new JMenuItem("Rojo");
		submenu2.add(menuitem3); 
		menuitem3.addActionListener(this);
		
		menuitem4 = new JMenuItem("Verde"); 
		submenu2.add(menuitem4);
		menuitem4.addActionListener(this);
		
		botoncerrar = new JButton("Cerrar");
		botoncerrar.setBounds(10,10,90,30);
		add(botoncerrar); 
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == menuitem1) {
			setSize(300,200); //Comando para cambiar tamaño de interfaz
		}
		
		if(e.getSource() == menuitem2) {
			setSize(640,480); //Cambiar dimensiones. 
		}
		
		if(e.getSource() == menuitem3) {
			getContentPane().setBackground(new Color(255,0,0)); //Colocar directamente el color, sin guardarlo en una variable
		}
		
		if(e.getSource() == menuitem4) {
			getContentPane().setBackground(new Color(0,255,0)); 
		}
		
		if(e.getSource() == botoncerrar) {
			System.exit(0);
		}
	}
	
	public static void main(String args[]) {
		InterfazSubmenu formulario = new InterfazSubmenu();
		formulario.setBounds(0,0,300,200);
		formulario.setVisible(true);
		formulario.setResizable(false);
		formulario.setLocationRelativeTo(null);
	}
	
}
