package ua.itea.lesson9HomeWork;

import java.util.Scanner;

public class Circ {
	private int id = 3;
	private String name = "circle";
	private static double pi = 3.14159265359;
	private static double a;
	Agr agr = new Agr();
	Col color = new Col();
	
	public int getId() {
		return id;
	}

	private double userIn() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		double in = input.nextDouble();
		return in;
	}

	private double calcPer(double a, double pi) {
		double per = 2 * a * pi;
		return Math.round(per * 100.0)/100.0;
	}

	private double calcArea(double a, double pi) {
		double area = pi * (a * a);
		return Math.round(area * 100.0)/100.0;
	}

	protected void userInputInfo() {
		System.out.println("Id: " + id + ": You chose a circle.");
		System.out.println("Please enter the radius: ");
		a = userIn();
		System.out.println("End" + "\n" + "-------------------------------------------------------------");
	}
	
	protected void userOutputInfo() {
		setCirc();
		System.out.println("End of Output" + "\n" + "-------------------------------------------------------------");
		agr.getText();
	}

	
	protected Object setCirc() {
		return color.getColor() + " " + name + ". Area: " + calcArea(a, pi) + ". Perimter: " + calcPer(a, pi);
	}

}
