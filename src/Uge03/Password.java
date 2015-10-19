package Uge03;
import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		
		while (true){
		String password = scanner.nextLine();
		int length = password.length();
		if (length <= 4) {
			System.out.println("Password for kort");
		} else if (length > 4 && length < 9) {
		System.out.println("Password tilpas");
		break;
		} else if (length >= 9) {
			System.out.println("Password for langt");
		}

		}
		scanner.close();
	}

}
