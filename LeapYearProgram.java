/* Li Huang
 * per.1
 * 11/1/2017
 * 5.4 Return Values
 * Leap Year Program
 */

import java.util.Scanner;
public class LeapYearProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter a year (YYYY): ");
		System.out.println(isLeapYear(in.nextInt()));
		
	}
	
	public static boolean isLeapYear(int year){
		if(year%4==0&&year%100!=0)return true;
		if(year%400==0)return true;
		return false;
	}

}
