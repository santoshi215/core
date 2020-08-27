package basics;

import java.util.Scanner;

public class Ctriangle {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int side,P; 
		double result;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the side distance:");
		side=sc.nextInt();
		
		result = (1.73*side*side)/4;
		P=3*side;
		
		System.out.println("AREA of equilateral triangle is:"+result);
	    System.out.println("perimeter of equilateral triangle is:"+P);
	    
		
		
		
		

	}

}
