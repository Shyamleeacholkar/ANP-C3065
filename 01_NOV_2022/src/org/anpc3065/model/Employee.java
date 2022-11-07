package org.anpc3065.model;

public class Employee {
	
			int employeeId;							
			String employeeName;					
			Double employeeSalary;	
			float numberOfYearTheCompany;	
	
			//////constructor
			public Employee (int eId,String eName,Double eSalary,float eYear)
			{
			}
			public Employee ()
			{
			}
			
			////set
			public void setemployeeIdId(int eId) 
			{ 
				employeeId=eId;	
			}
			public void setEmployeeName(String eName)
			{
				 employeeName=eName;			
			}
			public void setEmployeeSalary(Double eSalary) {
				 employeeSalary=eSalary;	
			}
			public void setNumberOfYearTheCompany(float eYear)
			{
				 numberOfYearTheCompany=eYear;	
			}
			////get
			public int getEmployeeId() {
			return employeeId ;
			}
			public void getEmployeeName() 
			{
			}
			public Double getEmployeeSalary() 
			{
			return employeeSalary ;
			}
			public float getNumberOfYearTheCompany() 
			{
				return numberOfYearTheCompany ;
				}
			
			}
