package com.PetCareClinic.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.PetCareClinic.entity.Vet_Doc;
import com.PetCareClinic.repo.Vet_DocRepo;

@Repository
public class Vet_DocDao {
	
	@Autowired
	Vet_DocRepo vRepo;
	
	
	//save
	public Vet_Doc saveDoc(Vet_Doc doctor) {		
		return vRepo.save(doctor);		
	}
	
	//find
	public Vet_Doc findDoc(int doctorId) {
		
		Optional<Vet_Doc> opDoc = vRepo.findById(doctorId);
		
		if(opDoc.isPresent()) {
			return opDoc.get();			
		}
		
		return null;
	}
	
	//delete
	public Vet_Doc deleteDoc(int doctorId) {
		Vet_Doc doctor = findDoc(doctorId);
		vRepo.delete(doctor);
		return doctor;
	}
	
	//update
	
	public Vet_Doc updateDoc(Vet_Doc doctor,int doctorId) {
		Vet_Doc existDoc = findDoc(doctorId);		
		if(existDoc!=null) {
			doctor.setDoc_id(doctorId);
			
			return vRepo.save(doctor);
			
		}
		return null;
	} 

}
