/**
 * 
 */
package assignments;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Jees
 *
 */
public class Palindrome {

	/**
	 * @param args
	 * 
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Enter the element to check");
		try
		{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 String element=br.readLine();
		 
		int status= checkPalindrome(element);
		
		if(status==1)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
		
		}
		catch(Exception e)
		{
			
			
		}
		}

	public static int checkPalindrome(String element) 
	{
		int status=0;
		 StringBuilder sb= new StringBuilder(element);
		 StringBuilder reverse = sb.reverse();
		 System.out.println(element);
		 System.out.println(reverse);
		 if(reverse.toString().equals(element))
			 status=1;
		 
		 
		 return status;
		
	}
		
		
	}


