import java.util.*;

public class BadSubscriptCaught{
	public static void main(String[] args){
		int choice = 0;
		String[] fNames = { "Robert", "Jaime", "James", "Heather", "Michael", "Chris", "Stewart", "Joey" };
		Scanner inputDevice = new Scanner(System.in);
		
		System.out.print("enter 1 to 8 to display a first name: ");
		try{
			choice = inputDevice.nextInt();
			System.out.println(fNames[choice - 1]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Entered improper value");
		}
	}
}