import javax.swing.*;

public class InterfazAreaTexto extends JFrame{

	private JTextField campotexto; 
	private JTextArea areatexto; //Tipo de objeto para área de texto
	
	public InterfazAreaTexto() {
		setLayout(null); 
		campotexto = new JTextField(); 
		campotexto.setBounds(10,10,200,30);
		add(campotexto); 
		
		areatexto = new JTextArea(); 
		areatexto.setBounds(10,50,200,300); 
		add(areatexto); 
	}
	
	public static void main(String args[]) {
		InterfazAreaTexto formulario1 = new InterfazAreaTexto(); 
		formulario1.setBounds(0,0,540,400);
		formulario1.setVisible(true);
		formulario1.setResizable(false);
		formulario1.setLocationRelativeTo(null); 
	}
}
