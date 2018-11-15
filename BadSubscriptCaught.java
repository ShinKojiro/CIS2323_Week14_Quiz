import java.util.*;

public class BadSubscriptCaught{
	public static void main(String[] args){
		int choice = 0;
		String[] fNames = { "Robert", "Jaime", "James", "Heather", "Michael", "Chris", "Stewart", "Joey" };
		Scanner inputDevice = new Scanner(System.in);
		
		System.out.println("List of names in the array:");
		for(int i = 0; i < fNames.length; i++){
			System.out.println((i + 1) + ") " + fNames[i]);
		}
		
		System.out.print("\nEnter 1 to 8 to display a name: ");
		try{
			choice = inputDevice.nextInt();
			System.out.println(fNames[choice - 1]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Entered improper value.");
		}
		catch(InputMismatchException e){
			System.out.println("That is not a number.");
		}
	}
}