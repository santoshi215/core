package basics;

import java.util.Scanner;

public class Profit {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		float profit,loss,cp,sp;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter selling price:");
		sp=sc.nextFloat();
		System.out.println("enter cost price:");
		cp=sc.nextFloat();
		
		profit=sp-cp;
		float $profit=(100*profit)/cp;
		loss=cp-sp;
		float $loss=(100*loss)/cp;
		if($profit>$loss)
		{
		System.out.println("profit percentage is:"+$profit);
		}
		else
		{
		System.out.println("loss percentage is:"+$loss);
		}
	}

}
