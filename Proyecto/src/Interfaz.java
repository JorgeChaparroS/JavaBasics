import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Interfaz extends JFrame implements ActionListener{
	
	private JTextField textfield1;
	private JLabel label1, label2, label3, label4; 
	private JButton boton1; 
	public static String texto = ""; //La palabra static indica un atributo de clase estático.  
	
	public Interfaz() {
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE); //Para que cuando se cierre el programa. No se quede en ejecución. 
		setTitle("Bienvenido"); 
		getContentPane().setBackground(new Color(255,0,0));
		setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
		
		ImageIcon imagen = new ImageIcon("images/logo-coca.png");
		label1 = new JLabel(imagen);
		label1.setBounds(25,15,300,150);
		add(label1);
		
		label2 = new JLabel("Sistema de Control Vacacional");
		label2.setBounds(35,135,300,30);
		label2.setFont(new Font("Andale Mono",3,18)); //Cursiva, tamaño
		label2.setForeground(new Color(255,255,255));
		add(label2);
		
		label3 = new JLabel("Ingrese su nombre: ");
		label3.setBounds(45,212,200,30);
		label3.setFont(new Font("Andale Mono",1,12)); //Cursiva, tamaño
		label3.setForeground(new Color(255,255,255));
		add(label3);
		
		label4 = new JLabel("© 2017 The Coca-Cola Company");
		label4.setBounds(85,375,300,30);
		label4.setFont(new Font("Andale Mono",1,12)); //Cursiva, tamaño
		label4.setForeground(new Color(255,255,255));
		add(label4);
		
		textfield1 = new JTextField();
		textfield1.setBounds(45,240,255,25);
		textfield1.setBackground(new Color(224,224,224));
		textfield1.setFont(new Font("Andale Mono",1,14));
		textfield1.setForeground(new Color(255,0,0));
		add(textfield1);
		
		boton1 = new JButton("Ingresar");
		boton1.setBounds(125,280,100,30);
		boton1.setBackground(new Color(255,255,255));
		boton1.setFont(new Font("Andale Mono",1,14));
		boton1.setForeground(new Color(255,0,0));
		boton1.addActionListener(this);
		add(boton1);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == boton1) {
			texto = textfield1.getText().trim(); //Método trim es para omitir los espacios antes y después del texto
			if(texto.equals("")) {//Verifica si se escribió texto
				JOptionPane.showMessageDialog(null, "Debes ingresar tu nombre"); //Pop up cuando noo ingrese nombre
			}
			else {//Para abrir la siguiente ventana
				Licencia ventanalicencia = new Licencia(); 
				ventanalicencia.setBounds(0,0,620,380);
				ventanalicencia.setVisible(true);
				ventanalicencia.setResizable(false);
				ventanalicencia.setLocationRelativeTo(null);
				this.setVisible(false); //Que la interfaz bienvenida no se vea
			}
		}
	}
	
	public static void main(String args[]) {
		Interfaz bienvenida = new Interfaz();
		bienvenida.setBounds(0,0,350,450);
		bienvenida.setVisible(true);
		bienvenida.setResizable(false);
		bienvenida.setLocationRelativeTo(null);
	}
}
