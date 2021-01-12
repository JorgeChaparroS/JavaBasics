import javax.swing.*;
import javax.swing.event.*; //Se necesita para los eventos de un check box

public class InterfazCheckbox extends JFrame implements ChangeListener{ //Se necesita para los eventos de un check box

	private JCheckBox check1, check2, check3; 
	
	public InterfazCheckbox() {
		setLayout(null);
		check1 = new JCheckBox("Inglés"); //así se configuran los check box
		check1.setBounds(10,10,150,30);
		check1.addChangeListener(this);
		add(check1); 
		
		check2 = new JCheckBox("Alemán"); 
		check2.setBounds(10,50,150,30);
		check2.addChangeListener(this); 
		add(check2); 
		
		check3 = new JCheckBox("Español"); 
		check3.setBounds(10,90,150,30);
		check3.addChangeListener(this);
		add(check3); 
		
	}
	
	public void stateChanged(ChangeEvent e) { //Eventos para checkbox
		String cad = "";
		if(check1.isSelected() == true) {
			cad = cad + "Inglés - ";
		}
		
		if(check2.isSelected() == true) {
			cad = cad + "Alemán - ";
		}
		
		if(check3.isSelected() == true) {
			cad = cad + "Español - ";
		}
		
		setTitle(cad);
	}
	
	public static void main(String args[]) {
		InterfazCheckbox formulario = new InterfazCheckbox(); 
		formulario.setBounds(0,0,450,200);
		formulario.setVisible(true);
		formulario.setResizable(false);
		formulario.setLocationRelativeTo(null);
	}
}
