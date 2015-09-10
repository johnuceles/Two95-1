package assignments;

public class StaticExample
{
	public static void main(String[] args)
	{
		StaticSubClass sc=new StaticSubClass();
		sc.display();
		sc.show();

	}
}

 class StaticParentClass
{
	public static int var=10;
    public static void display()
    {
        System.out.println("Inside static method of superclass");
    }
}

 class StaticSubClass extends StaticParentClass
{
	 
    public void show()
    {
    	System.out.println(var);
    }
}

