package com.spring.xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "UserEnrollmentXml")  
public class UserEnrollmentXml {

	 private int customer_bank_id; 
	 private String bank_name;  
	 private int customer_bank_number;
	 private int customer_debit_card_number;
	 private String customer_debit_card_selection;
	 private String insurer_client_name;
	 private int bank_balance; 
	 private String first_name;
	 private String middle_name;
	 private String last_name;
	 private String email_id;
	 private String first_line_address;
	 private String second_line_address;
	 private String first_line_office_address;
	 private String second_line_office_address;
	 private int    pin_code;
	 private String country;
	 private String city;
	 private int    mobile_number;
	 private String date_of_birth;
	 
	
	public UserEnrollmentXml() {  
	}
	 
	public String getFirst_name() {
		return first_name;
	}

	@XmlElement
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getMiddle_name() {
		return middle_name;
	}

	@XmlElement
	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}

	public String getLast_name() {
		return last_name;
	}

	@XmlElement
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail_id() {
		return email_id;
	}

	@XmlElement
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getFirst_line_address() {
		return first_line_address;
	}

	@XmlElement
	public void setFirst_line_address(String first_line_address) {
		this.first_line_address = first_line_address;
	}


	public String getSecond_line_address() {
		return second_line_address;
	}

	@XmlElement
	public void setSecond_line_address(String second_line_address) {
		this.second_line_address = second_line_address;
	}


	public String getFirst_line_office_address() {
		return first_line_office_address;
	}

	@XmlElement
	public void setFirst_line_office_address(String first_line_office_address) {
		this.first_line_office_address = first_line_office_address;
	}


	public String getSecond_line_office_address() {
		return second_line_office_address;
	}


	@XmlElement
	public void setSecond_line_office_address(String second_line_office_address) {
		this.second_line_office_address = second_line_office_address;
	}

	public int getPin_code() {
		return pin_code;
	}

	@XmlElement
	public void setPin_code(int pin_code) {
		this.pin_code = pin_code;
	}

	public String getCountry() {
		return country;
	}

	@XmlElement
	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	@XmlElement
	public void setCity(String city) {
		this.city = city;
	}

	public int getMobile_number() {
		return mobile_number;
	}

	@XmlElement
	public void setMobile_number(int mobile_number) {
		this.mobile_number = mobile_number;
	}

	public String getDate_of_birth() {
		return date_of_birth;
	}

	@XmlElement
	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}
	    
	public int getCustomer_bank_id() {
		return customer_bank_id;
	}
     
	@XmlElement
	public void setCustomer_bank_id(int customer_bank_id) {
		this.customer_bank_id = customer_bank_id;
	}

	public String getBank_name() {
		return bank_name;
	}

	@XmlElement
	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}

	public int getCustomer_bank_number() {
		return customer_bank_number;
	}

	@XmlElement
	public void setCustomer_bank_number(int customer_bank_number) {
		this.customer_bank_number = customer_bank_number;
	}

	public int getCustomer_debit_card_number() {
		return customer_debit_card_number;
	}
	
	@XmlElement
	public void setCustomer_debit_card_number(int customer_debit_card_number) {
		this.customer_debit_card_number = customer_debit_card_number;
	}

	public String getCustomer_debit_card_selection() {
		return customer_debit_card_selection;
	}

	@XmlElement
	public void setCustomer_debit_card_selection(String customer_debit_card_selection) {
		this.customer_debit_card_selection = customer_debit_card_selection;
	}

	public String getInsurer_client_name() {
		return insurer_client_name;
	}

	@XmlElement
	public void setInsurer_client_name(String insurer_client_name) {
		this.insurer_client_name = insurer_client_name;
	}

	public int getBank_balance() {
		return bank_balance;
	}

	@XmlElement
	public void setBank_balance(int bank_balance) {
		this.bank_balance = bank_balance;
	}
 }
