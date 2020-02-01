package clases;
/**
 * 
 * @author MARIO LUZARDO
 * @author MICHAEL CRUZ
 *
 */
public class Cliente extends Persona{
	private long telefono_de_contacto;
	public Cliente() {
		
	}
	public Cliente(String nombre,int edad, long telefono_de_contacto) {
		super(nombre,edad);
		this.telefono_de_contacto=telefono_de_contacto;
	}
	@Override
	public void mostrar() {
		System.out.println("Nombre: "+getNombre()+
				           "\nEdad: "+getEdad()+
				           "\nTelefono de Contacto: "+this.telefono_de_contacto);
	}
	public long getTelefono_de_contacto() {
		return telefono_de_contacto;
	}
	public void setTelefono_de_contacto(long telefono_de_contacto) {
		this.telefono_de_contacto = telefono_de_contacto;
	}
}
