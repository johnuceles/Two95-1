package assignments;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BinarySearch {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try
		{
		System.out.println("enter the number to be searched");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int number=Integer.parseInt((br.readLine()));
		
		System.out.println("Enter the series of 5 numbers ");
		int a[]={3,4,2,7,5,8};
		Arrays.sort(a);
		int i;
		for(i=0;i<6;i++)
		{
		System.out.println(a[i]);
		}
		
		int value=Arrays.binarySearch(a,number);
		System.out.println(value);//value will be >=0 if value is found
		
		}
		catch(Exception e)
		{
			
		}
		}
		
		
	}


