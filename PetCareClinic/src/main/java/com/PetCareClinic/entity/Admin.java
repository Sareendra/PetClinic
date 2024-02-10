package com.PetCareClinic.entity;

import org.springframework.data.annotation.Persistent;
import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;

@Entity
@Component
@Data
public class Admin {
	
	
	@Persistent
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	private String password;
	
	
	

}
