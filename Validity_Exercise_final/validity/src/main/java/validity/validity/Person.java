package validity.validity;

import java.util.Comparator;

public class Person {

	private String Firstname;
	private String Lastname;
	private String Company;
	private String Email;
	private String Address;
	private String Zip;
	private String City;
	private String State_long;
	private String State;
	private String PhoneNumber;
	
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public String getCompany() {
		return Company;
	}
	public void setCompany(String company) {
		Company = company;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getZip() {
		return Zip;
	}
	public void setZip(String zip) {
		Zip = zip;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState_long() {
		return State_long;
	}
	public void setState_long(String state_long) {
		State_long = state_long;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return  Firstname + "," + Lastname + "," + Company + "," + Email
				+ "," + Address + "," + Zip + "," + City + "," + State_long + ","
				+ State + "," + PhoneNumber ;
	}
	
	
	public Person(String firstname, String lastname, String company, String email, String address, String zip,
			String city, String state_long,  String phoneNumber,String state) {
		super();
		Firstname = firstname;
		Lastname = lastname;
		Company = company;
		Email = email;
		Address = address;
		Zip = zip;
		City = city;
		State_long = state_long;
		State = state;
		PhoneNumber = phoneNumber;
	}
	
	
	
	
	
}

class Sortbyname implements Comparator<Person>
{
    // Used for sorting in ascending order of
    // roll number
    public int compare(Person p1, Person p2)
    {
        return p1.getFirstname().compareToIgnoreCase(p2.getFirstname());
    }
}
 