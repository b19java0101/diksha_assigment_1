package Diksha_monthly_test;

import java.util.Scanner;

public class Simple {
	public static void main(String[] args) {
		int i,n = 0;
		boolean flag=false;
		int []arr=new int[5];
		int pos=0;
		Scanner s=new Scanner(System.in);
	System.out.println("enter the number");
		for( i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("enter element to search");
		 n=s.nextInt();
		for( i=0;i<arr.length;i++)
		{
			if(arr[i]==n)
			{
			flag=true;	
			 pos=i+1;
			}
					
		}
		if(flag==true)
		{
		System.out.println("elment found at"+pos);
		}
		else
			System.out.println("Element not found");
		
	}

	}

