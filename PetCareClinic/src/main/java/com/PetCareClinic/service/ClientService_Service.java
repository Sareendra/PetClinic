package com.PetCareClinic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.PetCareClinic.Util.PetResponseStructure;
import com.PetCareClinic.dao.ClientServiceDao;
import com.PetCareClinic.entity.ClientService;

@Service
public class ClientService_Service {
	
	@Autowired
	ClientServiceDao cServiceDao;
	
	
	//save client service
	public ResponseEntity<PetResponseStructure<ClientService>> saveClientService(ClientService cService){
		
		PetResponseStructure<ClientService> structure = new PetResponseStructure<ClientService>();
		structure.setMessage("Client service saved sucess");
		structure.setStatus(HttpStatus.CREATED.value());
		structure.setData(cServiceDao.saveClientService(cService));
		
		return new ResponseEntity<PetResponseStructure<ClientService>>(structure, HttpStatus.CREATED);
	}
	
	//find admin service
	
	public ResponseEntity<PetResponseStructure<ClientService>> findClientService(int cServiceId){
		
		PetResponseStructure<ClientService> structure = new PetResponseStructure<ClientService>();
		structure.setMessage("Client service found");
		structure.setStatus(HttpStatus.FOUND.value());
		structure.setData(cServiceDao.findClientService(cServiceId));
		
		return new ResponseEntity<PetResponseStructure<ClientService>>(structure, HttpStatus.FOUND);
	}
	
	//delete admin service
	public ResponseEntity<PetResponseStructure<ClientService>> deleteClientService(int cServiceId){
		
		PetResponseStructure<ClientService> structure = new PetResponseStructure<ClientService>();
		structure.setMessage("Client service deleted");
		structure.setStatus(HttpStatus.OK.value());
		structure.setData(cServiceDao.deleteClientService(cServiceId));
		
		return new ResponseEntity<PetResponseStructure<ClientService>>(structure, HttpStatus.OK);
	}
	
	//update admin service
	
	public ResponseEntity<PetResponseStructure<ClientService>> updateClientService(ClientService cService ,int cServiceId){
		
		PetResponseStructure<ClientService> structure = new PetResponseStructure<ClientService>();
		structure.setMessage("Client service updated");
		structure.setStatus(HttpStatus.OK.value());
		structure.setData(cServiceDao.updateClientService(cService, cServiceId));
		
		return new ResponseEntity<PetResponseStructure<ClientService>>(structure, HttpStatus.OK);
	}

}
