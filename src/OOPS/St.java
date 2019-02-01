package OOPS;

import java.io.IOException;

public class St {
		public static void main(String[] args) throws IOException{
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

	}

}
