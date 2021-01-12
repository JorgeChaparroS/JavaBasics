import javax.swing.*;
import java.awt.event.*;

public class InterfazParse extends JFrame implements ActionListener {

	JTextField valor1, valor2; 
	JButton boton1, botoncerrar; 
	JLabel label1, label2, label3; 
	
	public InterfazParse() {
		setLayout(null); 
		label1 = new JLabel("Valor 1"); 
		label1.setBounds(50,5,100,30);
		add(label1); 
		
		label2 = new JLabel("Valor 2"); 
		label2.setBounds(50,35,100,30);
		add(label2); 
		
		label3 = new JLabel("Resultado: "); 
		label3.setBounds(150,80,100,30);
		add(label3); 
	
		valor1 = new JTextField();
		valor1.setBounds(150,5,100,30);
		add(valor1); 
		
		valor2 = new JTextField();
		valor2.setBounds(150,35,100,30);
		add(valor2); 
		
		boton1 = new JButton("Sumar");
		boton1.setBounds(10,80,100,30);
		add(boton1);
		boton1.addActionListener(this);
		
		botoncerrar = new JButton("Cerrar");
		botoncerrar.setBounds(150,120,100,30);
		add(botoncerrar);
		botoncerrar.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == boton1) {
			int num1 = 0, num2 = 0, resultado = 0; 
			num1 = Integer.parseInt(valor1.getText()); //Comando para convertir Str to Int
			num2 = Integer.parseInt(valor2.getText());
			resultado = num1 + num2; 
			label3.setText("Resultado: " + resultado);
		}
		
		if(e.getSource() == botoncerrar) {
			System.exit(0);
		}
	}
	
	public static void main(String args[]) {
		InterfazParse formulario = new InterfazParse();
		formulario.setBounds(0,0,300,200);
		formulario.setVisible(true);
		formulario.setResizable(false);
		formulario.setLocationRelativeTo(null);
	}
}
