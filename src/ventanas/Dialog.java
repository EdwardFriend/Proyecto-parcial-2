package Pruebas;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Dialog extends JDialog {
	
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
     
	public Dialog() {
	
	setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
	setBounds(100, 100, 500, 400);
	getContentPane().setLayout(new BorderLayout());
	contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
	getContentPane().add(contentPanel, BorderLayout.CENTER);
	contentPanel.setLayout(new GridLayout(6, 0, 0, 0));
	
	JPanel panel = new JPanel();
	contentPanel.add(panel);
	setTitle("Empleados");
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
	buttonPane.add(btnGuardar);
	
	btnCancelar = new JButton("Cancelar");
	buttonPane.add(btnCancelar);
	}
	
}
