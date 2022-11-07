package org.anpc3065.dao;
import org.anpc3065.model.Employee;

public class EmployeeDAO {
	EmployeeDAO EmployeeDAOArr[]=new EmployeeDAO[10];
	public void setEmployee(EmployeeDAO employeeData) 
	{
		for (int  i = 0;i<EmployeeDAOArr.length;i++) 
		{
			if (EmployeeDAOArr[i]==null) {
				EmployeeDAOArr[i]=employeeData;
				break;
				
			}
		}
	}

					public EmployeeDAO[] getEmployees() {
						return EmployeeDAOArr;
					}
				
					public EmployeeDAO getEmployeeSalary(Double employeeSalary) 
					{
							
							
						return 	;
					}

}