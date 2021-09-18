package collections;

import java.util.List;

public class Customer {
	
	int id;
	String name;
	String email;
	List<String> phonenumbers;
	
	Customer(){
		
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<String> getPhonenumbers() {
		return phonenumbers;
	}
	public void setPhonenumbers(List<String> phonenumbers) {
		this.phonenumbers = phonenumbers;
	}


	public Customer(int id, String name, String email, List<String> phonenumbers) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phonenumbers = phonenumbers;
	}


	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", phonenumbers=" + phonenumbers + "]";
	}
	

}
