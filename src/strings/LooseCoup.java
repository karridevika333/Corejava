package strings;

public class LooseCoup {

		
		class A{
			private int a= 0;
			public int getA() {
				System.out.println("getA() method");
				return a;
			}
			public void setA(int aa) {
				if(!(aa > 10))
					a = aa;
				
			}
		}
		public class B{
			
			public static void main(String[] args) {
				
				A aObject = new A();
				aObject.setA(100);
				System.out.println("aObject value is : " + aObject.getA());
			}
			
		}
	}
		
//		Show b = new B();
//		Show c = new C();
//		
//		A a = new A(b);
//		a.display();
//		
//		A a1 = new A(c);
//		a1.display();
//		
//		
//	}
//
//}
//
//interface Show{
//	public void display();
//	
//}
//
//class A {
//	Show s;
//	public A(Show s) {
//		this.s = s;
//		
//	}
//	
//	public void display() {
//		System.out.println("A");
//		s.display();
//		
//	}
//}
//class B implements Show {
//	public B() {
//		
//	}
//	public void display() {
//		System.out.println("B");
//	}
//}
//class C implements Show {
//	public C() {
//		
//	}
//	public void display() {
//		System.out.println("C");
//	}
//}