package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		Calculator obj = new Calculator();
		int addition = obj.add(2, 4, 6);
		System.out.println("Addition of 3 numbers: "+addition);
		int subtraction = obj.sub(10, 4);
		System.out.println("Subtraction of 2 numbers: "+subtraction);
		double multiplication = obj.mul(5.5, 10.2);
		System.out.println("Multiplication of 2 numbers: "+multiplication);
		float division = obj.div(55, 2);
		System.out.println("Division of 2 number: "+division);

	}

}
