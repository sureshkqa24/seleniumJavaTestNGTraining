package abstraction;

public class InterfaceDemo2class implements InterfaceDemo,SecondInterface {

	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] arg)
	{
		InterfaceDemo2class in = new InterfaceDemo2class();
		InterfaceDemo.display();
	}

}
