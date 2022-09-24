package com.service.userService.role;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleController {
	
	@Autowired
	private RoleService roleService;
	
	@PostMapping("/role")
	public ResponseEntity<RoleEntity> addRole(@RequestBody RoleEntity roleEntity){
		return new ResponseEntity<RoleEntity>(roleService.addRole(roleEntity),HttpStatus.CREATED);
	}
	
	@PostMapping("/roles")
	public ResponseEntity<List<RoleEntity>> addRoles(@RequestBody List<RoleEntity> roleEntity){
		return new ResponseEntity<List<RoleEntity>>(roleService.addRoles(roleEntity),HttpStatus.CREATED);
	}
	
	@PutMapping("/role")
	public ResponseEntity<RoleEntity> updateRole(@RequestBody RoleEntity roleEntity){
		return new ResponseEntity<RoleEntity>(roleService.updateRole(roleEntity),HttpStatus.ACCEPTED);
	}
	
	@PutMapping("/roles")
	public ResponseEntity<List<RoleEntity>> updateRoles(@RequestBody List<RoleEntity> roleEntity){
		return new ResponseEntity<List<RoleEntity>>(roleService.updateRoles(roleEntity),HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("role/{id}")
	public ResponseEntity<Boolean> deleteRoleById(@PathVariable int id){
		roleService.deleteById(id);
		return new ResponseEntity<>(true,HttpStatus.OK);
	}
	
	@DeleteMapping("roles")
	public ResponseEntity<Boolean> deleteAllRoles(){
		roleService.deleteAllRoles();
		return new ResponseEntity<>(true,HttpStatus.OK);
	}

	
	@GetMapping("/roles")
	public ResponseEntity<List<RoleEntity>> retriveAllRoles(){
		return new ResponseEntity<>(roleService.retriveAllRoles(),HttpStatus.OK);
	}
	
	@GetMapping("/role/{id}")
	public ResponseEntity<RoleEntity> retriveById(@PathVariable int id)	{
		return new ResponseEntity<RoleEntity>(roleService.retriveById(id),HttpStatus.OK);
	}
	
	@GetMapping("/roles/tenant/{id}")
	public ResponseEntity<List<RoleEntity>> retriveRolesByTenantId(@PathVariable int id){
		return new ResponseEntity<>(roleService.retriveRolesByTenantId(id),HttpStatus.OK);
	}
	
	@GetMapping("/role/name/{name}")
	public ResponseEntity<RoleEntity> retriveByName(@PathVariable String name)	{
		return new ResponseEntity<RoleEntity>(roleService.retriveRoleByName(name),HttpStatus.OK);
	}
	
	@GetMapping("/roles/page/{pageNumber}")
	public ResponseEntity<List<RoleEntity>> retriveRolesByPage(@PathVariable int pageNumber){
		return new ResponseEntity<>(roleService.retriveRoles(pageNumber,1),HttpStatus.OK);
	}
		
}
