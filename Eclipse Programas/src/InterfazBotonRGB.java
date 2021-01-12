import javax.swing.*;
import java.awt.event.*;
import java.awt.*; //Para los colores

public class InterfazBotonRGB extends JFrame implements ActionListener{//Porque aunque haya comboboxes, el evento está en el botón

	private JLabel label1, label2, label3;
	private JComboBox lista1, lista2, lista3; 
	private JButton boton1, botoncerrar; 
	
	public InterfazBotonRGB() {
		setLayout(null);
		label1 = new JLabel("Rojo:");
		label1.setBounds(10,10,100,10);
		add(label1);
		
		lista1 = new JComboBox();
		lista1.setBounds(120,10,50,30);
		for(int i = 0; i < 256; i++) {
			lista1.addItem(String.valueOf(i)); //Otra forma de hacer parseo
		}
		add(lista1); 
		
		label2 = new JLabel("Verde:");
		label2.setBounds(10,50,100,10);
		add(label2);
		
		lista2 = new JComboBox();
		lista2.setBounds(120,50,50,30);
		for(int i = 0; i < 256; i++) {
			lista2.addItem(String.valueOf(i)); //Otra forma de hacer parseo
		}
		add(lista2); 
		
		label3 = new JLabel("Azul:");
		label3.setBounds(10,90,100,10);
		add(label3);
		
		lista3 = new JComboBox();
		lista3.setBounds(120,90,50,30);
		for(int i = 0; i < 256; i++) {
			lista3.addItem(String.valueOf(i)); //Otra forma de hacer parseo
		}
		add(lista3); 
		
		boton1 = new JButton("Fijar color");
		boton1.setBounds(10,130,100,30);
		add(boton1); 
		boton1.addActionListener(this);
		
		botoncerrar = new JButton("Cerrar");
		botoncerrar.setBounds(10,170,100,30);
		add(botoncerrar);
		botoncerrar.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == boton1) {
			String cad1 = lista1.getSelectedItem().toString();
			String cad2 = lista2.getSelectedItem().toString();
			String cad3 = lista3.getSelectedItem().toString();
			int num1 = Integer.parseInt(cad1);
			int num2 = Integer.parseInt(cad2);
			int num3 = Integer.parseInt(cad3);
			
			Color color1 = new Color(num1,num2,num3);
			Color color2 = new Color(num2,num3,num1);
			boton1.setBackground(color1);
			botoncerrar.setBackground(color2);
		}
		
		if(e.getSource() == botoncerrar) {
			System.exit(0);
		}
	}
	
	public static void main(String args[]) {
		InterfazBotonRGB formulario = new InterfazBotonRGB();
		formulario.setBounds(0,0,210,260);
		formulario.setVisible(true);
		formulario.setResizable(false);
		formulario.setLocationRelativeTo(null);
	}
}
