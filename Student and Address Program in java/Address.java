public class Address {
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