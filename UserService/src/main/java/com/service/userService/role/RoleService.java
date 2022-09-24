package com.service.userService.role;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class RoleService 
{
	
	@Autowired
	private RoleRepository roleRepository;
	
	
	public RoleEntity addRole(RoleEntity roleEntity)
	{
		return roleRepository.save(roleEntity);
	}
	
	public List<RoleEntity> addRoles(List<RoleEntity> roleEntity)
	{
		return roleRepository.saveAll(roleEntity);
	}
	
	public RoleEntity updateRole(RoleEntity roleEntity)
	{
		return roleRepository.save(roleEntity);
	}
	
	public List<RoleEntity> updateRoles(List<RoleEntity> roleEntity)
	{
		return roleRepository.saveAll(roleEntity);
	}
	
	public void deleteById(int id)
	{
		roleRepository.deleteById(id);
	}
	
	public void deleteAllRoles()
	{
		roleRepository.deleteAll();
	}
	
	public List<RoleEntity> retriveAllRoles()
	{
		return roleRepository.findAll();
	}
	
	public RoleEntity retriveById(int id)
	{
		return roleRepository.findById(id);
	}
	
	public RoleEntity getRoleById(int id)
	{
		return roleRepository.findById(id);
	}
	
	public List<RoleEntity> retriveRolesByTenantId(int id)
	{
		return roleRepository.findByTenantId(id);
	}
	
	public RoleEntity retriveRoleByName(String name)
	{
		return roleRepository.findByName(name);
	}
	
	public List<RoleEntity>  retriveRoles(int pageNumber, int numberOfRecords)
	{
		Pageable pageable =  PageRequest.of(pageNumber, numberOfRecords, Sort.by("name").descending());
		Page<RoleEntity> rolesPage = roleRepository.findAll(pageable);
		return rolesPage.toList();
	}
}
