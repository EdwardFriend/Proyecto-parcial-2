package ventanas;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import escuchadores.Inicio;



/**
 * @author CYBER-SERVER
 *
 */
@SuppressWarnings("serial")
public class CrearEmpresa extends JDialog {
	private static CrearEmpresa instance = null;
	private JTextField tex1;
	private JTextField tex2;
	private JButton but1;
	private JButton but2;
	
	/**
	 * 
	 */
	public CrearEmpresa() {
		this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		this.setSize(250, 140);
		this.setLocationRelativeTo(null);
		this.setTitle("Crear Empresa");
		
		JPanel centro = new JPanel();
		tex1 = new JTextField();
		tex1.setColumns(10);
		centro.add(new JLabel("Nombre: "));
		centro.add(tex1);
		
		tex2 = new JTextField();
		tex2.setColumns(3);
		centro.add(new JLabel("Datos/Pagina: "));
		centro.add(tex2);
		
		JPanel sur = new JPanel();
		but1 = new JButton("Crear");
		but1.addActionListener(new Inicio(this));
		but2 = new JButton("Cancelar");
		but2.addActionListener(new Inicio(this));
		
		sur.add(but1);
		sur.add(but2);
		getContentPane().add(centro, BorderLayout.CENTER);
		getContentPane().add(sur, BorderLayout.SOUTH);
	}
	/**
	 * @return the tex1
	 */
	public JTextField getTex1() {
		return tex1;
	}
	/**
	 * @param tex1 the tex1 to set
	 */
	public void setTex1(JTextField tex1) {
		this.tex1 = tex1;
	}
	/**
	 * @return the tex2
	 */
	public JTextField getTex2() {
		return tex2;
	}
	/**
	 * @param tex2 the tex2 to set
	 */
	public void setTex2(JTextField tex2) {
		this.tex2 = tex2;
	}
	/**
	 * @return the but1
	 */
	public JButton getBut1() {
		return but1;
	}
	/**
	 * @param but1 the but1 to set
	 */
	public void setBut1(JButton but1) {
		this.but1 = but1;
	}
	/**
	 * @return the but2
	 */
	public JButton getBut2() {
		return but2;
	}
	/**
	 * @param but2 the but2 to set
	 */
	public void setBut2(JButton but2) {
		this.but2 = but2;
	}
	public static CrearEmpresa getInstance() {
		if(instance==null){
			instance = new CrearEmpresa();
		}
		return instance;
	}
	public static void setInstance(CrearEmpresa instance) {
		CrearEmpresa.instance = instance;
	}

}
