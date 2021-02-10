import java.util.Scanner;
public class FeetToMeters {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Please enter a distance in feet: ");
		double feet=s.nextDouble();
		final double conversionRate=0.305;
		double meters=feet*conversionRate;
		System.out.print(feet+ " feet is " + meters + " meters.");
			}
}
