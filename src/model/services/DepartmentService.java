package model.services;

import java.util.ArrayList;
import java.util.List;

import model.entities.Department;

public class DepartmentService {
	
	public List<Department> findAll(){
		List<Department> list = new ArrayList<>();
		list.add(new Department(1, "Vestu�rio"));
		list.add(new Department(2, "Esporte"));
		list.add(new Department(2, "Tecnologia"));
		list.add(new Department(2, "Eletr�nicos"));
		return list;
	}

}
