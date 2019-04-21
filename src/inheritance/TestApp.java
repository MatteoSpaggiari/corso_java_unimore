package inheritance;

public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Motorbike m1 = new Motorbike("Red","Yamaha",256.90);
		System.out.println(m1);
		MotorbikeSold ms1 = new MotorbikeSold("Blue","Ducati",300.56,"AA4567",320.45);
		System.out.println(ms1);
		ms1.setSpeed(400);
		System.out.println(ms1);
		ms1.setLicencePlate("4567");
		System.out.println(ms1);
		ms1.setLicencePlate("4567AA");
		System.out.println(ms1);
	}

}
