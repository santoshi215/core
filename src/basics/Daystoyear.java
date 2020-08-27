package basics;

import java.util.Scanner;

public class Daystoyear {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int days,years,weeks,day;
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		
		
		System.out.println("enter the no of days:");
		days=sc.nextInt();
		
		years=days/365;
		weeks=((days%365)/7);
		day=((days%365)%7);
		
		System.out.println("year:"+years);
		System.out.println("weeks:"+weeks);
		System.out.println("day:"+day);
		
		
		
	}

}
