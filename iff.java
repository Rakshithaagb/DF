import java.util.Scanner;
class iff
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Input sem:");
		int sem=in.nextInt();
		if (sem==1)
			System.out.println("You are 1st sem");
		else if (sem==2)
			System.out.println("You are 2nd sem");
		else if (sem==3)
			System.out.println("You are 3rd sem");
		else if (sem==4)
			System.out.println("You are 4th sem");
		else if (sem==5)
			System.out.println("You are5th sem");
		else if (sem==6)
			System.out.println("You are 6th sem");
		else 
			System.out.println("Invalid input!");
	}
}