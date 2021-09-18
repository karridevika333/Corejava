package threads;

class Addition extends Thread{}
class Division extends Thread{}
class Subtraction extends Thread{}
class Multiplication extends Thread{}

public class Calculation {
	
	public static void main(String[] args) {
		
		Addition add = new Addition();
		Division div = new Division();
		Multiplication mul = new Multiplication();
		Subtraction sub = new Subtraction();
		add.start();
		div.start();
		mul.start();
		sub.start();
		
		
		
	}

}
