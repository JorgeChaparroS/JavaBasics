import javax.swing.*;

public class InterfazGrafica extends JFrame {
	
	private JLabel label1; 
	private JLabel label2; 
	
	public InterfazGrafica() { //Dise�o de las etiquetas
		setLayout(null); //Es para indicar que se dar�n coordenadas
		label1 = new JLabel("Interfaz Gr�fica");
		label1.setBounds(10,20,300,30);
		add(label1); //Sin este m�todo no se mostrar� la etiqueta
		label2 = new JLabel("Versi�n 1.0 de interfaz"); 
		label2.setBounds(10,100,600,30);
		add(label2); 
	}
	
	public static void main(String args[]) {
		InterfazGrafica formulario1 = new InterfazGrafica(); 
		formulario1.setBounds(0,0,300,200);
		formulario1.setResizable(false);
		formulario1.setVisible(true);
		formulario1.setLocationRelativeTo(null); //Que se muestre en el centro	
	}
}
