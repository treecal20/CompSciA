package tempConvert;

import java.util.Scanner;

public class Convert {
	static String input;
	static Scanner scanInput = new Scanner(System.in);
	
	public static void main(String[] args) {
		start();
	}
	
	public static void start() {
		System.out.println("Calculation?");
		input = scanInput.nextLine();
		if(input.contentEquals("C") || input.contentEquals("c")) {
			System.out.println("Amount?");
			input = scanInput.nextLine();
			celcToFahr(input);
		} else if(input.contentEquals("F") || input.contentEquals("f")) {
			System.out.println("Amount?");
			input = scanInput.nextLine();
			fahrToCelc(input);
		} else if(input.contentEquals("Stop") || input.contentEquals("stop")) {
			return;
		}
		start();
	}
	
	public static void celcToFahr(String input) {
		double temp;
		try {
			temp = Double.parseDouble(input);
		} catch (NumberFormatException e) {
			System.out.println("That's not a number!");
			return;
		}
		temp = temp * (9.0/5.0) + 32.0;
		System.out.println(temp + " F");
	}
	
	public static void fahrToCelc(String input) {
		double temp;
		try {
			temp = Double.parseDouble(input);
		} catch (NumberFormatException e) {
			System.out.println("That's not a number!");
			return;
		}
		temp = (temp - 32) * (5.0/9.0);
		System.out.println(temp + " C");
	}
}
