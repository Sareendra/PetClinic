package com.PetCareClinic.service;

import java.util.List;

import org.hibernate.annotations.processing.Find;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.PetCareClinic.Util.PetResponseStructure;
import com.PetCareClinic.dao.Vet_DocDao;
import com.PetCareClinic.entity.Vet_Doc;
import com.PetCareClinic.repo.Vet_DocRepo;

@Service
public class Vet_DocService {
	
	@Autowired
	Vet_DocDao vDao;
	
	@Autowired
	Vet_DocRepo vRepo;
	
	
	//save
	public ResponseEntity<PetResponseStructure<Vet_Doc>> saveDoctor(Vet_Doc doctor){
		PetResponseStructure<Vet_Doc> structure = new PetResponseStructure<Vet_Doc>();
		structure.setMessage("doctor saved");
		structure.setStatus(HttpStatus.CREATED.value());
		structure.setData(vDao.saveDoc(doctor));
		
		return new ResponseEntity<PetResponseStructure<Vet_Doc>> (structure, HttpStatus.CREATED);
	}
	
	
	//find
	public ResponseEntity<PetResponseStructure<Vet_Doc>> findDoctor(int doctorId){
		PetResponseStructure<Vet_Doc> structure = new PetResponseStructure<Vet_Doc>();
		structure.setMessage("doctor found");
		structure.setStatus(HttpStatus.FOUND.value());
		structure.setData(vDao.findDoc(doctorId));
		
		return new ResponseEntity<PetResponseStructure<Vet_Doc>> (structure, HttpStatus.FOUND);
	}
	
	
	//delete
	public ResponseEntity<PetResponseStructure<Vet_Doc>> deleteDoctor(int doctorId){
		PetResponseStructure<Vet_Doc> structure = new PetResponseStructure<Vet_Doc>();
		structure.setMessage("doctor delete");
		structure.setStatus(HttpStatus.OK.value());
		structure.setData(vDao.deleteDoc(doctorId));
		
		return new ResponseEntity<PetResponseStructure<Vet_Doc>> (structure, HttpStatus.OK);
				
	}
	
	//update
	
	public ResponseEntity<PetResponseStructure<Vet_Doc>> updateDoctor(Vet_Doc doctor,int doctorId){
		PetResponseStructure<Vet_Doc> structure = new PetResponseStructure<Vet_Doc>();
		structure.setMessage("doctor updated");
		structure.setStatus(HttpStatus.OK.value());
		structure.setData(vDao.updateDoc(doctor, doctorId));
		
		return new ResponseEntity<PetResponseStructure<Vet_Doc>> (structure, HttpStatus.OK);
	}
	
	
	//find all doctor
	public ResponseEntity<PetResponseStructure<List<Vet_Doc>>> findAllDoctor(){
		PetResponseStructure<List<Vet_Doc>> structure = new PetResponseStructure<List<Vet_Doc>>();
		structure.setMessage("all doctors found");
		structure.setStatus(HttpStatus.FOUND.value());
		structure.setData(vRepo.findAll());
		
		return new ResponseEntity<PetResponseStructure<List<Vet_Doc>>> (structure,HttpStatus.FOUND);
	}
	
	

}
