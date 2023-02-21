package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {

	// Atributo
	private String speciality;

	// Metodo constructor
	public Doctor(String name, String email) {
		super(name, email);
	}

	// Getters y setters
	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

	public void addAvailableAppointment(String date, String time) {
		availableAppointments.add(new Doctor.AvailableAppointment(date, time));
	}

	public ArrayList<AvailableAppointment> getAvailableAppointments() {
		return availableAppointments;
	}

	@Override
	public String toString() {
		return super.toString() + "\nSpeciality: " + speciality + "\nAvailable: " + availableAppointments.toString();
	}

	public static class AvailableAppointment {
		private int id;
		private Date date;
		private String time;
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

		public AvailableAppointment(String date, String time) {
			try {
				this.date = format.parse(date);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			this.time = time;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public Date getDate(String DATE) {
			return date;
		}

		public String getDate() {
			return format.format(date);
		}

		public void setDate(Date date) {
			this.date = date;
		}

		public String getTime() {
			return time;
		}

		public void setTime(String time) {
			this.time = time;
		}

		// Sobreescritura metodo to string. (Polimorfismo)
		@Override
		public String toString() {
			return "Available Appointments \nDate: " + date + "\nTime: " + time;
		}
	}

	// Metodo obligatorio al declararse la clase user como abstracta.
	@Override
	public void showDataUser() {
		System.out.println("Empleado: Hospital Puerta de Hierro");
		System.out.println("Departamento: Oncología");
	}
}
