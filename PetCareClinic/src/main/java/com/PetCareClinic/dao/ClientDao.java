package com.PetCareClinic.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.PetCareClinic.entity.Client;
import com.PetCareClinic.repo.ClientRepo;

@Repository
public class ClientDao {
	
	@Autowired
	ClientRepo cRepo;
	
	//save
	public Client saveClient(Client client) {
		
		return cRepo.save(client);
	}
	
	
	//find 
	public Client findClient (int clientId) {
		
		Optional<Client> opClient = cRepo.findById(clientId);
		if(opClient.isPresent()) {
			return opClient.get();
		}
		return null;
		
	}
	
	//delete 
	public Client deleteClient (int clientId) {
		
		Client client = findClient(clientId);
		cRepo.delete(client);
		return client;
	}
	
	//update
	public Client updateClient (Client client,int ClientId) {
		
		Client exClient = findClient(ClientId);
		if (exClient!=null) {
			client.setClientId(ClientId);
			return cRepo.save(client);
			
		}
		return null;
	}

}
