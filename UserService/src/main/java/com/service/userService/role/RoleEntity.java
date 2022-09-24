package com.service.userService.role;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "Roles")

public class RoleEntity {
	
	@Id
	@GeneratedValue
	private int id;
	
	@NotNull(message = "Tenant ID must not be empty")
	private int tenantId;
	
	@NotNull(message = "Role Name must not be empty")
	@Size(
			max = 15,
			message = "Role Name can not have more than {max} characters long"			
			)
	
	private String name;
		
	@Size(
			max = 20,
			message = "Role Description must be maximum of {max} characters long"
			)
	private String description;
	
	@NotNull(message = "Role Enabled must not be empty")
	private boolean enabled;

	public RoleEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RoleEntity(int id, int tenantId, String name, String description, boolean enabled) {
		super();
		this.id = id;
		this.tenantId = tenantId;
		this.name = name;
		this.description = description;
		this.enabled = enabled;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTenantId() {
		return tenantId;
	}

	public void setTenantId(int tenantId) {
		this.tenantId = tenantId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	@Override
	public String toString() {
		return "RoleEntity [id=" + id + ", tenantId=" + tenantId + ", name=" + name + ", description=" + description
				+ ", enabled=" + enabled + "]";
	}

	
}
