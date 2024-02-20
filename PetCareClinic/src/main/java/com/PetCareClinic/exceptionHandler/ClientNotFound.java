package com.PetCareClinic.exceptionHandler;

import lombok.Data;

@Data
public class ClientNotFound extends RuntimeException{
	
	String message;
	
	public ClientNotFound (String message) {
		this.message = message;
	}

}
