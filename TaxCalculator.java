package ecs;
import java.util.*;
import java.util.SortedSet;

public class TaxCalculator 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the monthly salary:");
		int salary = sc.nextInt();
		double tax =0f;
		long a_salary =12*salary;
		if(a_salary < 250000)
			tax=0;
		else if(250000 <=a_salary && a_salary<500000)
		{
			tax = (a_salary - 250000) * 0.2;
		}
		else if(500000 <= a_salary && a_salary<1000000)
		{
			tax= 250000*0.1 + (a_salary-500000)*0.2;
		}
		else if(a_salary>=1000000)
		{
			tax = 250000*0.1 + 500000*0.2 +(a_salary-1000000)*0.3;
		}
		System.out.println("Tax amt is "+ tax +"/-");
	}
}