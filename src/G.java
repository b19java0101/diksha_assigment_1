
public class G {

	public static void main(String[] args) {
		
		for(int i=1;i<=6;i++)
		{
		for(int j=1;j<=6;j++)
		{
			if(i==1)
			if((j>=2)&&(j<=6))
			System.out.print("*");
				else
					System.out.print(" ");
			
			if(i==2)
				if(j==1)
				System.out.print("*");
			else
				System.out.print(" ");
		
			if(i==3)
				if((j==1)||(j==5)||(j==6))
				System.out.print("*");
				else
					System.out.print(" ");
			
		
			if(i==4)
				if((j==1)||(j==4)||(j==6))
					System.out.print("*");
					else
						System.out.print(" ");
			if(i==5)
				if((j==1)||(j==6))
					System.out.print("*");
					else
						System.out.print(" ");
			
			if(i==6)
			if((j>=2)&&(j<=5))
				System.out.print("*");
				else
					System.out.print(" ");
			
		}
		System.out.println();
		}

	}

}
