package week1.day2;

public class Car {
	public void myCar() {
		System.out.println("My Car is Tata Tiago");
	}
	public String myCarColor() {
		return "Mettalic Orange";
	}
	public short myCarEngineNumber() {
		short a = 22894;
		return a;
	}
	public void numberActions(int a, int b) {
		int sub = a-b;
		System.out.println("Subtraction of 2 numbers are "+sub);
		int mul = a*b;
		System.out.println("Multiplication of 2 numbers are " +mul);
		int div = a/b;
		System.out.println("Division of 2 numbers are "+div);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car obj1 = new Car();
		obj1.myCar();
		String Color = obj1.myCarColor();
		System.out.println(Color);
		short engineNumber = obj1.myCarEngineNumber();
		System.out.println(engineNumber);
		obj1.numberActions(10, 2);

	}

}
