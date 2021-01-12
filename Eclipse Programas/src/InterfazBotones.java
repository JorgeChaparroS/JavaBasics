import javax.swing.*;
import java.awt.event.*; //Librería para eventos de componentes 

public class InterfazBotones extends JFrame implements ActionListener{

	private JButton boton1, boton2, boton3, botoncerrar;
	private JLabel label1; 
	
	public InterfazBotones() {
		setLayout(null);
		boton1 = new JButton("Botón 1");
		boton1.setBounds(10,100,90,30); //Que tanto a la izqiuerda, que tanto abajo, ancho y alto
		add(boton1);
		boton1.addActionListener(this); 
		
		boton2 = new JButton("Botón 2");
		boton2.setBounds(110,100,90,30); //Que tanto a la izqiuerda, que tanto abajo, ancho y alto
		add(boton2);
		boton2.addActionListener(this); 
		
		boton3 = new JButton("Botón 3");
		boton3.setBounds(210,100,90,30); //Que tanto a la izqiuerda, que tanto abajo, ancho y alto
		add(boton3);
		boton3.addActionListener(this); 
		
		botoncerrar = new JButton("Cerrar");
		botoncerrar.setBounds(210,150,90,30); //Que tanto a la izqiuerda, que tanto abajo, ancho y alto
		add(botoncerrar);
		botoncerrar.addActionListener(this); 
		
		label1 = new JLabel("En espera...");
		label1.setBounds(10,10,300,30);
		add(label1); 
	}
	
	public void actionPerformed(ActionEvent e) { //Se guarda en la variable e
		if(e.getSource() == boton1) {
			label1.setText("Presionó el botón 1"); 
		}
		
		else if(e.getSource() == boton2) {
			label1.setText("Presionó el botón 2"); 
		}
		
		else if(e.getSource() == boton3) {
			label1.setText("Presionó el botón 3"); 
		}
		
		else if(e.getSource() == botoncerrar) {
			System.exit(0); //Finalizar el programa. 
		}
	}
	
	public static void main(String args[]) {
		InterfazBotones formulario1 = new InterfazBotones(); 
		formulario1.setBounds(0,0,330,240);
		formulario1.setVisible(true);
		formulario1.setResizable(false);
		formulario1.setLocationRelativeTo(null); 
	}
}
