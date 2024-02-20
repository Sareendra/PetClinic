package com.PetCareClinic.exceptionHandler;

import lombok.Data;

@Data
public class AdminNotFound extends RuntimeException{ 
	String message;
	
	public AdminNotFound(String message) {
		this.message = message;
	}
	

}
