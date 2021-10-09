package com.telekom.ecare.repository;

import com.telekom.ecare.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;


public interface RoleRepository extends JpaRepository<Role, Long> {
}
