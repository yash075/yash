public class Student {
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