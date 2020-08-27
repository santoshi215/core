package basics;

import java.util.Scanner;

public class Alphabet {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
           
           Scanner sc=new Scanner(System.in);
           
           
           System.out.println("enter the alphabet:");
           char ch=sc.next().charAt(0);
       
           
          if(ch=='a' || ch=='e'||ch=='i'||ch=='o'||ch=='u')
          {
        	  System.out.println("The entered alphabet is:vowel");
          }
          else
          {
      	  System.out.println("The entered alphabet is consonent");
          }

}
}