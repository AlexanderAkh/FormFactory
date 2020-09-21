package ua.itea.lesson9HomeWork;

import java.util.Scanner;

public class Triang {
	private int id = 2;
	private String name = "triangle";
	private static double a;
	private static double b;
	private static double c;
	private double height;
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

	protected void userInputInfo() {
		System.out.println("Id: " + id + ": You chose a triangle.");
		System.out.println("Please input side - a: ");
		a = userIn();
		System.out.println("Please input side - b: ");
		b = userIn();
		System.out.println("Please input side - c: ");
		c = userIn();
		
		System.out.println("End" + "\n" + "-------------------------------------------------------------");
	}
	
	protected void userOutputInfo() {
		setTriang();
		System.out.println("End of Output" + "\n" + "-------------------------------------------------------------");
		agr.getText();
	}
	
	
	private double calcPer(double a, double b, double c) {
		
		return a+b+c;
	}

	private double calcArea(double a, double b, double c) {
		double per = calcPer(a, b, c)/2;
		height = Math.sqrt((per  * (per - a) * (per - b) * (per - c)) / a);
		double area = (a / 2) * height;
		return Math.round(area * 100.0)/100.0;
	}
	
	protected Object setTriang() {
		return color.getColor() + " " + name + ". Area: " + calcArea(a, b, c) + ". Perimter: " + calcPer(a, b, c) ;
	}
	

}
