package application;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;

public class ButtonController{
	
	//String[] apt = new String[3];
	JFrame frame = new JFrame();
	
	ArrayList<Appointment> appt = new ArrayList<>();
	Appointment mon = new Appointment();
	Appointment tue = new Appointment();
	Appointment wed = new Appointment();
	Appointment thur = new Appointment();
	Appointment fri = new Appointment();
	
	@FXML
	Button submitMon;
	@FXML
	Button clearMon;
	@FXML
	Button openMon;
	@FXML
	Button submitTue;
	@FXML
	Button clearTue;
	@FXML
	Button openTue;
	@FXML
	Button submitWed;
	@FXML
	Button clearWed;
	@FXML
	Button openWed;
	@FXML
	Button submitThur;
	@FXML
	Button clearThur;
	@FXML
	Button openThur;
	@FXML
	Button submitFri;
	@FXML
	Button clearFri;
	@FXML
	Button openFri;	
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
	TextArea txtMonApptDeets;
	@FXML
	TextArea txtTueApptDeets;
	@FXML
	TextArea txtWedApptDeets;
	@FXML
	TextArea txtThurApptDeets;
	@FXML
	TextArea txtFriApptDeets;
	
	//MONDAY CONTROLS
	public void submitMonButtonClicked(ActionEvent btnClick) {
		String validTime;
		char validAOrP;
		validTime = txtMonTime.getText().substring(0, 4);
		validAOrP = txtMonTime.getText().charAt(4);
		
		if(ValidTime.checkTime(validTime) == true && ValidTime.checkTimeStamp(validAOrP) == true) {
			mon.time = txtMonTime.getText();
			mon.appointment = txtMonApptDeets.getText();
			mon.day = DayOfTheWeek.MONDAY;
			appt.add(mon);
			//appt.forEach((n) -> System.out.println(n.time + "\n" + n.appointment + "\n" + n.day.toString()));
		}else {
			//custom title, warning icon
			JOptionPane.showMessageDialog(frame, "The time must contain the following format: 1111(a or p)",
			    "Validation Error",
			    JOptionPane.WARNING_MESSAGE);
		}
		
	}
	
	public void clearMonButtonClicked(ActionEvent btnClick) {
		txtMonTime.clear();
		txtMonApptDeets.clear();
	}
	
	public void openMonButtonClicked(ActionEvent btnClick) {
		for(int i = 0; i < appt.size(); i++)
		{
			if(appt.get(i).day == DayOfTheWeek.MONDAY)
			{
				txtMonTime.setText(appt.get(i).time);
				txtMonApptDeets.setText(appt.get(i).appointment);
			}
		}
		
	}
	
	//TUESDAY CONTROLS
	public void submitTueButtonClicked(ActionEvent btnClick) {
		String validTime;
		char validAOrP;
		validTime = txtTueTime.getText().substring(0, 4);
		validAOrP = txtTueTime.getText().charAt(4);
		
		if(ValidTime.checkTime(validTime) == true && ValidTime.checkTimeStamp(validAOrP) == true) {
			tue.time = txtTueTime.getText();
			tue.appointment = txtTueApptDeets.getText();
			tue.day = DayOfTheWeek.TUESDAY;
			appt.add(tue);
			//appt.forEach((n) -> System.out.println(n.time + "\n" + n.appointment + "\n" + n.day.toString()));
		}else {
			//custom title, warning icon
			JOptionPane.showMessageDialog(frame, "The time must contain the following format: 1111(a or p)",
			    "Validation Error",
			    JOptionPane.WARNING_MESSAGE);
		}
	}
	
	public void clearTueButtonClicked(ActionEvent btnClick) {
		txtTueTime.clear();
		txtTueApptDeets.clear();
	}
	
	public void openTueButtonClicked(ActionEvent btnClick) {
		for(int i = 0; i < appt.size(); i++)
		{
			if(appt.get(i).day == DayOfTheWeek.TUESDAY)
			{
				txtTueTime.setText(appt.get(i).time);
				txtTueApptDeets.setText(appt.get(i).appointment);
			}
		}
		
	}

