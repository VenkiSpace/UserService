package com.service.userService.role;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.venki.springboot.myfirstwebapp.todo.Todo;

import jakarta.validation.Valid;

@Controller
@RequestMapping("ui/")
public class RoleUIController {
	
	@Autowired	
	private RoleService roleService;
	
	@RequestMapping(value="roles", method=RequestMethod.GET)
	public String listAllRoles(ModelMap model) {	
		List<RoleEntity> roles = roleService.retriveAllRoles();
		model.addAttribute("roles",roles);
		return "userService/roles/ListRoles";
	}
	
	@RequestMapping(value="deleteRole", method=RequestMethod.GET)
	public String deleteRoleById(int id){
		roleService.deleteById(id);
		return "redirect:roles";
	}
	
	@RequestMapping(value="modifyRole", method=RequestMethod.GET)
	public String showModifyRolePage(@RequestParam int id, ModelMap model)
	{
		RoleEntity roleEntity = roleService.getRoleById(id);
		model.put("roleEntity", roleEntity);
		return "userService/roles/Role";
	}
	
	@RequestMapping(value="modifyRole", method=RequestMethod.POST)
	public String updateTodo(ModelMap model, @Valid RoleEntity roleEntity, BindingResult result)
	{
		if(result.hasErrors())
		{
			return "userService/roles/Role";
		}
		roleService.updateRole(roleEntity);
		return "redirect:roles";
	}
	
	@RequestMapping(value="addRole", method=RequestMethod.GET)
	public String showAddRolePage(ModelMap model)
	{
		RoleEntity roleEntity = new RoleEntity(0,0,"", "", false);
		model.put("roleEntity", roleEntity);
		return "userService/roles/Role";
	}
	
	@RequestMapping(value="addRole", method=RequestMethod.POST)
	public String addNewTodo(ModelMap model, @Valid RoleEntity roleEntity, BindingResult result)
	{
		if(result.hasErrors())
		{
			return "userService/roles/Role";
		}
		roleService.addRole(roleEntity);
		return "redirect:roles";
	}
	
		
}
