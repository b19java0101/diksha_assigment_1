package Assig1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Employee {
	int empId;
	String empName;
	int total_leave=5;
	double total_salary;
	BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	Employee()throws IOException
	{
		System.out.println("Enter the employee_id:");
		empId=Integer.parseInt(br.readLine());
		System.out.println("Enter the employee_name:");
		empName=br.readLine();
	}
	void caculate_balance_leaves()
	{
		
	}
	boolean avail_leave(int no_of_leave,char type_of_leave)
	{
		return false;
		
	}
	void calculate_salary()throws IOException
	{
		
	}
	
}
