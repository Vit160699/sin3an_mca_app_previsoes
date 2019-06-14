package usjt_ccp3anmca_observer;

import java.util.Random;

public class IndiceCalorDisplay extends Display {
	
	private Random gerador = new Random();
	
	@Override
	public void display() {

	}
	
	
	//HI = T + (5/9)*(E-10)
	@Override
	public void update(double temperature, double humidity, double pressure) {
		double indiceCalor = temperature + (5/9) * (gerador.nextDouble()-10);
		System.out.println("--------Indice de Calor--------");
		System.out.printf("Indice de calor: %.2f\n", indiceCalor);
		if(indiceCalor >= 54) {
			System.out.println("Calor extremo! Altos riscos de queimaduras pela exposição ao sol\n");
		}else if(indiceCalor < 54 && indiceCalor >= 40) {
			System.out.println("Muito quente! Riscos de queimaduras, cãimbras ou exaustão devido a exposição ao calor\n");
		}else if(indiceCalor < 40 && indiceCalor >= 32) {
			System.out.println("Quente, Riscos de queimaduras ou fadiga devido a exposição ao calor\n");
		}else if(indiceCalor < 32 && indiceCalor >= 26) {
			System.out.println("Pouco quente, Risco de queimaduras e fadiga caso haja longo contato com o calor\n");
		}else {
			System.out.println("Morno, Baixo risco de exposição ao calor\n");
		}
		System.out.println("----------------------------------------");
	}
}
