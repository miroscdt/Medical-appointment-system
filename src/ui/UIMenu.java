package ui;

import java.util.ArrayList;
import java.util.Scanner;

import model.Doctor;
import model.Patient;

public class UIMenu {
	
	 public static final String[] MONTHS = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

	 //Se declara variable global de tipo static para
	 public static Doctor doctorLogged;
	 public static Patient patientLogged;
	 
	    public static void showMenu(){
	        System.out.println("Welcome to My Appointments");
	        System.out.println("Select your option");

	        int response = 0;
	        do {
	            System.out.println("1. Doctor");
	            System.out.println("2. Patient");
	            System.out.println("0. Exit");

	            Scanner sc = new Scanner(System.in);
	            response = Integer.valueOf(sc.nextLine());

	            switch (response){
	                case 1:
	                    System.out.println("Doctor");
	                    response = 0;
	                    authUser(1);
	                    break;
	                case 2:
	                	System.out.println("Patient");
	                    response = 0;
	                    authUser(2);
	                    break;
	                case 0:
	                    System.out.println("Thank you for you visit");
	                    break;
	                default:
	                    System.out.println("Please select a correct answer");
	            }
	        }while (response != 0);
	    }
	    
	    //Metodo para idenfiticar el tipo de usuario simulando lista de doctores y pacientes.
	    private static void authUser(int userType) {
	    	//userType = 1 Doctor
	    	//userType = 2 Patient
	    	
	    	ArrayList<Doctor> doctors = new ArrayList<>();
	    	doctors.add(new Doctor("Cesar Vivas", "dental@vivas.com"));
	    	doctors.add(new Doctor("Michelle Del Toro", "mich@astetic.com"));
	    	doctors.add(new Doctor("Sergio Barragan", "barragan@medical.com"));
	    	doctors.add(new Doctor("Daniel Garza", "danielg@garza.com"));
	    	
	    	ArrayList<Patient> patients = new ArrayList<>();
	    	patients.add(new Patient("Carlos Torres" ,"carlos@gmail.com"));
	    	patients.add(new Patient("Alan Escobedo" ,"alans@gmail.com"));
	    	patients.add(new Patient("Juan Valderrama" ,"juanitov@gmail.com"));
	    	patients.add(new Patient("Lourdes Mendez" ,"lulu@gmail.com"));
	    	
	    	//Variable para identificar si el correo es correcto y almacenar en variable email.
	    	boolean emailCorrect = false;
	    	do {
	    		System.out.println("Insert your email");
	    		Scanner sc = new Scanner(System.in);
	    		String email = sc.nextLine();
	    		
	    		if(userType == 1) {
	    			for (Doctor d: doctors) {
	    				if (d.getEmail().equals(email)) {
	    					emailCorrect = true;
	    					//Obtenemos el usario logeado.
	    					doctorLogged = d;
	    					UIDoctorMenu.showDoctorMenu();
	    					//Monstrar el menu del doctor.
	    				}
	    			}
	    		}
	    		
	    		if(userType == 2) {
	    			for(Patient p: patients) {
	    				if(p.getEmail().equals(email)) {
	    					emailCorrect = true;
	    					patientLogged = p;
	    					UIPatientMenu.showPatientMenu();
	    					//Monstrar el menu del paciente.
	    				}
	    			}
	    		}
	    		
	    	}while(!emailCorrect);
	    	
	    }
	    
	    static void showPatientMenu(){
	        int response = 0;
	        do {
	            System.out.println("\n\n");
	            System.out.println("Patient");
	            System.out.println("1. Book an appointment");
	            System.out.println("2. My appointments");
	            System.out.println("0. Return");

	            Scanner sc = new Scanner(System.in);
	            response = Integer.valueOf(sc.nextLine());

	            switch (response){
	                case 1:
	                    System.out.println("::Book an appointment::");
	                    for (int i = 1; i < 4; i++) {
	                        System.out.println(i +". " + MONTHS[i]);
	                    }
	                    break;
	                case 2:
	                    System.out.println("::My appointments");
	                    break;
	                case 0:
	                    showMenu();
	                    break;
	            }
	        }while (response != 0);
	    }

		public static void patientLogged() {
			// TODO Auto-generated method stub
			
		}

}
