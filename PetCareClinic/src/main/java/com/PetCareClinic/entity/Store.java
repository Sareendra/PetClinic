package com.PetCareClinic.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
@Component
public class Store {
	
	private boolean belt;
	private boolean food;
	private boolean bowls;
	private boolean chain;
	private boolean toys;
	

}
