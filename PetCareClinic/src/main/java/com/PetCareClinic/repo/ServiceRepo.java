package com.PetCareClinic.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PetCareClinic.entity.AdminService;

public interface ServiceRepo extends JpaRepository<AdminService, Integer> {

}
