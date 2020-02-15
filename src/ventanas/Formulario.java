package ventanas;
import escuchadores.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JPanel;
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
	private JLabel lblDireccion;
	private JTextField txtDireccion;
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
	JLabel lblNombre = new JLabel("Nombre:");
	panel.add(lblNombre);
	
	txtNombre = new JTextField();
	panel.add(txtNombre);
	txtNombre.setColumns(10);
	
	panel_1 = new JPanel();
	contentPanel.add(panel_1);
	lblApellido = new JLabel("Apellido:");
	panel_1.add(lblApellido);
	txtApellido = new JTextField();
	panel_1.add(txtApellido);
	txtApellido.setColumns(10);
	
	JPanel panel_2 = new JPanel();
	contentPanel.add(panel_2);
	lblCedula = new JLabel("Cedula:");
	panel_2.add(lblCedula);
	txtCedula = new JTextField();
	panel_2.add(txtCedula);
	txtCedula.setColumns(10);
	
	JPanel panel_3 = new JPanel();
	contentPanel.add(panel_3);
	lblEdad = new JLabel("Edad:");
	panel_3.add(lblEdad);
	txtEdad = new JTextField();
	panel_3.add(txtEdad);
	txtEdad.setColumns(10);
	
	JPanel panel_4 = new JPanel();
	contentPanel.add(panel_4);
	lblDireccion = new JLabel("Direccion:");
	panel_4.add(lblDireccion);
	txtDireccion = new JTextField();
	panel_4.add(txtDireccion);
	txtDireccion.setColumns(10);
	
	JPanel panel_5 = new JPanel();
	contentPanel.add(panel_5);
	cargo =new JLabel("Supervisor:");
	panel_5.add(cargo);
	check1 = new JCheckBox ();
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

	public JLabel getLblCedula() {
		return lblCedula;
	}

	public void setLblCedula(JLabel lblCedula) {
		this.lblCedula = lblCedula;
	}

	public JTextField getTxtCedula() {
		return txtCedula;
	}

	public void setTxtCedula(JTextField txtCedula) {
		this.txtCedula = txtCedula;
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

	public JLabel getLblDireccion() {
		return lblDireccion;
	}

	public void setLblDireccion(JLabel lblDireccion) {
		this.lblDireccion = lblDireccion;
	}

	public JTextField getTxtDireccion() {
		return txtDireccion;
	}

	public void setTxtDireccion(JTextField txtDireccion) {
		this.txtDireccion = txtDireccion;
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
	
}
