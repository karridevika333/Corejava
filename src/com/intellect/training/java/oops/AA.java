package com.intellect.training.java.oops;

interface AA {
	void m10();
	default void m11() {
		
	}

}

class BB implements AA{
	
	@Override
	public void m10() {
		
	}
}
class C implements AA{
	
	@Override
	public void m10() {
		
	}
}
class DD implements AA{
	
	@Override
	public void m10() {
		
	}
}