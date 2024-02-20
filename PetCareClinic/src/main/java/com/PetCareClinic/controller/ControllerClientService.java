package com.PetCareClinic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.PetCareClinic.Util.PetResponseStructure;
import com.PetCareClinic.entity.ClientService;
import com.PetCareClinic.service.ClientService_Service;

@RestController
@RequestMapping
public class ControllerClientService {
	
	@Autowired
	ClientService_Service cClientService;
	
	
	@PostMapping
	public ResponseEntity<PetResponseStructure<ClientService>> saveClientService(@RequestBody ClientService clientService){
		return cClientService.saveClientService(clientService);
		
	}
	
	@GetMapping
	public ResponseEntity<PetResponseStructure<ClientService>> findClientService(@RequestParam int clientServiceId){
		return cClientService.findClientService(clientServiceId);
		
	}
	
	@DeleteMapping
	public ResponseEntity<PetResponseStructure<ClientService>> deleteClientService(@RequestParam int clientServiceId){
		return cClientService.deleteClientService(clientServiceId);
		
	}
	@PutMapping
	public ResponseEntity<PetResponseStructure<ClientService>> updateClientService(@RequestBody ClientService clientService ,@RequestParam int clientServiceId){
		return cClientService.updateClientService(clientService, clientServiceId);
		
	}
	
	
}
