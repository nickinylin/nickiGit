package Uge02;

import java.util.Scanner;

public class Andengradsligning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		double A = scanner.nextDouble();
		double B = scanner.nextDouble();
		double C = scanner.nextDouble();

		if (A == 0){
			if (B == 0)
				System.out.println("Ingen rødder");
			else System.out.println(-C/B);

		} else { 
			double D = Math.pow(B, 2)-4*A*C;

//			System.out.println(D);

			if (D>0) {
				double rødder1 = (-B + Math.sqrt(D))/(2*A);
				double rødder2 = (-B - Math.sqrt(D))/(2*A);
				System.out.println(rødder1+ " "+rødder2);
				//			System.out.println("To reelle rødder: "+rødder1+ " og "+rødder2);
			} else if (D==0) {
				double enkeltrod = (-B/(2*A));
				System.out.println(enkeltrod);
				//			System.out.println("1 reel rod: "+enkeltrod);
			} else if (D<0) {
				System.out.println("Ingen rødder");
				//			double ikkereellerødder1 = (-B + Math.sqrt(D))/(2*A);
				//			double ikkereellerødder2 = (-B - Math.sqrt(D))/(2*A);
				//			System.out.println("To reelle rødder: "+ikkereellerødder1+ " og "+ikkereellerødder2);
			}
		}
		scanner.close();





		//	Skriv et program som finder eventuelle reelle rødder
		//i 2. gradsligningen Ax²+Bx+C=0.

		//	Input: 
		//	a b c" 
		//	Output: 
		//	rod1 rod2 (den største rod først),
		// rod eller 
		//	"Ingen rødder"
		//	Hint: Husk at tage højde for at A, B og C kan være nul. Dvs. at for
		//eksempel for A=0 skal løsningen udskrives.
	}

}
