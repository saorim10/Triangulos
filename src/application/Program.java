/* Fazer um programa para ler as medidas dos lados de dois triângulos X e Y (suponha medidas
válidas). Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos
possui a maior área.*/

package application;

import java.util.Scanner;
import entities.Triangulo;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Triangulo x = new Triangulo();
		System.out.println("Entre com as medidas do triângulo X: ");
		x.setLadoA(sc.nextDouble());
		x.setLadoB(sc.nextDouble());
		x.setLadoC(sc.nextDouble());
		
		Triangulo y = new Triangulo();
		System.out.println("Entre com as medidas do triângulo Y: ");
		y.setLadoA(sc.nextDouble());
		y.setLadoB(sc.nextDouble());
		y.setLadoC(sc.nextDouble());
		
		System.out.printf("Área triângulo X: %.4f%n", x.area());
		System.out.printf("Área triângulo Y: %.4f%n", y.area());
		
		if (x.area() > y.area()) {
			System.out.println("Maior área: Triângulo X");
		} else {
			System.out.println("Maior área: Triângulo Y");
		}
		
		sc.close();
	}
}
