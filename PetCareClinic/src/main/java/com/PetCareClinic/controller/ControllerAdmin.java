package com.PetCareClinic.controller;

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
import com.PetCareClinic.dto.AdminDto;
import com.PetCareClinic.entity.Admin;
import com.PetCareClinic.service.AdminService;

@RestController
@RequestMapping("petcare_admin")

public class ControllerAdmin {
	
	@Autowired
	AdminService service;
	
	@PostMapping
	public ResponseEntity<PetResponseStructure<Admin>> saveAdmin(@RequestBody Admin admin){
		return service.saveAdmin(admin);
	}
	
	@GetMapping
	public ResponseEntity<PetResponseStructure<Admin>> findAdmin(@RequestParam int adminId){
		return service.findAdmin(adminId);
	}
	
	@DeleteMapping
	public ResponseEntity<PetResponseStructure<Admin>> deleteAdmin(@RequestParam int adminId){
		return service.deleteAdmin(adminId);
	}
	
	@PutMapping
	public ResponseEntity<PetResponseStructure<Admin>> updateAdmin(@RequestBody Admin admin,@RequestParam int adminId){
		return service.updateAdmin(admin, adminId);
	}
	
	@GetMapping("findAlladmin")
	public ResponseEntity<PetResponseStructure<Admin>> findAlladmin(){
		return service.findallAdmin();
	}
}
