package OOPS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Students {
	static int roll_no=100;
	String name;
	float marks;
	static int i=1;
	static final String trainer_name="Shikhi";
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
Students()throws IOException
{
	System.out.println(" Enter the data for  Students is"+i);
	i++;
	System.out.println("Enter the name");
	name=br.readLine();
	System.out.println("Enter the marks");
	marks=Float.parseFloat(br.readLine());
}
void Display()
{
	i++;
	roll_no++;
System.out.println(roll_no+"  "+name+"  "+marks+" "+trainer_name);
}

	public static void main(String[] args)throws IOException {
		Students s1=new Students();
		Students s2=new Students();
		Students s3=new Students();
		s1.Display();
		s2.Display();
		s3.Display();
		}
}

