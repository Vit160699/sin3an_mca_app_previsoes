package usjt_ccp3anmca_observer;

public class CurrentConditionsDisplay extends Display {

	@Override
	public void display() {
		
	}
	
	@Override
	public void update(double temperature, double humidity, double pressure) {
		System.out.println("----------------------------------------");
		System.out.println("--------Temperatura do dia--------");
		System.out.printf("Temperatura: %.0f, Pressão: %.2f\n", temperature, humidity, pressure);
	}
}
