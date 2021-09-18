package collections;
import java.util.ArrayList;
import java.util.List;


class Animal{
	String color;
	Animal(String color){
		this.color = color;
	}
	
	void eat(String name) {
		System.out.println(name + " is eating");
	}


class Dog extends Animal{
	Dog(String color){
		super(color);
		
	}
	
	void eat(String name) {
		System.out.println(name + "is eating");
	}
}





public  class GenericsDemo {
	
	public void main(String[] args) {
	
	
		
	
		Dog dog=new Dog("white");
		Animal animal = new Animal("brown");
		dog.eat("Germans");
		animal.eat("Indian Dog");
		
		Animal animal1=new Animal("brown");
		
		Dog dog1 = (Dog)animal1;
		
//		
		
		System.out.println(dog1);
		
	}

}
}
