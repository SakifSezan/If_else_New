package demo;

public class N2 {

	public static void main(String[] args) {
		N2.R();
		N2 TX = new N2();
		TX.S();
		
		
		String a = "Sakif Sezan";
		if(a=="Sakif")
		System.out.println("True");
		else
			System.out.println("False");

	}
	
	public static void R() {
		
		double a = 199.99;
		if(a<10.99)
			System.out.println("This is True");
		else
			System.out.println("This is False");
		
	}
	
	public void S() {
		
		char x = 'R';
		if(x=='R')
			System.out.println("Right");
		else
			System.out.println("Wrong");
			
	}

}
