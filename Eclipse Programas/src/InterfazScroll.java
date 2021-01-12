import javax.swing.*;

public class InterfazScroll extends JFrame {

	private JTextField campotexto; 
	private JTextArea areatexto; 
	private JScrollPane scrollpane; //Configuración para los scrolls.
	
	public InterfazScroll() {
		setLayout(null);
		campotexto = new JTextField();
		campotexto.setBounds(10,10,90,30);
		add(campotexto); 
		
		areatexto = new JTextArea();
		scrollpane = new JScrollPane(areatexto); //Que se pueda hacer scroll en el area de texto 
		scrollpane.setBounds(10,50,400,300); //Configuro el scroll, porque el area está dentro
		add(scrollpane); 
	}
	
	public static void main(String args[]) {
		InterfazScroll formulario1 = new InterfazScroll(); 
		formulario1.setBounds(0,0,540,400);
		formulario1.setVisible(true);
		formulario1.setResizable(false); 
		formulario1.setLocationRelativeTo(null);
	}
}
