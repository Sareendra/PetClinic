package com.PetCareClinic.entity;

import org.springframework.data.annotation.Persistent;
import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Component
public class Vet_Doc {
	
	
	@Persistent
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int doc_id;
	private String doc_name;
	private String email;

}
