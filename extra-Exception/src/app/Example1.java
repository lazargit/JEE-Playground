package app;

import exception.MyException;
class A{
	public void m1(int  n, String s) throws MyException{
		if(n<0){
			throw new IllegalArgumentException("negative Zahl");//RuntimeException-> ungeprüft/uncheckedas
		}
		if (s==null) {
			throw new MyException("1111");// Exception->geprüft (Compiler)
		}
		
		System.out.println("hallo m1...");
	}
}
class B{
	private A a;
	
	public B(A a) {
		this.a = a;
	}


	public void m2(int n) throws MyException{

		a.m1(n,null);
	}
}

class C{
	public void m3(int n) throws MyException{
		new B(new A()).m2(n);
	}
}

public class Example1 {
	public static void main(String[] args) {
		C c = new C();
		try {
			c.m3(-3);
		}catch(IllegalArgumentException ee){
			System.out.println("Falsche Eingabe..."+ee.getMessage());
		
		}catch (MyException e) {
			
			System.out.println("Null-String: "+e.getMessage());
		}
	}

}
