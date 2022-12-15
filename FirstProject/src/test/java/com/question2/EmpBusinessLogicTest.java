package com.question2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TestEmployeeDetails {
	static EmployeeDetails employee;
    static EmpBusinessLogic empBusinessLogic;
	
    @BeforeAll()
    static void setup()
    {
    	employee=new EmployeeDetails();
    	empBusinessLogic=new  EmpBusinessLogic();
    }
    @Test()
    void testCalculateYearlySalary()
    {
    	employee.setEmpName("jagadish");
    	employee.setMonthlySalary(10000);
    	employee.setAge(25);
    	double salary=empBusinessLogic.calculateYearlySalary(employee);
    	assertEquals(120000,salary);
    	
    	
    }
    @Test()
    void testCalculateAppraisal()
    {
    	employee.setEmpName("jagadish");
    	employee.setMonthlySalary(10000);
    	employee.setAge(25);
    	double appraisal=empBusinessLogic.calculateAppraisal(employee);
    	assertEquals(1000,appraisal);
    }
}