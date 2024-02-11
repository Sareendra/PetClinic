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
import com.PetCareClinic.entity.Vet_Doc;
import com.PetCareClinic.service.Vet_DocService;

@RestController
@RequestMapping("petcare_doctor")
public class ControllerDoctor {
	
	@Autowired
	Vet_DocService service;
	
	@PostMapping
	public ResponseEntity<PetResponseStructure<Vet_Doc>> saveDoctor(@RequestBody Vet_Doc doctor){
		return service.saveDoctor(doctor);
	}
	@GetMapping
	public ResponseEntity<PetResponseStructure<Vet_Doc>> findDoctor(@RequestParam int doctorId){
		return service.findDoctor(doctorId);
		
	}
	@DeleteMapping
	public ResponseEntity<PetResponseStructure<Vet_Doc>> deleteDoctor(@RequestParam int doctorId){
		return service.deleteDoctor(doctorId);		
	}
	@PutMapping
	public ResponseEntity<PetResponseStructure<Vet_Doc>> updateDoctor(@RequestBody Vet_Doc doctor, @RequestParam int doctorId){
		return service.updateDoctor(doctor, doctorId);
	}
	@GetMapping("findAllDoctor")
	public ResponseEntity<PetResponseStructure<List<Vet_Doc>>> findAllDoctor(){
		return service.findAllDoctor();
	}
	

}
