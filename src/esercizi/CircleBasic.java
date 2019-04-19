package esercizi;

public class CircleBasic {

	private double x, y, r;

	public CircleBasic(double x, double y, double r) {
		super();
		this.x = x;
		this.y = y;
		this.r = r;
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

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	public String isInside(PointBasic p) {
		double distance;
		distance = Math.sqrt(Math.pow(this.x - p.getX(), 2) + Math.pow(this.y - p.getY(), 2));
		if (distance <= this.r) {
			return "Il punto SI TROVA all'interno della circonferenza";
		} else {
			return "Il punto NON SI TROVA all'interno della circonferenza";
		}
	}

	@Override
	public String toString() {
		return "CircleBasic [x=" + this.x + ", y=" + this.y + ", r=" + this.r + "]";
	}

}
