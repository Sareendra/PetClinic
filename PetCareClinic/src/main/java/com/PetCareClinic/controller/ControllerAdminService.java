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
import com.PetCareClinic.entity.Admin;
import com.PetCareClinic.entity.AdminService;
import com.PetCareClinic.service.Admin_Service;
import com.PetCareClinic.service.AdminService_Service;

@RestController
@RequestMapping("petcare_adminservice")
public class ControllerAdminService {
	
	@Autowired
	AdminService_Service sAdminService;
	
	
	@PostMapping
	public ResponseEntity<PetResponseStructure<AdminService>> saveAdminService(@RequestBody AdminService adminService){
		return sAdminService.saveAdminService(adminService);
	}
	
	@GetMapping
	public ResponseEntity<PetResponseStructure<AdminService>> findAdminService(@RequestParam int adminServiceId){
		return sAdminService.findAdminService(adminServiceId);
	}
	
	@DeleteMapping
	public ResponseEntity<PetResponseStructure<AdminService>> deleteAdminService(@RequestParam int adminServiceId){
		return sAdminService.deleteAdminService(adminServiceId);
	}
	@PutMapping
	public ResponseEntity<PetResponseStructure<AdminService>> updateAdminService(@RequestBody AdminService adminService  ,@RequestParam int adminServiceId){
		return sAdminService.updateAdminService(adminService, adminServiceId);
	}
	
	

}
