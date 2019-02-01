package Assig1;

import java.io.IOException;

public class PermanentEmp extends Employee {
	int paid_leave,sick_leave,causal_leave;
	double basic,hra,pfa;
	boolean flag=false;
	PermanentEmp()throws IOException
	{
		paid_leave=5;
		sick_leave=3;
		causal_leave=2;
		System.out.println("Enter the basic salary:");
		basic=Double.parseDouble(br.readLine());
	}
	
	void print_leaves_details()
	{
		System.out.println("\n\nTotal_leaves_Detail\n\n");
		System.out.println("\tpaid_leave\tsick_leave\tcausal_leave\n");
		System.out.println("\t\t"+paid_leave+"\t\t"+sick_leave+"\t"+causal_leave+"\n");
	}
	void calculate_balance_leaves()
	{
		System.out.println("\n\n\tEnter the balance_leave_detail");
		total_leave=paid_leave+sick_leave+causal_leave;
		System.out.println("total_leave"+total_leave);
	}
	boolean avail_leave(int no_of_leave,char type_of_leave)
	{
		if(type_of_leave=='p')
		{
			if(no_of_leave<=paid_leave)
			{
				flag=true;
				paid_leave=paid_leave-no_of_leave;
			}
			else
			{
				flag=false;
			}
		}
		else if(type_of_leave=='s')
		{
			if(no_of_leave<=sick_leave)
			{
				flag=true;
				sick_leave=sick_leave-no_of_leave;
			}
			else
			{
				flag=false;
			}
		}
		else if(type_of_leave=='c')
		{
			if(no_of_leave<=causal_leave)
			{
				flag=true;
				causal_leave=causal_leave-no_of_leave;
			}
			else
			{
				flag=false;
			}
		}
		return flag;
		
	}
	void calculate_salary()throws IOException
	{
	pfa=(12/100)*basic;
	hra=(5/100)*basic;
	total_salary=basic+hra-pfa;
	System.out.println("total_salary="+total_salary);
	
	}
	



	

}
