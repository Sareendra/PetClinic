package com.PetCareClinic.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Component

public class ClientService {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int ClientServiceId;
	private String clientServiceName;

}
