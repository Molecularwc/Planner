package application;

import java.util.ArrayList;
import java.util.List;

public class Appointment {
	DayOfTheWeek day;
	String time;
	String appointment;
	ArrayList<String> apptList = new ArrayList<>();
	
	public Appointment() {
		//time = this.time;
		//appointment = this.appointment;
		//day = this.day;
	}
	
	public Appointment(String t, String a, DayOfTheWeek d, ArrayList<String> l) {
		t = this.time;
		a = this.appointment;
		l = this.apptList;
		d = this.day;
	}

}
