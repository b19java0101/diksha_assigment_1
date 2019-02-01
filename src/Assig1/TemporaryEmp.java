package Assig1;

import java.io.IOException;

public class TemporaryEmp extends PermanentEmp {
	TemporaryEmp()throws IOException
	{
		super();
		System.out.println("Enter the total_salary:");
		total_salary=Double.parseDouble(br.readLine());
	}
	
	
	void calculate_balance_leaves()
	{
		System.out.println("\n\t Enetr balace_leave_detail\n");
		System.out.println("\n total leave"+total_leave);
	}
	
	boolean avail_leave(int no_of_leave,char type_of_leave)
	{
		if(no_of_leave<=total_leave)
		{
			flag=true;
			total_leave=total_leave-no_of_leave;
		}
		else 
			{
			flag=false;
			}
		return flag;
		
	}
	void calculate_salary() throws IOException
	{
		System.out.println("total salary"+total_salary);
		
	}

	}


