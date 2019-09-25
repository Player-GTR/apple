import java.util.Scanner;

public class InputScanner{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please input the age of your sister:");
		int age = scan.nextInt();
		
		int nickname = age / 18;
		
		
		switch(nickname){
			case 0:
			     System.out.println("you are young");
				 break;
				 
			case 1:
			     System.out.println("you are old");
				 break;
				 
			default:
			     System.out.println("Please try again");
		}
	}
}