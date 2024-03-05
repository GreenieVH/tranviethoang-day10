package JDBC_Hibernate.main;

import java.util.List;

import JDBC_Hibernate.dao.EmployeeDAOImpl;
import JDBC_Hibernate.entity.Employee;

public class Employee_Select {
	public static void main(String[] args) {
		List<Employee> list = new EmployeeDAOImpl().getAllEmployee();
		if(list == null) 
			return;
		for(Employee item:list) {
			System.out.printf("\n%-10s", item.getEmpId());
		}
	}
}

