package JDBC_Hibernate.dao;

import java.util.List;

import JDBC_Hibernate.entity.Employee;


public interface EmployeeDAO {
	public List<Employee> getAllEmployee();
	public Employee getEmployeeById(String id);
	public boolean insertEmployee(Employee employee);
	public boolean updateEmployee(Employee employee);
	public boolean deleteEmployee(String id);
}
