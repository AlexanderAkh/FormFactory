package ua.itea.lesson9HomeWork;

import java.util.Scanner;

public class Rect {
	private int id = 1;
	private String name = "rectangle";
	private static double a;
	private static double b;
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
		System.out.println("Id: " + id + ": You chose: a " + name);
		System.out.println("Please input side - a: ");
		a = userIn();
		System.out.println("Please input side - b: ");
		b = userIn();
		System.out.println("End of Input" + "\n" + "-------------------------------------------------------------");
	}

	protected void userOutputInfo() {
		setRect();
		System.out.println("End of Output" + "\n" + "-------------------------------------------------------------");
		agr.getText();
	}

	private double calcPer(double a, double b) {
		double per = (a + b) * 2;
		return per;
	}

	private double calcArea(double a, double b) {
		double area = (a * b);
		return area;
	}
	protected Object setRect() {
		return color.getColor() + " " + name + ". Area: " + calcArea(a, b) + ". Perimter: " + calcPer(a, b);
	}



}
