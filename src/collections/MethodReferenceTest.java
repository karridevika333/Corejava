package collections;



interface A{
	void show();
	
}

class B{
	 void disp() {
		System.out.println("calling abtract method");
		
	}

}
public class MethodReferenceTest {
	
	public static void main(String[] args) {
//		
		A a1 = B::disp;
		a1.show();
//		
		
		B b1= new B();
		A a2= new b1 ::disp;
		a2.show();
		
		A a3=new B()::disp;
		a3.show();
		
		// how to call a constructor?
		A a4 = B ::new;
		a4.show();
		
	}
	
	
	}
	
	

}
