package com.PetCareClinic.entity;

import org.springframework.stereotype.Component;
import jakarta.persistence.Entity;
import lombok.Data;


@Component
@Data
public class Service {
		
		private boolean bath;
		private boolean haircut;
		private boolean nailcut;
		private boolean brush;
		private boolean daycare;

}
