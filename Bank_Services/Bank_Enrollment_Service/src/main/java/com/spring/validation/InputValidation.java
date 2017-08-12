package com.spring.validation;

import org.apache.log4j.Logger;
import com.spring.xml.UserEnrollmentXml;


public class InputValidation {
	
	static final Logger logger=Logger.getLogger(InputValidation.class);
	
	public InputValidationCheck startValidation(UserEnrollmentXml userEnrollmentXml){
		
		logger.debug("Started Validation Process inside InputValidation class and startValidation Method");
		
		InputValidationCheck inputValidationCheck = new InputValidationCheck();
	
		if(userEnrollmentXml.getBank_name()!=null){
			inputValidationCheck.setBank_name(true);
		}
		
        userEnrollmentXml.getCustomer_bank_number();
        userEnrollmentXml.getCustomer_debit_card_number();
        userEnrollmentXml.getCustomer_debit_card_selection();
        userEnrollmentXml.getInsurer_client_name();
        userEnrollmentXml.getBank_balance();
        
        return inputValidationCheck;
	}
}
