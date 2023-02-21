package model;

import java.util.ArrayList;
import java.util.Date;

public class Patient extends User {

	// Atributos
	private String birthday;
	private double weight;
	private double height;
	private String bloodType;
	
	private ArrayList<AppointmentDoctor> appointmentDoctors = new ArrayList<>();
	
	public ArrayList<AppointmentDoctor> getAppointmentDoctors() {
		return appointmentDoctors;
	}

	public void addAppointmentDoctors(Doctor doctor, Date date, String time) {
		AppointmentDoctor appointmentDoctor = new AppointmentDoctor(this, doctor);
		appointmentDoctor.schedule(date, time);
		appointmentDoctors.add(appointmentDoctor);
	}

	// Metodo constructor
	public Patient(String name, String email) {
		super(name, email);
		this.birthday = birthday;
		this.weight = weight;
		this.height = height;
		this.bloodType= bloodType;
	}
	
	// Metodo get para que el atributo weight agregue la palabra "kg"
		public String getWeight() {
			return this.weight + " Kg.";
		}
	
	// metodo set para acceder al atributo y asignarle un valor.
	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getHeight() {
		return this.height + " Mts.";
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getBloodType() {
		return bloodType;
	}

	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}
	
	//Este metodo de sobreescritura esta trayendo el comportamiento de la clase padre. (USER)
	@Override
	public String toString(){
		return super.toString() + "\nBirthdate " + birthday + "\nWeight: " + weight + "\nHeight: " + height + "\nBlood Type: " + bloodType;
	}

	//Metodo obligatorio al declararse la clase user como abstracta.
	@Override
	public void showDataUser() {
		System.out.println("Patient");
	}
}