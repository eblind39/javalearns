package ni.com.javalearns;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ACMECar acmeCar = new ACMECar();
    	
    	acmeCar.accelerate(10);
    	acmeCar.changeGear(3);
    	acmeCar.speedUp(17);
    	acmeCar.applyBrakes(5);
    	
    	acmeCar.printStates();
        System.out.println( "\nHello JavaLearns!" );
    }
}
