package labs;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyRegistration implements ActionListener { 
	 private JFrame myFrame;
	  private JPanel controlPanel;
	  private JLabel title;
	  private JTextField nameField, number, addressField, reset;
	  private JTextArea output;
	  private JButton submit, reset1;
	  private JLabel name, cell, gender, dateOB, address, res;
	  private JCheckBox termsAndCond;
	  private JRadioButton male, female;
	  private JComboBox day, month, year;
	  private String [] dates = {".","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15",
	          "16","17","18","19","20","21","22","23","24","25","26",
	          "27","28","29","30","31",};
	 
	  private String [] months = {"...","January","February","March","April","May","June",
	          "July","August","September","October","November","December"};
	 
	  private String [] years = {"...","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009",
	          "2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020",};
	 
	  public MyRegistration() {
	      myFrame = new JFrame("Registration Form");
	      myFrame.setBounds(300, 90, 900, 600);
	      myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      myFrame.setResizable(false);
	      controlPanel = new JPanel();
	      controlPanel.setLayout(null);
	     
	      title = new JLabel("Registration Form");
	      title.setSize(300, 30);
	      title.setLocation(300, 30);
	      controlPanel.add(title);
	     
	      nameField = new JTextField();
	      nameField.setSize(190, 20);
	      nameField.setLocation(200, 100);
	      controlPanel.add(nameField);
	     
	      number = new JTextField();
	      number.setSize(150, 20);
	      number.setLocation(200, 150);
	      controlPanel.add(number);
	     
	      submit = new JButton("Submit");
	      submit.setSize(100, 20);
	      submit.setLocation(150, 450);
	      submit.addActionListener(this);
	     
	      reset1 = new JButton("Reset");
	      reset1.setSize(100, 20);
	      reset1.setLocation(270, 450);
	      reset1.addActionListener(this);
	     
	      controlPanel.add(submit);
	      controlPanel.add(reset1);
	     
	      name = new JLabel("Name");
	      name.setSize(100, 20);
	      name.setLocation(100, 100);
	      controlPanel.add(name);
	     
	      cell = new JLabel("Phone Number");
	      cell.setSize(100, 20);
	      cell.setLocation(100, 150);
	      controlPanel.add(cell);
	     
	      gender = new JLabel("Gender");
	      gender.setSize(100, 20);
	      gender.setLocation(100, 200);
	      controlPanel.add(gender);
	     
	      male = new JRadioButton("Male");
	      male.setSelected(true);
	      male.setSize(75, 20);
	      male.setLocation(200, 200);
	     
	      female = new JRadioButton("Female");
	      female.setSelected(false);
	      female.setSize(80, 20);
	      female.setLocation(275, 200);
	     
	      controlPanel.add(male);
	      controlPanel.add(female);
	     
	      dateOB = new JLabel("Date of Birth");
	      dateOB.setSize(100, 20);
	      dateOB.setLocation(100, 250);
	      controlPanel.add(dateOB);
	     
	      address = new JLabel("Address");
	      address.setSize(100, 20);
	      address.setLocation(100, 300);
	      controlPanel.add(address);
	     
	      addressField = new JTextField();
	      addressField.setSize(200, 75);
	      addressField.setLocation(200, 300);
	      controlPanel.add(addressField);
	     
	      termsAndCond = new JCheckBox("Accept Terms and Conditions.");
	      termsAndCond.setSize(250, 20);
	      termsAndCond.setLocation(150, 400);
	      controlPanel.add(termsAndCond);
	     
	      day = new JComboBox(dates);
	      day.setSize(50, 20);
	      day.setLocation(200, 250);
	     
	      month = new JComboBox(months);
	      month.setSize(60, 20);
	      month.setLocation(250, 250);
	     
	      year = new JComboBox(years);
	      year.setSize(60, 20);
	      year.setLocation(320, 250);
	     
	      controlPanel.add(day);
	      controlPanel.add(month);
	      controlPanel.add(year);
	     
	      output = new JTextArea();
	      output.setSize(300, 400);
	      output.setLocation(500, 100);
	      output.setLineWrap(true);
	      output.setEditable(false);
	      controlPanel.add(output);
	     
	      //Output below Submit button
	      res = new JLabel("");
	      res.setSize(500, 75);
	      res.setLocation(80, 480);
	      controlPanel.add(res);
	     
	      reset = new JTextField();
	      reset.setSize(200, 75);
	      reset.setLocation(580, 175);
	      controlPanel.add(reset);
	     
	      myFrame.add(controlPanel);
	      myFrame.setVisible(true);
	     
	  }
	 
	  public static void main(String[] args) {
	      MyRegistration form = new MyRegistration();

	  }
	 
	  @Override
	  public void actionPerformed(ActionEvent e) {
	      if (e.getSource() == submit) {
	          if (termsAndCond.isSelected()) {
	           
	            String data;
	            String data1;
	           
	            String checkName = nameField.getText().trim();
	            String checkPhone = number.getText();
	            boolean everythingValid = true;
	           
	            for (int i = 0; i < checkName.length(); i++) {
	              char c = checkName.charAt(i);
	              if (Character.isDigit(c))
	                everythingValid = false;
	              }
	            for (int i = 0; i < checkPhone.length(); i++) {
	              char c = checkPhone.charAt(i);
	              if (!Character.isDigit(c))
	                everythingValid = false;
	              }
	           
	            if (everythingValid) {
	              data = "Name : " + nameField.getText() + "\n\n" + "Mobile: " + number.getText() + "\n";
	              if (male.isSelected()) {
	                data1 = "Gender : Male" + "\n";
	              }
	              else {
	                data1 = "Gender : Female" + "\n";
	              }
	             
	              String data2 = "DOB : " + (String)day.getSelectedItem() + "/ " + (String)month.getSelectedItem() + "/ "
	              + (String)year.getSelectedItem() + "\n";
	             
	              String data3 = "Address : " + addressField.getText();
	              output.setText(data + "\n" + data1 + "\n"+ data2 + "\n" + data3 );
	             
	             
	              res.setText("Registration Successful..");
	            }
	            else {
	              res.setText("Name must only have letters and/or Phone Number must only have numbers");
	            }
	          }
	          else {
	            output.setText(null);
	            reset.setText(null);
	            res.setText("Please accept the " + "terms and conditions...");
	          }
	      }
	     
	      else if (e.getSource() == reset1) {
	        String def = null;
	        nameField.setText(def);
	        addressField.setText(def);
	        number.setText(def);
	        res.setText(def);
	        output.setText(def);
	        termsAndCond.setSelected(false);
	        day.setSelectedIndex(0);
	        month.setSelectedIndex(0);
	        year.setSelectedIndex(0);
	        reset.setText(def);
	      }
	  }
	}

	