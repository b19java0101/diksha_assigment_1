package Array;

import java.util.Scanner;

public class ascending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr=new int[5];
		Scanner s=new Scanner(System.in);
		System.out.println("enter the array");
		for(int i=0;i<arr.length;i++)
		{
		arr[i]=s.nextInt();
}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
				int temp;
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
}
		System.out.println("ascending order");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+"");
		}
}
}


		
