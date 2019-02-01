package Array;

import java.util.Scanner;

public class Highest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr=new int[5];
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the arrays");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
			
		}
		int big=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>big)
				big=arr[i];
		}
		System.out.println("Enter the heigthest no."+ big);
	
int big1=arr[0];
for(int i=0;i<arr.length;i++)
{
	if((arr[i]>big1)&&(arr[i]<big))
		big1=arr[i];
}

System.out.println("Enter the second heigthest no."+big1);
}
}


