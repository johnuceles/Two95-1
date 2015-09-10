package assignments;


class ExampleAbstract extends AbstractDemo
{
	     
	   public void disp2()
	   {
	       System.out.println("I'm overriding abstract method");
	   }
	   
	   public static void main(String args[])
	   {
		   ExampleAbstract obj = new ExampleAbstract();
		   obj.disp1();
	       obj.disp2();
	   }
}