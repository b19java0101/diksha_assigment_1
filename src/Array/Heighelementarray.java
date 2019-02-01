package Array;
import java.util.Scanner;

public class Heighelementarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]arr=new int[5];
Scanner s=new Scanner(System.in);
System.out.println("enter the arrary");
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
System.out.println("enter the highest number"+big);
}
}


