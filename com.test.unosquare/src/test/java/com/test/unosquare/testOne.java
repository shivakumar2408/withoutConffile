package com.test.unosquare;

public class testOne {
	public static void main(String [] args) {
	int j =1;
	int count = 1;
	for (int i =0; i < 20; i++)
	{
		if(j < 11)
		{
			
			
			String spaces = String.format("%" + count + "s", " ");
			System.out.println(spaces + j);
			
			count ++;
			j++;
			
		}
		if(j >=11 && j <=20)
		{
			
			//--count;
			String spaces = String.format("%" + count + "s", " ");
			System.out.println(spaces + j);
			
			count --;
			j++;
			
		}
	}
}
}
