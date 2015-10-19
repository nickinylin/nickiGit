package Uge03;

import java.util.Scanner;

public class ASCIItabel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		while (true){
			
			String input = scanner.next();
			
			if(input.equals("exit")){
				break;
			}
			
			char tegn = input.charAt(0);
			
			if (tegn >= 'A' && tegn <= 'Z') {
				System.out.println("Tegnet er et stort bogstav");
			}else if (tegn >= 'a' && tegn <= 'z') {
				System.out.println("Tegnet er et lille bogstav");
			}else if (tegn >= '0' && tegn <= '9') {
				System.out.println("Tegnet er et tal");
			}else if ((tegn == '#')||(tegn == '!')||(tegn == '+')||(tegn == '\\')) {
				System.out.println("Tegnet er et af de 4 specialtegn");	
			}else{
				System.out.println("Tegnet er ikke kendt af dette program");
			}

		}
		
		scanner.close();
	}

}
