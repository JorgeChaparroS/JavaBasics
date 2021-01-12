import javax.swing.*;
import java.awt.event.*;

public class InterfazLista extends JFrame implements ActionListener{

	private JTextField campotexto; 
	private JTextArea areatexto; 
	private JScrollPane scrollpane; 
	private JButton boton1, cerrar;
	
	String texto = "";
	
	public InterfazLista() {
		setLayout(null); 
		campotexto = new JTextField(); 
		campotexto.setBounds(10,10,200,30);
		add(campotexto); 
		
		areatexto = new JTextArea(); 
		scrollpane = new JScrollPane(areatexto); 
		scrollpane.setBounds(10,50,400,300); //Configuro el scroll, porque el area está dentro
		add(scrollpane);
		
		boton1 = new JButton("Agregar"); 
		boton1.setBounds(250,10,100,30);
		add(boton1); 
		boton1.addActionListener(this);
		
		cerrar = new JButton("Cerrar"); 
		cerrar.setBounds(360,10,100,30);
		add(cerrar); 
		cerrar.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == boton1) {
			texto += campotexto.getText() + "\n"; //Acumulación y es como el Println
			areatexto.setText(texto); 
			campotexto.setText("");  
		}
		
		if(e.getSource() == cerrar) {
			System.exit(0);
		}
	}
	
	public static void main(String args[]) {
		InterfazLista formulario = new InterfazLista(); 
		formulario.setBounds(0,0,540,400);
		formulario.setVisible(true);
		formulario.setResizable(false);
		formulario.setLocationRelativeTo(null);
	}
}
