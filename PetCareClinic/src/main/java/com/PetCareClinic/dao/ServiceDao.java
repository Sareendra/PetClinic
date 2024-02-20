package com.PetCareClinic.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.PetCareClinic.entity.AdminService;
import com.PetCareClinic.repo.ServiceRepo;

@Repository
public class ServiceDao {
	
	@Autowired
	ServiceRepo ServiceRepo;
	
	
	//save
	public AdminService saveadminService (AdminService service) {
		return ServiceRepo.save(service);
	}
	
	//find
	public AdminService findService(int serviceId) {
		 
		Optional<AdminService> opService = ServiceRepo.findById(serviceId);
		if (opService.isPresent()) {
			return opService.get();
			
		}
		return null;
	}
	
	//delete
	public AdminService deleteService(int serviceId) {
		
		AdminService service = findService(serviceId);
		ServiceRepo.delete(service);;
		return service;
	}
	
	//update
	public AdminService updateService (AdminService service, int serviceId) {
		
		AdminService existService = findService(serviceId);
		if(existService!=null) {
			
			service.setServiceId(serviceId);
			return ServiceRepo.save(service);
			
		}
		return null;
	}

	


}
