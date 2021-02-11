/*
(Physics: finding runway length) Given an airplane’s acceleration a and take-off
speed v, you can compute the minimum runway length needed for an airplane to
take off using the following formula:
												v^2
									length = ---
												 2a
Write a program that prompts the user to enter v in meters/second (m/s) and the
acceleration a in meters/second squared (m/s2), and displays the minimum runway
length.
*/

import java.util.Scanner;
public class RunwayCalculator {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter take-off speed (m/s): ");
		double speed = input.nextDouble();
		System.out.println("Please enter acceleration (m/s^2): ");
		double acceleration = input.nextDouble();
		double length = (Math.pow(speed, 2))/(2*acceleration);
		System.out.println("The minimum runway length is " + length + " meters.");
	}
}
