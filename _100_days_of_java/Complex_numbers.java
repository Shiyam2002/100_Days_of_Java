package _100_days_of_java;

public class Complex_numbers {
	 double real,img;
	 
	 public Complex_numbers(double real,double img) {
		 this.img=img;
		 this.real=real;
	 }
	 public static void main(String[] args) {
		Complex_numbers com1 = new Complex_numbers(2.5, 6.0);
		Complex_numbers com2 = new Complex_numbers(4.7, 1.8);
		Complex_numbers temp;
		temp = add(com1,com2);
		System.out.println("Sum= "+temp.real+" "+temp.img);
	}
	private static Complex_numbers add(Complex_numbers com1, Complex_numbers com2) {
		Complex_numbers temp = new Complex_numbers(0.0, 0.0);
		temp.real = com1.real+com2.real;
		temp.img = com1.img+com2.img;
		return temp;
	}
}