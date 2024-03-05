package JDBC_Hibernate.dao;

import java.util.List;
import org.hibernate.Session;
import JDBC_Hibernate.entity.Employee;
import JDBC_Hibernate.utils.HibernateUtil;

public class EmployeeDAOImpl implements EmployeeDAO{
	@Override
	public List<Employee> getAllEmployee() {
		Session session = 
				HibernateUtil.getSessionFactory().openSession();
		try {
			session.beginTransaction();
//			List<Employee> list = session.createQuery("from Employee",Employee.class).list();
			List<Employee> result = session.createQuery("from Employee", Employee.class).getResultList();
			session.getTransaction().commit();
			session.close();
			return result;
		}catch(Exception ex) {
			ex.printStackTrace();
			session.close();
		}
		return null;
	}

	@Override
	public Employee getEmployeeById(String id) {
		Session session = 
				HibernateUtil.getSessionFactory().openSession();
		try {
			session.beginTransaction();
			Employee product = (Employee)session.createQuery("from Employee where EMP_ID = :empId").setParameter("empId", id).uniqueResult();			
			session.getTransaction().commit();
			session.close();
			return product;
		}catch(Exception ex) {
			ex.printStackTrace();
			session.close();
		}
		return null;
	}

	@Override
	public boolean insertEmployee(Employee employee) {
		Session session = 
				HibernateUtil.getSessionFactory().openSession();
		try {
			session.beginTransaction();
			session.save(employee);
			session.getTransaction().commit();
			session.close();
			return true;
		}catch(Exception ex) {
			ex.printStackTrace();
			session.close();
		}
		return false;
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		Session session = 
				HibernateUtil.getSessionFactory().openSession();
		try {
			session.beginTransaction();
			session.update(employee);
			session.getTransaction().commit();
			session.close();
			return true;
		}catch(Exception ex) {
			ex.printStackTrace();
			session.close();
		}
		return false;
	}

	@Override
	public boolean deleteEmployee(String id) {
		Session session = 
				HibernateUtil.getSessionFactory().openSession();
		try {
			session.beginTransaction();
			int res = session.createQuery("delete from Product where EMP_ID = :empId").setParameter("empId", id).executeUpdate();
			session.getTransaction().commit();
			session.close();
			if(res > 0)
				return true;
		}catch(Exception ex) {
			ex.printStackTrace();
			session.close();
		}
		return false;
	}
}
