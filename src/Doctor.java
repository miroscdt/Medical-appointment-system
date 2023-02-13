
public class Doctor {

	// La clase es el molde con el que se crean los objetos.
	// Propiedades - Atributos
	static int id = 0;
	String name;
	String speciality;

	// Metodo constructor vacio.
	// Java crea un método constructor en caso de que no definamos uno, pero de
	// todas formas es muy buena idea programarlo nosotros,
	// ya que nos permite definir y/o configurar el comportamiento de nuestros
	// objetos usando argumentos.
	Doctor() {
		// comportamiento; cada que llame al metodo doctor se imprime esto en consola:
		System.out.println("Esto está creando un nuevo objeto Doctor");
		id++;
	}

	// Metodo constructor con parametros.
	Doctor(String name) {
		System.out.println("El nombre del Doctor es: " + name);
	}

	// Comportamientos - Metodos
	public void showName() {
		System.out.println(name);
	}

	// metodo para que cada el valor de id del doctor se muestre:
	public void showId() {
		System.out.println(id);
	}
}
