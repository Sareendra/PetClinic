package com.PetCareClinic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.PetCareClinic.Util.PetResponseStructure;
import com.PetCareClinic.dao.ClientDao;
import com.PetCareClinic.entity.Client;
import com.PetCareClinic.repo.ClientRepo;

@Service
public class ClientService {
	
	@Autowired
	ClientDao sDao;
	
	@Autowired
	ClientRepo cRepo;
	
	// save
	public ResponseEntity<PetResponseStructure<Client>> saveClient(Client client){
		
		PetResponseStructure<Client> structure = new PetResponseStructure<Client>();
		structure.setMessage("client saved");
		structure.setStatus(HttpStatus.CREATED.value());
		structure.setData(sDao.saveClient(client));
		
		return new ResponseEntity<PetResponseStructure<Client>> (structure,HttpStatus.CREATED);
	}
	
	
	//find
	public ResponseEntity<PetResponseStructure<Client>> findClient(int clientId){
		
		PetResponseStructure<Client> structure = new PetResponseStructure<Client>();
		structure.setMessage("laptop found");
		structure.setStatus(HttpStatus.FOUND.value());
		structure.setData(sDao.findClient(clientId));
		
		return new ResponseEntity<PetResponseStructure<Client>> (structure,HttpStatus.FOUND);
	}
	 
	
	//delete
	public ResponseEntity<PetResponseStructure<Client>> deleteClient(int clientId){
		
		PetResponseStructure<Client> structure = new PetResponseStructure<Client>();
		structure.setMessage("client deleted");
		structure.setStatus(HttpStatus.OK.value());
		structure.setData(sDao.deleteClient(clientId));
		
		return new ResponseEntity<PetResponseStructure<Client>> (structure, HttpStatus.OK);
	}
	
	
	//update
	public ResponseEntity<PetResponseStructure<Client>> updateClient(Client client,int clientId){
		PetResponseStructure<Client> structure= new PetResponseStructure<Client>();
		structure.setMessage("client updated");
		structure.setStatus(HttpStatus.OK.value());
		structure.setData(sDao.updateClient(client, clientId));
		
		return new ResponseEntity<PetResponseStructure<Client>> (structure,HttpStatus.OK);
		
	}
	
	
	//find all client
	public ResponseEntity<PetResponseStructure<List<Client>>> findAllClient(){
		PetResponseStructure<List<Client>> structure = new PetResponseStructure<List<Client>>();
		
		structure.setMessage("all client found");
		structure.setStatus(HttpStatus.FOUND.value());
		structure.setData(cRepo.findAll());
		
		return new ResponseEntity<PetResponseStructure< List<Client> >> (structure,HttpStatus.FOUND);
	}
  
}
