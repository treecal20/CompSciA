package test;

public class Example {

	public static void main(String[] args) {
		for(int i=1; i<=60; i++){
				if(i%10==0) {
					System.out.print("|");
					} else {
					System.out.print(" ");
					}
		}
		System.out.println();
		for(int i=1; i<=60; i++) {
			System.out.print(i%10);
		}
	}
}
