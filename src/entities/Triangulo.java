package entities;

public class Triangulo {
	
	// Definicao de variaveis =====================================================
	private double ladoA;
	private double ladoB;
	private double ladoC;
	
	
	// Construtores ===============================================================
	public Triangulo() {
	}
	
	public Triangulo(double a, double b, double c) {
		this.ladoA = a;
		this.ladoB = b;
		this.ladoC = c;
	}
	
	// Getters & Setters ==========================================================
	public double getLadoA() {
		return ladoA;
	}
	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}
	public double getLadoB() {
		return ladoB;
	}
	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}
	public double getLadoC() {
		return ladoC;
	}
	public void setLadoC(double ladoC) {
		this.ladoC = ladoC;
	}

	// Cálculo da área do triângulo ===============================================
	public double area() {
		double p = (ladoA+ladoB+ladoC)/2;
		return Math.sqrt(p*(p-ladoA)*(p-ladoB)*(p-ladoC));
	}
}
