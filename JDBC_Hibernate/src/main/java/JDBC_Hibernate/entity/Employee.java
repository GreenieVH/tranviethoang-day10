package JDBC_Hibernate.entity;

import java.math.BigInteger;
import java.sql.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "EMPLOYEE")
public class Employee implements java.io.Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
    @Basic(optional = false)
    @Column(name = "EMP_ID")
    private BigInteger empId;

    @Basic(optional = false)
    @Column(name = "EMP_NAME", length = 50)
    private String empName;

    @Basic(optional = false)
    @Column(name = "EMP_NO", length = 20)
    private String empNo;

    @Basic(optional = false)
    @Column(name = "HIRE_DATE")
    private Date hireDate;

    @Column(name = "IMAGE")
    private byte[] image;

    @Basic(optional = false)
    @Column(name = "JOB", length = 30)
    private String job;

    @Basic(optional = false)
    @Column(name = "SALARY")
    private float salary;

    @Basic(optional = false)
    @Column(name = "DEPT_ID")
    private int deptId;

    @Column(name = "MNG_ID")
    private BigInteger managerId;

	public Employee(BigInteger empId, String empName, String empNo, Date hireDate, byte[] image, String job,
			float salary, int deptId, BigInteger managerId) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empNo = empNo;
		this.hireDate = hireDate;
		this.image = image;
		this.job = job;
		this.salary = salary;
		this.deptId = deptId;
		this.managerId = managerId;
	}
    
    public Employee() {
    	
    }

	public BigInteger getEmpId() {
		return empId;
	}

	public void setEmpId(BigInteger empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpNo() {
		return empNo;
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public BigInteger getManagerId() {
		return managerId;
	}

	public void setManagerId(BigInteger managerId) {
		this.managerId = managerId;
	}
	
}
