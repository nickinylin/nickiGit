package uge4;

import java.util.Scanner;

public class gætNavn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);


		//		System.out.println(input);



		while (true){

			String input = scanner.nextLine();

			if (input.equals("Nicki")){
				System.out.println("Du gættede rigtigt.");
				break;
			}

			
			char tegn = input.charAt(0);

			if (tegn >= 'A' && tegn <= 'M' || tegn >= 'a' && tegn <= 'm'){
				System.out.println("Mit navn er efter i alfabetet.");

			}else if (tegn >= 'O' && tegn <= 'Z' || tegn >= 'o' && tegn <= 'z'){
				System.out.println("Mit navn er før i alfabetet.");

			}else if (tegn == 'N' || tegn == 'n'){
				System.out.println("Du er på det rigtige bogstav");

			}else{
				System.out.println("Tegnet er ikke kendt af dette program");
			} 
		}scanner.close();
	}
}


