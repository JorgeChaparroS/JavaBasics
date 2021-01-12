import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class InterfazTerminosCondiciones extends JFrame implements ActionListener, ChangeListener { //Se puede implementar más de una casa (una para eventos de botón y otra para check box

	private JCheckBox check1;
	private JButton boton1; 
	private JLabel label1; 
	
	public InterfazTerminosCondiciones() {
		setLayout(null);
		label1 = new JLabel("Aceptar los términos y condiciones");
		label1.setBounds(10,10,200,30);
		add(label1);
		
		check1 = new JCheckBox("Acepto");
		check1.setBounds(10,50,100,30);
		check1.addChangeListener(this);
		add(check1);
		
		boton1 = new JButton("Cerrar");
		boton1.setBounds(10,100,100,30);
		add(boton1);
		boton1.addActionListener(this);
		boton1.setEnabled(false); //Para que esté deshabilitado desde el comienzo
		
	}
	
	//Se deben crear métodos para el check box y para el botón
	
	public void stateChanged(ChangeEvent e) {
		if(check1.isSelected() == true) {
			boton1.setEnabled(true);
		}
		
		else {
			boton1.setEnabled(false);
		}
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == boton1) {
			System.exit(0);
		}
	}
	
	public static void main(String args[]) {
		InterfazTerminosCondiciones formulario = new InterfazTerminosCondiciones(); 
		formulario.setBounds(0,0,250,200);
		formulario.setVisible(true);
		formulario.setResizable(false); 
		formulario.setLocationRelativeTo(null);
	}
}
