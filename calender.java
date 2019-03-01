package calender;

import java.util.Scanner;



public class calender {

	public calender() {
		// TODO Auto-generated constructor stub
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int odd=0,a=0;
		System.out.println("enter the date");
		Scanner sc = new Scanner(System.in);
		String date = sc.nextLine();
		int day = Integer.parseInt(date.substring(0, 2));
		int mon=Integer.parseInt(date.substring(3,5));
		int year=Integer.parseInt(date.substring(6,10));
		 odd=odd1(year);
		 System.out.println(odd);
		 a=day1(day,mon,year);
		 System.out.println(a);
		 print1(odd,a);
		 
		 
	}


public static int odd1(int y)
{
	int odd=0;
	if(y>2000)
	{
		for(int i=2001;i<y;i++)
		{
		if(i%4==0 || i%400==0 )
		{
			odd+=2;
		}
		else
		{
			odd+=1;
		}
	}
	}
	else
	{
		for(int i=1901;i<y;i++)
		{
		if(i%4==0 || i%400==0 )
		{
			odd+=2;
		}
		else
		{
			odd+=1;
		}
		}
		odd+=1;
	}
	odd=odd%7;
	return odd;
}
public static int day1(int dd,int mm,int yy)
{   int td=0;
    if(yy%4==0 || yy%400==0)
    {
    int[] month = new int[]{ 31,29,31,30,31,30,31,31,30,31,30,31 };
	for(int i=0;i<mm-1;i++)
	{
		td+=month[i];
	}
	td+=dd;
	return td;
    }
    else
    {
        int[] month = new int[]{ 31,28,31,30,31,30,31,31,30,31,30,31 };
    	for(int i=0;i<mm-1;i++)
    	{
    		td+=month[i];
    	}
    	td+=dd;
    	return td;
        }
    	
    
    
}
public static void print1(int odd,int a)
{
	int pday,p;
	String[] dayw=new String[] {"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
	pday=a%7;
	p=odd+pday;
	p=p%7;
	System.out.println(dayw[p]);
	
}
}