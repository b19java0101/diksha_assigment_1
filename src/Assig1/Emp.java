package Assig1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Emp {

	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int choice=1,no_of_leave;
		char type_of_leave;
		PermanentEmp p=new PermanentEmp();
		do
		{
			System.out.println("Enter 1 if you want to leave details");
			System.out.println("Enter 2 if you want to check balance");
			System.out.println("Enter 3 if you want to avail.leave");
			System.out.println("Enter 4 if you want to check salary");
			System.out.println("Enter 5 if you want to exit");
			choice=Integer.parseInt(br.readLine());
			switch(choice)
			{
			case 1:
				p.print_leaves_details();
			break;
			case 2:
				p.calculate_balance_leaves();
			break;
			case 3:
				System.out.println("please enter the number of leaves");
				no_of_leave=Integer.parseInt(br.readLine());
				System.out.println("please enter the type of leaves");
				type_of_leave=br.readLine().charAt(0);
				boolean flag=p.avail_leave(no_of_leave,type_of_leave);
				if(flag==true)
				{
					System.out.println("Leave is granted");
				}
				else
				{
					System.out.println("Leave is not granted");
				}
				break;
			case 4:
				p.calculate_salary();
				
			break;
			case 5:
				System.exit(0);
			break;
			default:
				System.out.println("please enter right choice");
			}
		}while(choice!=5);
			

	}

}
