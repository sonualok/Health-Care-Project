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
	 
	 public UserEnrollmentXml() {  
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
