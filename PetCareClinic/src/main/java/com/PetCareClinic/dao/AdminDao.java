package com.PetCareClinic.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.PetCareClinic.entity.Admin;
import com.PetCareClinic.repo.AdminRepo;

@Repository
public class AdminDao {
	
	@Autowired
	AdminRepo aRepo;
	
	//save
	
	public Admin saveAdmin (Admin admin) {
		
		return aRepo.save(admin);
	}
	
	
	//find
	
	public Admin findAdmin (int adminId) {
		
		Optional<Admin> opAdmin = aRepo.findById(adminId);
		if(opAdmin.isPresent()) {
			
			return opAdmin.get();
		}
		return null;
	}
	//delete
	public Admin deleteAdmin(int adminId) {
		
		Admin admin = findAdmin(adminId);
		aRepo.delete(admin);
		return admin;
	}
	
	
	
	
	//update
	public Admin updateAdmin(Admin admin, int adminId) {
		
		Admin existAdmin = findAdmin(adminId);
		if (existAdmin!=null) {
			
			admin.setId(adminId);
			return aRepo.save(admin);

		}
		
		return null;
		
	}
	
	//find all admin
	
	public Admin findAllAdmin () {
		
		List<Admin> listAdmin = aRepo.findAll();
		
		for (Admin admin : listAdmin) {
			System.out.println(admin);
		}
		
		return (Admin) listAdmin;
		
		
	}
	 
	
	

}
