package com.PetCareClinic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.PetCareClinic.Util.PetResponseStructure;
import com.PetCareClinic.dao.AdminDao;
import com.PetCareClinic.entity.Admin;
import com.PetCareClinic.repo.AdminRepo;

@Service
public class AdminService {
	
	@Autowired
	AdminDao aDao;
	
	//save admin
	public ResponseEntity<PetResponseStructure<Admin>> saveAdmin(Admin admin){
		
		PetResponseStructure<Admin> structure = new PetResponseStructure<Admin>();
		structure.setMessage("admin saved sucess");
		structure.setStatus(HttpStatus.CREATED.value());
		structure.setData(aDao.saveAdmin(admin));
		
		return new ResponseEntity<PetResponseStructure<Admin>>(structure,HttpStatus.CREATED);
	}
	
	//find admin
	public ResponseEntity<PetResponseStructure<Admin>> findAdmin(int adminId){
		
		PetResponseStructure<Admin> structure = new PetResponseStructure<Admin>();
		structure.setMessage("admin found");
		structure.setStatus(HttpStatus.FOUND.value());
		structure.setData(aDao.findAdmin(adminId));
		
		return new ResponseEntity<PetResponseStructure<Admin>> (structure,HttpStatus.FOUND);
	}
	
	
	//delete admin
	public ResponseEntity<PetResponseStructure<Admin>> deleteAdmin(int adminId){
		
		PetResponseStructure<Admin> structure = new PetResponseStructure<Admin>();
		structure.setMessage("admin deleted");
		structure.setStatus(HttpStatus.OK.value());
		structure.setData(aDao.deleteAdmin(adminId));
		
		return new ResponseEntity<PetResponseStructure<Admin>>(structure,HttpStatus.OK);
	}
	
	
	//update admin
	public ResponseEntity<PetResponseStructure<Admin>> updateAdmin(Admin admin,int adminId){
		
		PetResponseStructure<Admin> structure = new PetResponseStructure<Admin>();
		structure.setMessage("admin updated");
		structure.setStatus(HttpStatus.OK.value());
		structure.setData(aDao.updateAdmin(admin, adminId));
		
		return new ResponseEntity<PetResponseStructure<Admin>> (structure,HttpStatus.OK);
	}
	
	//find all admin
	
	public ResponseEntity<PetResponseStructure<Admin>> findallAdmin( ){
		
		PetResponseStructure<Admin> structure = new PetResponseStructure<Admin>();
		structure.setMessage("all admin found");
		structure.setStatus(HttpStatus.FOUND.value());
		structure.setData(aDao.findAllAdmin());
		
		return new ResponseEntity<PetResponseStructure<Admin>> (structure,HttpStatus.FOUND);
	}
	
	

}
