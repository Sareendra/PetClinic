package com.PetCareClinic.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Component
@Data
public class Vet_Doc {
	
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int doc_id;
	private String doc_name;
	private String email;
	

}
