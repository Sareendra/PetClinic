package com.PetCareClinic.controller;


import java.util.List;

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
import com.PetCareClinic.entity.Client;
import com.PetCareClinic.service.Client_Service;


@RestController
@RequestMapping("petcare_client")
public class ControllerClient {
	
	@Autowired
	Client_Service service;

	
	
	@PostMapping
	public ResponseEntity<PetResponseStructure<Client>> saveClient(@RequestBody Client client){
		return service.saveClient(client);
	}
	@GetMapping
	public ResponseEntity<PetResponseStructure<Client>> findClient(@RequestParam int clientId){
		return service.findClient(clientId);
	}
	@DeleteMapping
	public ResponseEntity<PetResponseStructure<Client>> deleteClient(@RequestParam int clientId){
		return service.deleteClient(clientId);
	}
	@PutMapping
	public ResponseEntity<PetResponseStructure<Client>> updateClient(@RequestBody Client client, @RequestParam int clientId){
		return service.updateClient(client, clientId);
		
	}
	@GetMapping("findAllClient")
	public ResponseEntity<PetResponseStructure<List<Client>>> findAllClient(){
		return service.findAllClient();
	}

}
