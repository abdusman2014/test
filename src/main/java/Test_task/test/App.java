package Test_task.test;

/**
 * Hello world!
 *
 */

//withdrawl waly function k liye class
abstract class Bike{ 
	 float salary=40000; 
	abstract void run();  
	public void same() {
		System.out.println( "I am same for both classes"  );
	}
}

/*
//parent bank class
class Employee{  
	float salary=40000;  
} */

// saving bank class
class Programmer extends Bike{
	float salary = 50;
	int bonus=10000;  
	@Override
	public void run(){System.out.println("running safely with programmer");}  
}

//checking bank class
class test  extends Bike{  
	int bonus=90000;  
	@Override
	public void run(){System.out.println("running safely with test");}  
}


public class App 
{
	public static void main( String[] args )
	{
		Programmer a = new Programmer();
		a.run();

		test b = new test();
		b.run();
		System.out.println( "salary a: " + a.salary );
		System.out.println( "salary b: " + b.salary );
		
		a.same();
		b.same();

		System.out.println( "bonus a: " + a.bonus );
		System.out.println( "bonus b: " + b.bonus );
	}
}
