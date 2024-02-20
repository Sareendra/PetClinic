package com.PetCareClinic.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PetCareClinic.entity.ClientService;

public interface ClientServiceRepo extends JpaRepository<ClientService, Integer> {

}
