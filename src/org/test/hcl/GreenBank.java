package org.test.hcl;

public class GreenBank extends Axisbank{
	
	@Override
	public void deposit() {
		System.out.println("6%");
		
	}
	
	@Override
	public void savings() {
		System.out.println("7%");
		
	}
	public static void main(String[] args) {
		GreenBank G= new GreenBank();
    G.deposit();
    G.savings();
	}
	
	

}
