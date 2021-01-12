import javax.swing.*;
import java.awt.event.*;

public class InterfazComboBox extends JFrame implements ItemListener {//Clase para esperar el evento en combo box

	private JComboBox lista; //Configuración del componente combo box
	
	public InterfazComboBox() {
		setLayout(null);
		lista = new JComboBox(); //Nunca colocar texto porque se putea el programa
		lista.setBounds(10,10,80,20);
		add(lista);
		lista.addItem("Rojo");
		lista.addItem("Azul");
		lista.addItem("Verde");
		lista.addItem("Negro");
		lista.addItem("Amarillo"); //Se pueden agregar las opciones que yo quiera
		lista.addItemListener(this);//Indicar que el combo box tendrá un evento
	}
	
	public void itemStateChanged(ItemEvent e) {//Configuración de los eventos
		if(e.getSource() == lista) {
			String texto = lista.getSelectedItem().toString();//Convertir a string lo que se haya seleccionado y almacenarlo en variable 
			setTitle(texto);
		}
	}
	
	public static void main(String args[]) {
		InterfazComboBox formulario = new InterfazComboBox();
		formulario.setBounds(0,0,300,150);
		formulario.setVisible(true);
		formulario.setResizable(false);
		formulario.setLocationRelativeTo(null);
	}
}
