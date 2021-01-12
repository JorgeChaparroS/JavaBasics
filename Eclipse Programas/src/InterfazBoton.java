import javax.swing.*;
import java.awt.event.*; //Librería para eventos de componentes 

public class InterfazBoton extends JFrame implements ActionListener { //Escuchar a los eventos

	JButton boton1;
	public InterfazBoton() {
		setLayout(null);
		boton1 = new JButton("Cerrar");
		boton1.setBounds(300,250,100,30); //Que tanto a la izqiuerda, que tanto abajo, ancho y alto
		add(boton1);
		boton1.addActionListener(this); //Asociar el evento al botón
	}
	
	public void actionPerformed(ActionEvent e) { //Para capturar el evento
		if(e.getSource() == boton1) {//Verificar si el evento se originó en el boton1
			System.exit(0); //Finalizar el programa. 
		}
	}
	
	public static void main(String args[]) {
		InterfazBoton formulario1 = new InterfazBoton();
		formulario1.setBounds(0,0,450,350);
		formulario1.setVisible(true);
		formulario1.setResizable(false);
		formulario1.setLocationRelativeTo(null); 
	}
}
