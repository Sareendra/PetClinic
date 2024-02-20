package com.PetCareClinic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.PetCareClinic.Util.PetResponseStructure;
import com.PetCareClinic.dao.ServiceDao;
import com.PetCareClinic.entity.AdminService;

@Service
public class AdminService_Service {
	
	@Autowired
	ServiceDao aServiceDao;
	
	//save admin service
	public ResponseEntity<PetResponseStructure<AdminService>> saveAdminService(AdminService aService){
		
		PetResponseStructure<AdminService> structure = new PetResponseStructure<AdminService>();
		structure.setMessage("admin service saved sucess");
		structure.setStatus(HttpStatus.CREATED.value());
		structure.setData(aServiceDao.saveadminService(aService));
		
		return new ResponseEntity<PetResponseStructure<AdminService>>(structure, HttpStatus.CREATED);
	}
	
	//find admin service
	public ResponseEntity<PetResponseStructure<AdminService>> findAdminService(int aServiceId){
		
		PetResponseStructure<AdminService> structure = new PetResponseStructure<AdminService>();
		structure.setMessage("admin service found");
		structure.setStatus(HttpStatus.FOUND.value());
		structure.setData(aServiceDao.findService(aServiceId));
		
		return new ResponseEntity<PetResponseStructure<AdminService>>(structure, HttpStatus.FOUND);
	}
	
	//delete admin service
	public ResponseEntity<PetResponseStructure<AdminService>> deleteAdminService(int aServiceId){
		
		PetResponseStructure<AdminService> structure = new PetResponseStructure<AdminService>();
		structure.setMessage("admin service deleted");
		structure.setStatus(HttpStatus.OK.value());
		structure.setData(aServiceDao.deleteService(aServiceId));
		
		return new ResponseEntity<PetResponseStructure<AdminService>>(structure, HttpStatus.OK);
	}
	
	//update admin service
	public ResponseEntity<PetResponseStructure<AdminService>> updateAdminService(AdminService aService,int aServiceId){
		
		PetResponseStructure<AdminService> structure = new PetResponseStructure<AdminService>();
		structure.setMessage("admin service updated");
		structure.setStatus(HttpStatus.OK.value());
		structure.setData(aServiceDao.updateService(aService, aServiceId));
		
		return new ResponseEntity<PetResponseStructure<AdminService>>(structure, HttpStatus.OK);
	}
	
	

}
