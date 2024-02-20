package com.PetCareClinic.dto;

import com.PetCareClinic.entity.AdminService;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AdminDto {
	
	private int id;
	private String name;
	private String email;
	
	private AdminService adminService;

}
