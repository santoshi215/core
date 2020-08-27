package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Uppercase {


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		char ch;
			BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("enter an aphabet:");
			ch=(char)bf.read();
		
			if(ch>=65 &&ch<=96)
			{
				System.out.println("entered alphabet is upper case letter");
			}
			else if(ch>=97 && ch<=123)
			{
				System.out.println("entered alphabet is lower case letter");
	}
			else
			{
				System.out.println("entered  number");
			}
}
}