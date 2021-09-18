package basics;

class Sum{

	public int sum(int... args) {
		int sum=0;
		for(int i : args)
			sum +=i;
		return sum;
		
		
	
		
	}
}

public class VarArgs {
	public static void main(String[] args) {
		Sum s = new Sum();
		System.out.println(s.sum(1,2,3,4,5,6));
		
	}
}

	

