package strings;

public class TightCoupling {
	public static void main(String[] args) {
		
		Mobile m = new Mobile();
		m.display();
		
	}

}
class Mobile{
	Charger c;
	public Mobile() {
		c= new Charger();
		
	}
	public void display() {
		System.out.println("Mobile");
		c.display();
		
	}
}

class Charger{
	public Charger() {
		
	}
	public void display() {
		System.out.println("Charger");
	}
}