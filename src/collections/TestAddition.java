package collections;

public class TestAddition {
	public static void main(String[] args) {
		
		Addition addition = new Addition() {
			int a,b,c;
			public int add(int a,int b) {
				c = a+ b;
				return c;
				
				
			}
		};
		
		int x=addition.add(100, 200);
		System.out.println(x);
		
	}

}
