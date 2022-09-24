package com.service.userService.role;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("ui/")
public class RoleUIController {
	
	@Autowired	
	private RoleService roleService;
	
	@GetMapping("roles")
	public String listAllRoles(ModelMap model) {
		System.out.println("=========================");		
		List<RoleEntity> roles = roleService.retriveAllRoles();
		model.addAttribute("roles",roles);
		return "userService/roles/ListRoles";
	}
		
}
