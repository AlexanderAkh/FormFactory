package ua.itea.lesson9HomeWork;

public class Col {

	private String setColor() {
		String[] color = { "Red", "Blue", "Green", "Purple" , "Orange", 
							"Yellow", "White", "Brown", "Grey", "Pink"};
		int rnd = (int) (Math.random() * 10);
		String col = color[rnd];
		return col;
		

	}

	public String getColor() {
		return setColor();
	}
}
