package com.ganesh.hotelBooking_App.repository;

import com.ganesh.hotelBooking_App.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByName(String name);


    boolean existsByName(String name);
}
