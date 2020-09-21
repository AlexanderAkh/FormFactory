package ua.itea.lesson9HomeWork;

import java.util.Arrays;
import java.util.Scanner;



public class Agr {
	protected Object[] rectArr = new Object[3];
	protected Object[] triangArr = new Object[3];
	protected Object[] circArr = new Object[3];
	int counter = 0;
	int triangCounter = 0;
	int circCounter = 0;
	public void userIn() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int id = 0;
		if (scanner.hasNextInt()) {
			do {
				id = scanner.nextInt();
				setId(id);
			} while (id != 0);

		} else {
			System.out.println("Numbers only!");
			scanner.next();
			getText();
			userIn();
		}
	}
	
	public void setId(int id) {
		Rect rct = new Rect();
		Triang triang = new Triang();
		Circ circ = new Circ();

		if (id == rct.getId()) {
			if (rectArr[2] != null) {
				System.out.println("End of array, please choose another figure");
			} else {
				rct.userInputInfo();
				System.out.println("Input " + (counter + 1) + " of " + rectArr.length);
				setRectArr();
				System.out.println(rectArr[counter]);
				counter++;
				if (counter == 3) {
					System.out.println(Arrays.toString(rectArr));
				}
				rct.userOutputInfo();
			}
		} else if (id == triang.getId()) {
			if (triangArr[2] != null) {
				System.out.println("End of array, please choose another figure");
			} else {
				triang.userInputInfo();
				System.out.println("Input " + (triangCounter + 1) + " of " + triangArr.length);
				setTriangArr();
				System.out.println(triangArr[triangCounter]);
				triangCounter++;
				if (triangCounter == 3) {
					System.out.println("-------------------------" + "\n" +"Final");
					for (int i = 0; i < triangArr.length; i++) {
						System.out.println(triangArr[i]);	
					}
				}
				triang.userOutputInfo();

			}
		}else if (id == circ.getId()) {
			
			if (circArr[2] != null) {
				System.out.println("End of array, please choose another figure");
			} else {
				circ.userInputInfo();
				System.out.println("Input " + (circCounter + 1) + " of " + circArr.length);
				setCircArr();
				System.out.println(circArr[circCounter]);
				circCounter++;
				if (circCounter == 3) {
					System.out.println("-------------------------" + "\n" +"Final");
					for (int i = 0; i < circArr.length; i++) {
						System.out.println(circArr[i]);	
					}
				}
				triang.userOutputInfo();

			}
		} else if (id == 0) {
			System.out.println("exit");
		}
	}
	
	public void getText() {
		System.out.println("Press 1 for rectangle" +
						   "\n" + "Press 2 for triangle" + 
						   "\n" + "Press 3 for circle" + 
						   "\n"+ "Press 0 to exit");
	}

	public void setRectArr() {
		Rect rct = new Rect();
		for (int i = 0; i < rectArr.length; i++) {
			if (rectArr[i] == null) {
				rectArr[i] = rct.setRect();
				break;
			}
		}
	}
	
	public void setTriangArr() {
		Triang triang = new Triang();
		for (int i = 0; i < triangArr.length; i++) {
			if (triangArr[i] == null) {
				triangArr[i] = triang.setTriang();
				break;
			}
		}
	}
	
	public void setCircArr() {
		Circ circ = new Circ();;
		for (int i = 0; i < circArr.length; i++) {
			if (circArr[i] == null) {
				circArr[i] = circ.setCirc();
				break;
			}
		}
	}
}
