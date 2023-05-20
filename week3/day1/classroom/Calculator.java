package week3.day1.classroom;

public class Calculator {
	
	public int add(int num1, int num2) {
		return num1+num2;

	}

	public int add(int num1, int num2,int num3) {
		return num1+num2+num3;

	}
	public double multiply(double num1, double num2) {
		return num1*num2;

	}
	public float multiply(float num1, float num2) {
		return num1*num2;

	}

	public static void main(String[] args) {
		Calculator calc= new Calculator();
		System.out.println("The addition of two int numbers is "+calc.add(10,75));
		System.out.println("The addition of three int numbers is "+calc.add(25, 50, 115));
		System.out.println("The multiplication of two double numbers is "+calc.multiply(59.25685,78.36987452));
		System.out.println("The multiplication of two float numbers is "+calc.multiply(12.2f,15.35f));

	}

}
