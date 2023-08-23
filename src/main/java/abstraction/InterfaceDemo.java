package abstraction;

public interface InterfaceDemo {
	
public static final int rollNo=10;

public static final double pi=3.14;
	
public abstract void printInfo();

public default void printInformation() {
	System.out.println("Show this information");
}

public static void display() {
	System.out.println("Show this information from static method");
}
	

}
