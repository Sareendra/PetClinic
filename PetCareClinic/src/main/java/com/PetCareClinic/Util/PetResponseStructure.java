package com.PetCareClinic.Util;

import lombok.Data;

@Data
public class PetResponseStructure<T> {
	
	private String message;
	private int status;
	private T data;

	

}
