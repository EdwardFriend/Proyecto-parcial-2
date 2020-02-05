package ventanas;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import com.sun.prism.paint.Color;

import java.awt.GridLayout;

public class EditarTabla extends JDialog{
	
	private final JPanel contentPanel = new JPanel();
	private JList busqueda;
	private JTable table;
	private JButton btnAgregar;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JButton btnSalir;
	private JTextField text;
     
	public EditarTabla(VentanaPrincipal win1) {
	
	setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
	setBounds(0, 100, 600, 550);
	getContentPane().setLayout(new BorderLayout(10,10));
	contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
	getContentPane().add(contentPanel);
	setTitle("Editar");
	JPanel panel = new JPanel();
	text = new JTextField();
	text.setColumns(50);
	text.setLayout(new FlowLayout());
	contentPanel.add(text,BorderLayout.NORTH);
	String[] cabecera = {"NOMBRE","APELLIDO","CEDULA","EDAD","DIRECCION","CARGO"};
	String[][] datos={};
	
	table = new JTable(datos, cabecera);
	
	JScrollPane scrollPane = new JScrollPane(table);
	contentPanel.add(scrollPane);
	contentPanel.add(panel);
	contentPanel.add(Paginador.getInstance(),BorderLayout.SOUTH);
	
	JPanel buttonPane = new JPanel();
	buttonPane.setLayout(new FlowLayout(FlowLayout.CENTER));
	getContentPane().add(buttonPane, BorderLayout.SOUTH);
	
	btnAgregar = new JButton("Agregar");
	buttonPane.add(btnAgregar);
	
	btnModificar = new JButton("Modificar");
	buttonPane.add(btnModificar);
	
	btnEliminar = new JButton("Eliminar");
	buttonPane.add(btnEliminar);
	
	btnSalir = new JButton("Salir");
	buttonPane.add(btnSalir);
	
	
	}

	public JList getBusqueda() {
		return busqueda;
	}

	public void setBusqueda(JList busqueda) {
		this.busqueda = busqueda;
	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	public JButton getBtnAgregar() {
		return btnAgregar;
	}

	public void setBtnAgregar(JButton btnAgregar) {
		this.btnAgregar = btnAgregar;
	}

	public JButton getBtnModificar() {
		return btnModificar;
	}

	public void setBtnModificar(JButton btnModificar) {
		this.btnModificar = btnModificar;
	}

	public JButton getBtnEliminar() {
		return btnEliminar;
	}

	public void setBtnEliminar(JButton btnEliminar) {
		this.btnEliminar = btnEliminar;
	}

	public JButton getBtnSalir() {
		return btnSalir;
	}

	public void setBtnSalir(JButton btnSalir) {
		this.btnSalir = btnSalir;
	}

	public JTextField getText() {
		return text;
	}

	public void setText(JTextField text) {
		this.text = text;
	}

	public JPanel getContentPanel() {
		return contentPanel;
	}
	

}
