package Uge03;

import java.util.Scanner;

public class Pyramider {
	public static String repeat(String str, int times){
		return new String(new char[times]).replace("\0", str);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int input = scan.nextInt();
// Den første pyramide skal starte med 1, så et # starter med at tælle fra 1.
		int count = 1;

		while (count <= input){
			//Skriver pyramide + nr pyramide vi er nået til
			System.out.println("Pyramid "+ count); 

			//Variabel til at tælle pyramiderne.
			int pyramid = 1;
			
			//Så længe værdien af pyramid er mindre eller lig count, så køres dette:
			while (count >= pyramid){
				
				//Repeat bruges til: først skrive en String, derefter skrive en
				//Int det antal gange som man har sat værdien til.
				//Her skriver den det første "."
				System.out.print(repeat(".", count-pyramid));
				
				//For hver pyramide, skal der sættes sættes 2 ekstra # på næste linje.
				System.out.print(repeat("#", pyramid + pyramid - 1));
				
				//Her skrives "." efter # på linjerne.
				System.out.println(repeat(".", count-pyramid));
				//Tæller værdien af pyramid 1 op
				pyramid++;
			}
			//Her skifter den til næste linje. PrintLn laver sin egen linje.
			System.out.println("");
			
			//Tæller count op med 1.
			count++;


		}
		scan.close();
	}

}
