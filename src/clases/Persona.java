package clases;
/**
 * 
 * @author MARIO LUZARDO
 * @author MICHAEL CRUZ
 *
 */
public class Persona {
	private String nombre;
	private int edad;
	public Persona() {
		
	}
	public Persona(String nombre, int edad) {
		this.edad=edad;
		this.nombre=nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public void mostrar() {
		System.out.println("Nombre: "+nombre+
						   "\nEdad: "+edad);
	}
}
