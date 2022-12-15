package com.question2;

public class EmpBusinessLogic {
	public double calculateYearlySalary(EmployeeDetails employeeDetails) {
		double yearlySalary=employeeDetails.getMonthlySalary()*12;
		return yearlySalary;
		
	}
	public double calculateAppraisal(EmployeeDetails employeeDetails) {
		double appraisal=0;
		if(employeeDetails.getMonthlySalary()<20000)
		{
			appraisal=1000;
			
		}
		else
		{
			appraisal=1500;
		}
		return appraisal;
		
	}
	

}