package com.PetCareClinic.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Component
@Data
public class Client {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int clientId;
	private String clientName;
	private String clientEmail;
	private String clientContact;
	private String clientAddress;

//	@OneToMany
//	VisitHistory listHistory;

}
