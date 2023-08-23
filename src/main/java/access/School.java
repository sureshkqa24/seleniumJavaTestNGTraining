package access;

import abstraction.InterfaceDemo;
import basics.Student;

public class School implements InterfaceDemo {

	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] arg)
	{
		School s = new School();
		s.printInformation();
	}
	

}
