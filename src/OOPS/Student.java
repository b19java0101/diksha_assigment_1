package OOPS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Student {
	private static int roll_no=1;
	private String name;
	private char gender;
	private  float marks;
	private static int i=10;
	static final  String trainer_name="Shikhi";
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	Student()throws IOException 
	{
		System.out.println("Enter the student i:="+i);
		System.out.println("Enter the student name");
		name=br.readLine();
		System.out.println("Enter the student gender");
		gender=br.readLine().charAt(0);
		System.out.println("Enter the student marks");
		marks=Float.parseFloat(br.readLine());
	}
	void Show()
	{
		roll_no++;
		System.out.println(roll_no+"  "+name+"  "+gender+"  "+marks);
	}
	/*public static void main(String[] args) throws IOException{
		int i;
		Student[]s=new Student[2];
		for(i=0;i<s.length;i++)
		{
			s[i]=new Student();
		}
		for(i=0;i<s.length;i++)
		{
			s[i].Show();
		}
	}*/
	}
