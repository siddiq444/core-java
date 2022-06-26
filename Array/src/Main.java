import java.util.*; 
public class Main {
	public static void main(String args[])
	{
	Scanner reader =new Scanner(System.in);
	int n=reader.nextInt();
	int flag=0;
	int a[]=new int[n];
	int i;
	for(i=0;i<n;i++)
	{
		a[i]=reader.nextInt();
	}
	System.out.println("enter the elements");
	int x=reader.nextInt();
	
	for(i=0;i<n;i++)
	{
		if(a[i]==x)
		{
			flag=1;
			break;
		}
		else
		{
			flag=0;
		}
	}
	if(flag==1)
	{
		System.out.println("Position of the element is :"+(i+1));
		}
	else
	{
		System.out.println("element not found");
	}
	}
	}