	//WEDNESDAY CONTROLS
	public void submitWedButtonClicked(ActionEvent btnClick) {
		String validTime;
		char validAOrP;
		validTime = txtWedTime.getText().substring(0, 4);
		validAOrP = txtWedTime.getText().charAt(4);
		
		if(ValidTime.checkTime(validTime) == true && ValidTime.checkTimeStamp(validAOrP) == true) {
			wed.time = txtWedTime.getText();
			wed.appointment = txtWedApptDeets.getText();
			wed.day = DayOfTheWeek.WEDNESDAY;
			appt.add(wed);
			//appt.forEach((n) -> System.out.println(n.time + "\n" + n.appointment + "\n" + n.day.toString()));
		}else {
			//custom title, warning icon
			JOptionPane.showMessageDialog(frame, "The time must contain the following format: 1111(a or p)",
			    "Validation Error",
			    JOptionPane.WARNING_MESSAGE);
		}	
	}
	
	public void clearWedButtonClicked(ActionEvent btnClick) {
		txtWedTime.clear();
		txtWedApptDeets.clear();
	}
	
	public void openWedButtonClicked(ActionEvent btnClick) {
		for(int i = 0; i < appt.size(); i++)
		{
			if(appt.get(i).day == DayOfTheWeek.WEDNESDAY)
			{
				txtWedTime.setText(appt.get(i).time);
				txtWedApptDeets.setText(appt.get(i).appointment);
			}
		}
		
	}
	
	//THURSDAY CONTROLS
	public void submitThurButtonClicked(ActionEvent btnClick) {
		String validTime;
		char validAOrP;
		validTime = txtThurTime.getText().substring(0, 4);
		validAOrP = txtThurTime.getText().charAt(4);
		
		if(ValidTime.checkTime(validTime) == true && ValidTime.checkTimeStamp(validAOrP) == true) {
			thur.time = txtThurTime.getText();
			thur.appointment = txtThurApptDeets.getText();
			thur.day = DayOfTheWeek.THURSDAY;
			appt.add(thur);
			//appt.forEach((n) -> System.out.println(n.time + "\n" + n.appointment + "\n" + n.day.toString()));
		}else {
			//custom title, warning icon
			JOptionPane.showMessageDialog(frame, "The time must contain the following format: 1111(a or p)",
			    "Validation Error",
			    JOptionPane.WARNING_MESSAGE);
		}
	}
	
	public void clearThurButtonClicked(ActionEvent btnClick) {
		txtThurTime.clear();
		txtThurApptDeets.clear();
	}
	
	public void openThurButtonClicked(ActionEvent btnClick) {
		for(int i = 0; i < appt.size(); i++)
		{
			if(appt.get(i).day == DayOfTheWeek.THURSDAY)
			{
				txtThurTime.setText(appt.get(i).time);
				txtThurApptDeets.setText(appt.get(i).appointment);
			}
		}
		
	}
	
	//FRIDAY CONTROLS
	public void submitFriButtonClicked(ActionEvent btnClick) {
		String validTime;
		char validAOrP;
		validTime = txtFriTime.getText().substring(0, 4);
		validAOrP = txtFriTime.getText().charAt(4);
		
		if(ValidTime.checkTime(validTime) == true && ValidTime.checkTimeStamp(validAOrP) == true) {
			fri.time = txtFriTime.getText();
			fri.appointment = txtFriApptDeets.getText();
			fri.day = DayOfTheWeek.FRIDAY;
			appt.add(fri);
			//appt.forEach((n) -> System.out.println(n.time + "\n" + n.appointment + "\n" + n.day.toString()));
		}else {
			//custom title, warning icon
			JOptionPane.showMessageDialog(frame, "The time must contain the following format: 1111(a or p)",
			    "Validation Error",
			    JOptionPane.WARNING_MESSAGE);
		}
	}
	
	public void clearFriButtonClicked(ActionEvent btnClick) {
		txtFriTime.clear();
		txtFriApptDeets.clear();
	}
	
	public void openFriButtonClicked(ActionEvent btnClick) {
		for(int i = 0; i < appt.size(); i++)
		{
			if(appt.get(i).day == DayOfTheWeek.FRIDAY)
			{
				txtFriTime.setText(appt.get(i).time);
				txtFriApptDeets.setText(appt.get(i).appointment);
			}
		}
		
	}
	

}
