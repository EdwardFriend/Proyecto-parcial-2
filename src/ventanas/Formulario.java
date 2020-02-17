package ventanas;
import escuchadores.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;

import escuchadores.AccionEditar;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Formulario extends JDialog {
	
	private final JPanel contentPanel = new JPanel();
	private JTextField txtNombre;
	private JPanel panel_1;
	private JLabel lblApellido;
	private JTextField txtApellido;
	private JLabel lblCedula;
	private JTextField txtCedula;
	private JLabel lblEdad;
	private JTextField txtEdad;
	private JLabel lblSexo;
	private JRadioButton rbHombre;
	private JRadioButton rbMujer;
	private JLabel cargo;
	private JCheckBox check1;
	private JButton btnGuardar;
	private JButton btnCancelar;
     
	public Formulario(EditarTabla win2) {
	
	setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
	setBounds(775, 100, 500, 400);
	getContentPane().setLayout(new BorderLayout());
	contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
	getContentPane().add(contentPanel, BorderLayout.CENTER);
	contentPanel.setLayout(new GridLayout(6, 0, 0, 0));
	
	JPanel panel = new JPanel();
	contentPanel.add(panel);
	setTitle("Formulario");
	
	//Nombre
	JLabel lblNombre = new JLabel("Nombre:");
	panel.add(lblNombre);
	txtNombre = new JTextField();
	panel.add(txtNombre);
	txtNombre.setColumns(10);
	txtNombre.addActionListener(new AccionFormulario(this));
	
	//Apellido
	panel_1 = new JPanel();
	contentPanel.add(panel_1);
	lblApellido = new JLabel("Apellido:");
	panel_1.add(lblApellido);
	txtApellido = new JTextField();
	panel_1.add(txtApellido);
	txtApellido.setColumns(10);
	txtApellido.addActionListener(new AccionFormulario(this));
	
	//Edad
	JPanel panel_3 = new JPanel();
	contentPanel.add(panel_3);
	lblEdad = new JLabel("Edad:");
	panel_3.add(lblEdad);
	txtEdad = new JTextField();
	panel_3.add(txtEdad);
	txtEdad.setColumns(10);
	txtEdad.addActionListener(new AccionFormulario(this));
	
	//Sexo
	JPanel panel_4 = new JPanel();
	contentPanel.add(panel_4);
	lblSexo = new JLabel("Sexo");
	rbHombre = new JRadioButton("Hombre");
	rbHombre.addActionListener(new AccionFormulario(this));
	rbMujer = new JRadioButton("Mujer");
	rbMujer.addActionListener(new AccionFormulario(this));
	panel_4.add(lblSexo);
	panel_4.add(rbHombre);
	panel_4.add(rbMujer);
 
	//Supervisor
	JPanel panel_5 = new JPanel();
	contentPanel.add(panel_5);
	cargo =new JLabel("Supervisor:");
	panel_5.add(cargo);
	check1 = new JCheckBox ();
	check1.addActionListener(new AccionFormulario(this));
	panel_5.add(check1);
	
	
	JPanel buttonPane = new JPanel();
	buttonPane.setLayout(new FlowLayout(FlowLayout.CENTER));
	getContentPane().add(buttonPane, BorderLayout.SOUTH);
	
	btnGuardar = new JButton("Guardar");
	btnGuardar.addActionListener(new AccionFormulario(this));
	buttonPane.add(btnGuardar);
	
	btnCancelar = new JButton("Cancelar");
	btnCancelar.addActionListener(new AccionFormulario(this));
	buttonPane.add(btnCancelar);
	}

	public JTextField getTxtNombre() {
		return txtNombre;
	}

	public void setTxtNombre(JTextField txtNombre) {
		this.txtNombre = txtNombre;
	}

	public JPanel getPanel_1() {
		return panel_1;
	}

	public void setPanel_1(JPanel panel_1) {
		this.panel_1 = panel_1;
	}

	public JLabel getLblApellido() {
		return lblApellido;
	}

	public void setLblApellido(JLabel lblApellido) {
		this.lblApellido = lblApellido;
	}

	public JTextField getTxtApellido() {
		return txtApellido;
	}

	public void setTxtApellido(JTextField txtApellido) {
		this.txtApellido = txtApellido;
	}

	public JLabel getLblEdad() {
		return lblEdad;
	}

	public void setLblEdad(JLabel lblEdad) {
		this.lblEdad = lblEdad;
	}

	public JTextField getTxtEdad() {
		return txtEdad;
	}

	public void setTxtEdad(JTextField txtEdad) {
		this.txtEdad = txtEdad;
	}

	public JLabel getCargo() {
		return cargo;
	}

	public void setCargo(JLabel cargo) {
		this.cargo = cargo;
	}

	public JCheckBox getCheck1() {
		return check1;
	}

	public void setCheck1(JCheckBox check1) {
		this.check1 = check1;
	}

	public JButton getBtnGuardar() {
		return btnGuardar;
	}

	public void setBtnGuardar(JButton btnGuardar) {
		this.btnGuardar = btnGuardar;
	}

	public JButton getBtnCancelar() {
		return btnCancelar;
	}

	public void setBtnCancelar(JButton btnCancelar) {
		this.btnCancelar = btnCancelar;
	}

	public JPanel getContentPanel() {
		return contentPanel;
	}

	public JLabel getLblSexo() {
		return lblSexo;
	}

	public void setLblSexo(JLabel lblSexo) {
		this.lblSexo = lblSexo;
	}

	public JRadioButton getRbHombre() {
		return rbHombre;
	}

	public void setRbHombre(JRadioButton rbHombre) {
		this.rbHombre = rbHombre;
	}

	public JRadioButton getRbMujer() {
		return rbMujer;
	}

	public void setRbMujer(JRadioButton rbMujer) {
		this.rbMujer = rbMujer;
	}
	
}
