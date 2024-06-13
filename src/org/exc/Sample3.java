package org.exc;

public class Sample3 {
	public static void main(String[] args) throws Throwable {
		try {
			System.out.println("1");
			int data = 5/0;
			
		} 
		catch (ArithmeticException e) {
			Throwable n = new Throwable("Sample");
			try {
				throw n;	
			} 
			catch (Throwable e2) {
				System.out.println("8");
			}
			finally {
				System.out.println("3");
			}
			System.out.println("4");
		}
	}

}
