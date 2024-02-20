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
public class AdminService {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ServiceId;
	
	private boolean bath;
	private boolean haircut;
	private boolean nailcut;
	private boolean brush;
	private int daycare;

}
