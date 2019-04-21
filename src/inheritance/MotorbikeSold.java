package inheritance;

public class MotorbikeSold extends Motorbike {

	private String licencePlate;
	private double maxSpeed;
	
	public MotorbikeSold(String color, String model, double speed, String licencePlate, double maxSpeed) {
		super(color, model, speed);
		// TODO Auto-generated constructor stub
		this.licencePlate = licencePlate;
		this.maxSpeed = maxSpeed;
	}

	public String getLicencePlate() {
		return licencePlate;
	}

	public void setLicencePlate(String licencePlate) {
		if(licencePlate.matches("[A-Z0-9]{6}")) {
			this.licencePlate = licencePlate;
		} else {
			System.out.println("Errore targa: "+ licencePlate +" non va bene, deve avere 6 caratteri alfanumerici, lettere maiuscole.");
		}
	}

	public double getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public void setSpeed(double speed) {
		if(this.isAntitheft() == false) {
			// Operatore condizionale (ternario)
			double speedValue = speed > this.maxSpeed ? this.maxSpeed : speed;
			super.setSpeed(speedValue);
		}
	}

	@Override
	public String toString() {
		return "MotorbikeSold [antitheft=" + this.isAntitheft() + ", color=" + this.getColor() + ", model=" + this.getModel() + ", speed=" + this.getSpeed() + ", licencePlate=" + this.licencePlate + ", maxSpeed=" + this.maxSpeed+"]";
	}
	
	
}
