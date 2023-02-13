
public class Patient {

	// Atributos
	public String name;
	public String email;
	public String address;
	public String phoneNumber;
	public String birthday;
	public double weight;
	public double height;
	public String bloodType;

	// metodo constructor vacio
	Patient() {
	}

	// metodo constructor con dos atributos.
	Patient(String name, String email) {
		this.name = name;
		this.email = email;
	}
}
