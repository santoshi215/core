package basics;

public class Patt16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row,col;
		for(row=1;row<=9;row++)
		{
			for(col=1;col<=row;col++)
			{
				System.out.print(" * ");
			}
			row++;
			System.out.println();
		}
		for(row=7;row<=7;row--)
		{
			for(col=1;col<=row;col++)
			{
				System.out.print(" * ");
			}
			row--;
			System.out.println();
		}
		
		
		
	}

}
