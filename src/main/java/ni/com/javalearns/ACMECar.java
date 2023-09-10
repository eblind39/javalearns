package ni.com.javalearns;

public class ACMECar implements Car {

	private int acceleration = 0;
	private int speed = 0;
	private int gear = 0;
	
	@Override
	public void accelerate(int newValue) {
		// TODO Auto-generated method stub
		this.acceleration = newValue;
	}

	@Override
	public void changeGear(int newValue) {
		// TODO Auto-generated method stub
		this.gear = newValue;
	}

	@Override
	public void speedUp(int increment) {
		// TODO Auto-generated method stub
		this.speed += increment;
	}

	@Override
	public void applyBrakes(int decrement) {
		// TODO Auto-generated method stub
		this.speed -= decrement;
	}
	
	void printStates() {
		System.out.println("Acceleration: " + this.acceleration + "\n" +  
						   "Gear: " + this.gear + "\n" +
						   "Speed: " + this.speed);
	}
}
