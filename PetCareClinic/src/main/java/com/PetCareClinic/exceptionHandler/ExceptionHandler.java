package com.PetCareClinic.exceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.PetCareClinic.Util.PetResponseStructure;

@RestControllerAdvice
public class ExceptionHandler extends ResponseEntityExceptionHandler{
	
	@org.springframework.web.bind.annotation.ExceptionHandler
	public ResponseEntity<PetResponseStructure<String>> adminnotfound(AdminNotFound admin){
		
		
		PetResponseStructure<String> existing = new PetResponseStructure<String>();
		existing.setMessage("Admin not found");
		existing.setData(admin.getMessage());
		existing.setStatus(HttpStatus.NOT_FOUND.value());
		return new ResponseEntity<PetResponseStructure<String>>(existing,HttpStatus.NOT_FOUND);
		
	}
	
	@org.springframework.web.bind.annotation.ExceptionHandler
	public ResponseEntity<PetResponseStructure<String>> clientnotfound(ClientNotFound client){
		
		
		PetResponseStructure<String> existing = new PetResponseStructure<String>();
		existing.setMessage("Client not found");
		existing.setData(client.getMessage());
		existing.setStatus(HttpStatus.NOT_FOUND.value());
		return new ResponseEntity<PetResponseStructure<String>>(existing,HttpStatus.NOT_FOUND);
		
	}

}
