package com.service.UserService.role;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<RoleEntity, Integer>{
	
	RoleEntity findById(int id);
	
	List<RoleEntity> findByTenantId(int id);
	
	RoleEntity findByName(String name);
	
	Page<RoleEntity> findAll(Pageable pageable);
}
