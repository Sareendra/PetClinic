package com.PetCareClinic.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PetCareClinic.entity.Admin;

public interface AdminRepo extends JpaRepository<Admin, Integer> {

}
