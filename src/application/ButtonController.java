package application;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;

public class ButtonController{
	
	//String[] apt = new String[3];
	JFrame frame = new JFrame();
	
	ArrayList<Appointment> appt = new ArrayList<>();
	ArrayList<Appointment> days = new ArrayList<>();
	Appointment mon = new Appointment();
	Appointment tue = new Appointment();
	Appointment wed = new Appointment();
	Appointment thur = new Appointment();
	Appointment fri = new Appointment();
	
	private static ValidTime validTime;
	
	public static void initialize()
	{
		validTime = new ValidTime();
	}
	
	@FXML
	Button submit;
	@FXML
	Button clear;
	@FXML
	Button open;	
	@FXML
	TextField txtMonTime;
	@FXML
	TextField txtTueTime;
	@FXML
	TextField txtWedTime;
	@FXML
	TextField txtThurTime;
	@FXML
	TextField txtFriTime;	
	@FXML
	TextField txtMonApptDeets;
	@FXML
	TextField txtTueApptDeets;
	@FXML
	TextField txtWedApptDeets;
	@FXML
	TextField txtThurApptDeets;
	@FXML
	TextField txtFriApptDeets;
	@FXML
	TextArea monApptList;
	@FXML
	TextArea tueApptList;
	@FXML
	TextArea wedApptList;
	@FXML
	TextArea thurApptList;
	@FXML
	TextArea friApptList;
	
	//SUBMIT CONTROLS
	public void submitButtonClicked(ActionEvent btnClick) {
		
		initialize();
		
		addDays();
		
		for(int i = 0; i < days.size(); i++)
		{
			if(validTime.checkTime(days.get(i).time) == true)
			{
				appt.add(days.get(i));
			}
			else
			{
				//custom title, warning icon
				JOptionPane.showMessageDialog(frame, "One or more times do not follow the format: " + "\n" + "1a|p, 11a|p, 1100a|p, 11:00a|p",
				    "Validation Error",
				    JOptionPane.WARNING_MESSAGE);
			}
		}
		
	}
	
	public void clearButtonClicked(ActionEvent btnClick) {
		txtMonTime.clear();
		txtMonApptDeets.clear();
		monApptList.clear();
		txtTueTime.clear();
		txtTueApptDeets.clear();
		tueApptList.clear();
		txtWedTime.clear();
		txtWedApptDeets.clear();
		wedApptList.clear();
		txtThurTime.clear();
		txtThurApptDeets.clear();
		thurApptList.clear();
		txtFriTime.clear();
		txtFriApptDeets.clear();
		friApptList.clear();
	}
	
	public void openButtonClicked(ActionEvent btnClick) {
		for(int i = 0; i < appt.size(); i++)
		{			
			switch(appt.get(i).day)
			{
				case MONDAY:
					monApptList.setText(appt.get(i).apptList.toString());
					txtMonTime.setText(appt.get(i).time);
					txtMonApptDeets.setText(appt.get(i).appointment);
					continue;
				case TUESDAY:
					tueApptList.setText(appt.get(i).apptList.toString());
					txtTueTime.setText(appt.get(i).time);
					txtTueApptDeets.setText(appt.get(i).appointment);
					continue;
				case WEDNESDAY:
					wedApptList.setText(appt.get(i).apptList.toString());
					txtWedTime.setText(appt.get(i).time);
					txtWedApptDeets.setText(appt.get(i).appointment);
					continue;
				case THURSDAY:
					thurApptList.setText(appt.get(i).apptList.toString());
					txtThurTime.setText(appt.get(i).time);
					txtThurApptDeets.setText(appt.get(i).appointment);
					continue;
				case FRIDAY:
					friApptList.setText(appt.get(i).apptList.toString());
					txtFriTime.setText(appt.get(i).time);
					txtFriApptDeets.setText(appt.get(i).appointment);
					continue;
			}
		}		
	}
	
	public void addDays()
	{
		mon.time = txtMonTime.getText();
		mon.appointment = txtMonApptDeets.getText();
		mon.apptList.add(mon.time + " - " + mon.appointment + "\n");
		mon.day = DayOfTheWeek.MONDAY;
		days.add(mon);
		
		tue.time = txtTueTime.getText();
		tue.appointment = txtTueApptDeets.getText();
		tue.apptList.add(tue.time + " - " + tue.appointment + "\n");
		tue.day = DayOfTheWeek.TUESDAY;
		days.add(tue);
		
		wed.time = txtWedTime.getText();
		wed.appointment = txtWedApptDeets.getText();
		wed.apptList.add(wed.time + " - " + wed.appointment + "\n");
		wed.day = DayOfTheWeek.WEDNESDAY;
		days.add(wed);
		
		thur.time = txtThurTime.getText();
		thur.appointment = txtThurApptDeets.getText();
		thur.apptList.add(thur.time + " - " + thur.appointment + "\n");
		thur.day = DayOfTheWeek.THURSDAY;
		days.add(thur);
		
		fri.time = txtFriTime.getText();
		fri.appointment = txtFriApptDeets.getText();
		fri.apptList.add(fri.time + " - " + fri.appointment + "\n");
		fri.day = DayOfTheWeek.FRIDAY;		
		days.add(fri);
	}
}
