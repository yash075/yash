class Address {
	private String city;
	private int pin;
	
	//Constructors
	public Address(){
		city = "";   //Empty String
	}
	public Address(String city,int pin) {
		this.city = city;
		this.pin = pin;
	}
	
	//Getters - Setters
	public void setCity(String city) {
		this.city = city;
	}
	public String getCity() {
		return city;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public int getPin() {
		return pin;
	}
} //end class

class Student {
	private int roll;
	private String name;
	private Address localAddress;
	private Address postalAddress;
	
	// constructors
	public Student() {
		name = "";
		localAddress = new Address();
		postalAddress = new Address();
	}
	public Student(int roll,String name,Address localAddress,Address pstalAddress) {
		this.roll = roll;
		this.name = name;
		this.postalAddress = postalAddress;
		this.localAddress = localAddress;
	}
	
	//Getters - Setters
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public int getRoll() {
		return roll;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setPostalAddress(Address postalAddress) {
		this.postalAddress = postalAddress;
	}
	public Address getPostalAddress() {
		return postalAddress;
	}
	public void setLocalAddress(Address localAddress) {
		this.localAddress = localAddress;
	}
	public Address getLocalAddress() {
		return localAddress;
	}
}

public class App {
	static void print(Student p) { //Print Student
		System.out.println(p.getRoll()+" "+p.getName());
		System.out.println(p.getLocalAddress().getCity()+" "+p.getLocalAddress().getPin());
		System.out.println(p.getPostalAddress().getCity()+" "+p.getPostalAddress().getPin());
	}
	
	public static void main(String []args) {
		test1();
		test2();
		test3();
		test4();
		test5();
	}
	
	//Test = 5
	static void test5() {
		Student s = new Student();
		s.setRoll(10);
		s.setName("yash");
		s.setLocalAddress(new Address ("patan",384265));
		s.setPostalAddress(new Address ("surat",232515));
		print(s);
	}
	
	//Test = 4
	static void test4() {
		Address a = new Address("meh",254821);
		Address b = new Address("pat",485723);
		Student s = new Student();
		Student t = new Student(4,"B",b,a);
		s.setRoll(10);
		s.setName("A");
		s.setLocalAddress(a);
		s.setPostalAddress(b);
		print(s);
		print(t);
	}
	
	//Test = 3
	static void test3() {
		Address a = new Address("meh",124578);
		Student s = new Student(4,"modi",a,a);
		print(s);
	}
	
	//test = 2
	static void test2() {
		Student s = new Student(4,"yash modi",new Address("patan",384524),new Address("modi yash",897562));
		print(s);
	}
	
	//Test = 1
	static void test1() {
		Student s = new Student();
		s.setRoll(2);
		s.setName("modi yash.c");
		s.getLocalAddress().setCity("meh");
		s.getLocalAddress().setPin(3000);
		s.getPostalAddress().setCity("patan");
		s.getPostalAddress().setPin(357986);
		print(s);
	}
}//end class