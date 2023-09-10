package ni.com.javalearns;

interface Car {
	void accelerate(int newValue);
	
	void changeGear(int newValue);
	
	void speedUp(int increment);
	
	void applyBrakes(int decrement);
}