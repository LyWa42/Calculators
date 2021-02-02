import java.util.Scanner;

public class ChangeCalculator {
	public static void main (String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a dollar amount:");
		double total=input.nextDouble();
		String newLine=System.getProperty("line.separator");
		//Calculate the number of Dollars
		int remainingamount=(int)(total*100);
		int dollars=remainingamount/100;
		remainingamount=remainingamount%100;
		int quarters=remainingamount/25;
		remainingamount=remainingamount%25;
		int dimes=remainingamount/10;
		remainingamount=remainingamount%10;
		int nickles=remainingamount/5;
		remainingamount=remainingamount%5;
		int pennies=remainingamount;
	System.out.println("You have: " + dollars +" Dollars \n"+ quarters +" Quarters \n"+ dimes 
				+" Dimes \n"+ nickles+ " Nickles and\n"+ pennies +" Pennies.");

}
}