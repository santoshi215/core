package basics;

import java.util.Scanner;

public class Acircle {

	@SuppressWarnings("resource" )
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rad;
		double pi,p,a;
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("enter pi value:");
		pi=sc.nextDouble();
		
		System.out.println("enter rad value:");
		rad=sc.nextInt();
		
		a=pi*rad*rad;
		p=2*pi*rad;
		
		System.out.println("area of circle is:"+a);
		System.out.println("area of perimeter is:"+p);
		
		
		

	}

}
