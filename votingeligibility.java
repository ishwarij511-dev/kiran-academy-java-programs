package programs;
import java.util.Scanner;

public class votingeligibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

		 System.out.print("Enter your age: ");
		  int age = sc.nextInt();

		  if (age < 0)
		  {
		     System.out.println("Invalid Age");
		   }
		  else if (age >= 18) 
		  {
		      System.out.println("Valid Age");
		      System.out.println("You are eligible for voting.");
		   }
		  else
		  {
		      System.out.println("Valid Age");
		      System.out.println("You are not eligible for voting.");
		   }

		     sc.close();
		   }
		}


