package Pruebas;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;

public class EstasSolo extends JFrame{
	
	private final JPanel contentPanel = new JPanel();
	private JPanel panel_1;
	private JPanel panel_2;
	private JList busqueda;
	private JTable table;
	private JButton btnAgregar;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JButton btnSalir;
     
	public EstasSolo() {
	
	setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
	setBounds(100, 100, 500, 400);
	getContentPane().setLayout(new BorderLayout());
	contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
	getContentPane().add(contentPanel, BorderLayout.CENTER);
	contentPanel.setLayout(new GridLayout(3, 0, 0, 0));
	
	JPanel panel = new JPanel();
	contentPanel.add(panel);
	setTitle("Empleados");
	
	String[] cabecera = {"NOMBRE","APELLIDO","CEDULA","EDAD","DIRECCION","CARGO"};
	String[][] datos={};
	
	JScrollPane scrollPane = new JScrollPane();
	contentPanel.add(scrollPane, BorderLayout.CENTER);
	
	table = new JTable(datos, cabecera);
	scrollPane.setViewportView(table);
	
	
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
	

}
