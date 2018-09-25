package fracCalc;

import java.util.Scanner;

public class CalcDeFrac {
	static String input;
	static Scanner scanInput = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Calculation?");
		input = scanInput.nextLine();
		decode(input);
	}
	
	public static void decode(String input) {
		double[] temp = new double[input.length()];
		for(int i=0; i < input.length(); i++) {
			try {
				temp[i] = Double.parseDouble(input);
			} catch (NumberFormatException e) {
			}
		}
	}
}
