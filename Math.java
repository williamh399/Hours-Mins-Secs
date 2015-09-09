import java.util.Scanner;
import java.lang.Math;

public class Main {
	public static void main(String[] args) {
		

		int totalSecs, secs, mins, hours;
			
		Scanner scnr = new Scanner(System.in);
		System.out.print("Enter your number of seconds: ");
		totalSecs = scnr.nextInt();
		secs = totalSecs % 60;
		mins = totalSecs / 60;
		hours = mins / 60;
		mins = mins % 60;
		System.out.print("Hours: " + hours + " Minutes: " + mins + " Seconds: " + secs);
	}
}
