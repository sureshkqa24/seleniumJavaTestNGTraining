package basics;

public class Student {
	
	private int rollNumber;
	private String fName;
	private String LName;
	private int age;
	
	protected void showStudentInfo() {
		System.out.println("Roll number "+rollNumber);
		System.out.println("First Name "+fName);
		System.out.println("Last Name "+LName);
		System.out.println("age "+age);
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getLName() {
		return LName;
	}

	public void setLName(String lName) {
		LName = lName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
