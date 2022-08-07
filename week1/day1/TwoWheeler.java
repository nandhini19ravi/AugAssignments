package week1.day1;

public class TwoWheeler {
	int noOfWheels = 2;
	short noOfMirrors = 2 ;
	long chassisNumber = 4L;
	boolean isPunctured = false;
	String bikeName = "Yamaha"; 
	double runningKM = 400;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoWheeler obj = new TwoWheeler();
		System.out.println("No of wheels "+obj.noOfWheels+"\n No of Mirrors "+obj.noOfMirrors+"\n ChassisNumber "+obj.chassisNumber+"\nPuncture "+obj.isPunctured+"\nBike "+obj.bikeName+"KM"+obj.runningKM);
	}

}
