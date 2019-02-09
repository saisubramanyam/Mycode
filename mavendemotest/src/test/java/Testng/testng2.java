package Testng;

import org.testng.annotations.Test;

public class testng2 {

	
	@Test
	public void add()
	{
		int a=10;
		int b=20;
		
		int c= a+b;
		System.out.println("sum is:"+c);
	}
	
	@Test
	public void sub()
	{
		int a=10;
		int b=20;
		
		int c= a-b;
		System.out.println("substraction is:"+c);
		
		
		}
	
	@Test
	public void div()
	{
		int a=10;
		int b=20;
		int c= b/a;
		System.out.println("division is:"+c);
		
	}

	
	
}
