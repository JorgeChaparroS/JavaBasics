import javax.swing.*;
import javax.swing.event.*;

public class InterfazRadioButton extends JFrame implements ChangeListener{ //Funciona igual que con los check box

	private JRadioButton radio1, radio2, radio3; //Crear componente para cada opcion
	private ButtonGroup bg; //Almacena las opciones del radio button
	
	public InterfazRadioButton() {
		setLayout(null); 
		
		bg = new ButtonGroup(); //No se pone nada en los paréntesis
		radio1 = new JRadioButton("640x480");
		radio1.setBounds(10,20,100,30);
		radio1.addChangeListener(this);
		add(radio1);
		bg.add(radio1); 
		
		radio2 = new JRadioButton("800x600");
		radio2.setBounds(10,70,100,30);
		radio2.addChangeListener(this);
		add(radio2);
		bg.add(radio2); 
		
		radio3 = new JRadioButton("1024x768");
		radio3.setBounds(10,120,100,30);
		radio3.addChangeListener(this);
		add(radio3);
		bg.add(radio3); 
	}
	
	public void stateChanged(ChangeEvent e) {
		if(radio1.isSelected()) { //No hace falta poner true or false
			setSize(640,480);
		}
		
		if(radio2.isSelected()) { //No hace falta poner true or false
			setSize(800,600);
		}
		
		if(radio3.isSelected()) { //No hace falta poner true or false
			setSize(1024,768);
		}
	}
	
	public static void main(String args[]) {
		InterfazRadioButton formulario = new InterfazRadioButton();
		formulario.setBounds(0,0,350,230);
		formulario.setVisible(true);
		formulario.setResizable(false);
	}
}
