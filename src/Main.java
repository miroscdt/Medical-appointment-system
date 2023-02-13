
public class Main {

	public static void main(String[] args) {

		// Los objetos una entidad (algo) que tiene un estado, un comportamiento y una
		// identidad.
		// Declarando el objeto: Tipo de objeto + el nombre del objeto
		// Instanciar el objeto: nombre del objeto = new + nombre del objeto() <-- esto
		// crea el objeto y es el metodo constructor.
		Doctor myDoctor = new Doctor(); // Declarar e instanciar en una sola linea.
		// Utilizando el objeto:
		// A traves de la sintaxis . puedo tener acceso a sus atributos.
		myDoctor.name = "Itzel Mendoza";
		// Llamando al metodo showname y show Id:
		myDoctor.showName();
		myDoctor.showId();

		// Este seria el paquete completo de atributos que conforman un nuevo objeto:
		Doctor myDoctorAnn = new Doctor();
		myDoctor.name = "Salvador Díaz";
		myDoctor.showName();
		myDoctor.showId();

		// Llamos al metodo estatico menu, con el nombre de la clase seguido del punto.
		UIMenu.showMenu();
		UIMenu.showPatientMenu();

		// Creando clase y objeto patient
		Patient patient = new Patient();

	}

}
