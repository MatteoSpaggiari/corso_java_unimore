package corso_java;

public class PointBasic {

	private double x, y;
	
	public PointBasic(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}


	public double getY() {
		return y;
	}


	public void setY(double y) {
		this.y = y;
	}
	
	public double distance(PointBasic p) {
		double distance = Math.sqrt(Math.pow(this.x-p.getX(),2)+Math.pow(this.y-p.getY(),2));
		return distance;
	}

	public static double distanceTwoPoints(PointBasic p1, PointBasic p2) {
		double distance = Math.sqrt(Math.pow(p1.getX()-p2.getX(),2)+Math.pow(p1.getY()-p2.getY(),2));
		return distance;
	}


	@Override
	public String toString() {
		return "PointBasic [x=" + this.x + ", y=" + this.y + "]";
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PointBasic p1 = new PointBasic(0,0);
		PointBasic p2 = new PointBasic(5,5);
		
		System.out.println(p1.distance(p2));
		System.out.println(PointBasic.distanceTwoPoints(p1, p2));
		

	}

}
