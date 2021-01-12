import javax.swing.*;
import java.awt.event.*; //Librería para eventos de componentes 

public class InterfazCampoTexto extends JFrame implements ActionListener {

	private JTextField campotexto; //Componente tipo JTextField
	private JLabel label1; 
	private JButton boton1, botoncerrar; 
	
	public InterfazCampoTexto() {
		setLayout(null); 
		label1 = new JLabel("Usuario: ");
		label1.setBounds(10,10,100,30);
		add(label1); 
		
		campotexto = new JTextField();
		campotexto.setBounds(120,17,150,20);
		add(campotexto); 
		
		boton1 = new JButton("Ingresar");
		boton1.setBounds(10,80,100,30);
		add(boton1);
		boton1.addActionListener(this);
		
		botoncerrar = new JButton("Cerrar");
		botoncerrar.setBounds(150,80,100,30);
		add(botoncerrar);
		botoncerrar.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == boton1) {
			String texto = campotexto.getText(); 
			setTitle(texto); //Coloca el título a la interfaz
		}
		
		if(e.getSource() == botoncerrar) {
			System.exit(0);
		}
	}
	
	public static void main(String args[]) {
		InterfazCampoTexto formulario1 = new InterfazCampoTexto();
		formulario1.setBounds(0,0,300,180);
		formulario1.setVisible(true);
		formulario1.setResizable(false);
		formulario1.setLocationRelativeTo(null); 
	}
}
