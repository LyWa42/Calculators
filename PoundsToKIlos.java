import java.util.Scanner;

public class PoundsToKIlos {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter a weight in pounds.");
		double pounds=input.nextDouble();
		final double conversion= 0.454;
		double kilos=pounds*conversion;
		System.out.println(pounds + " pounds is " + kilos +" kilograms.");
	}
}

