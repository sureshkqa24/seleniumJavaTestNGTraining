package polymorphism;

public class ChildClass {
	

	void display()
	{
		System.out.println("inside child class");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass c = new ChildClass();
		c.display();
		BaseClass b = new BaseClass();
		b.display();
	}

}
