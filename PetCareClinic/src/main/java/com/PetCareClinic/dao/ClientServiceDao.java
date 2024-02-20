package com.PetCareClinic.dao;

import java.util.Optional;

import org.modelmapper.internal.bytebuddy.asm.Advice.Return;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.PetCareClinic.entity.ClientService;
import com.PetCareClinic.repo.ClientServiceRepo;

@Repository
public class ClientServiceDao {
	
	@Autowired
	ClientServiceRepo cServiceRepo;
	
	
	//save
	public ClientService saveClientService(ClientService clientService) {
		return cServiceRepo.save(clientService);
		
	}
	
	//find
	public ClientService findClientService(int clientserviceId) {
		
		Optional<ClientService> opClientService = cServiceRepo.findById(clientserviceId);
		if(opClientService.isPresent()) {
			return opClientService.get();
			
		}
		return null;
	}
	
	//delete
	
	public ClientService deleteClientService(int clientId) {
		
		ClientService clientserivce = findClientService(clientId);
		cServiceRepo.delete(clientserivce);
		return clientserivce;
	}
	
	//update
	public ClientService updateClientService(ClientService clientservice, int clientserviceId) {
		
		ClientService exclientservice = findClientService(clientserviceId);
		
		
		if(exclientservice != null) {
			clientservice.setClientServiceId(clientserviceId);
			return cServiceRepo.save(clientservice);
			
		}
		return null;
	}

}
