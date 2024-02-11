package com.PetCareClinic.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PetCareClinic.entity.Client;

public interface ClientRepo extends JpaRepository<Client, Integer>{

}
