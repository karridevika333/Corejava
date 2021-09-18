package strings;

public class Splitting {
	
	String s="Ashishyadav";
	int count=0;
	
	char a[]=s.toCharArray();
	
	char b []= new char [a.length+1];
	

	for (int i=0;i<=s.length()-1;i++)
	{
		b[i]=a[i];
	}
	
	
	
		
		for (int i=0;i<b.length;i++)
			{
			
			if(b[i]==' ')
			{
				continue;
				
			}	
			else if(count==1)
			{
				
				b[i]=a[i-1];
			}	
			
			
			if(i==5)
			{
				b[i+1]=' ';
				count=1;
			}
			
			}
		
		s=new String (b);
		System.out.println(s);
}

}


