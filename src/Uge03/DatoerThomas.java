package Uge03;

import java.util.Scanner;

public class DatoerThomas {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int scanyear = 2000;
		int scanmonth = 2;
		int scanday = 29;
		
		while (true) {
		if (scanyear < 0 || scanmonth > 12 || scanmonth < 0 || scanday <= 0) {
			System.out.println("Ugyldig dato");
			break;
		}
		
			
		if (scanmonth == 1 || scanmonth == 3 || scanmonth == 5 || scanmonth == 7 || scanmonth == 8 || scanmonth == 10 || scanmonth == 12) {
			int daysinmonth = 31;
			
			if (scanday > daysinmonth) {
				System.out.println("Ugyldig dato");	
				break;
			}
			
			if (scanmonth == 12 && daysinmonth == scanday) {
				scanday = 1;
				scanmonth = 1;
				scanyear++;
			} else if (daysinmonth == scanday) {
				scanday = 1;
				scanmonth++;
			} else if (daysinmonth > scanday) {
				scanday++;
			}

			
		} else if (scanmonth == 4 || scanmonth == 6 || scanmonth == 9 || scanmonth == 11) {
			int daysinmonth = 30;
			
			if (scanday > daysinmonth) {
				System.out.println("Ugyldig dato");	
				break;
			}
			
			if (daysinmonth == scanday) {
				scanday = 1;
				scanmonth++;
			} else if (daysinmonth > scanday) {
				scanday++;
			}
			
		} else if (scanmonth == 2) {		
			int leapyear = scanyear%4;

			if (leapyear == 0) {
				int daysinmonth = 29;
				
				if (scanday > daysinmonth) {
					System.out.println("Ugyldig dato");	
					break;
				}
				
				if (daysinmonth == scanday) {
					scanmonth++;
					scanday = 1;
				} else if (daysinmonth > scanday){
					scanday++;
				}
				
			} else if (leapyear > 0) {
				leapyear = scanyear%100;
				
				if (leapyear == 0) {
					int daysinmonth = 28;
					
					if (scanday > daysinmonth) {
						System.out.println("Ugyldig dato");	
						break;
					}
					
					if (daysinmonth == scanday) {
						scanmonth++;
						scanday = 1;
					} else if (daysinmonth > scanday){
						scanday++;
					}
				} else if (leapyear > 0) {
				leapyear = scanyear%400;
				
				if (leapyear == 0) {
					int daysinmonth = 29;
					
					if (scanday > daysinmonth) {
						System.out.println("Ugyldig dato");	
						break;
					}
					
					if (daysinmonth == scanday) {
						scanmonth++;
						scanday = 1;
					} else if (daysinmonth > scanday){
						scanday++;
					}
				} else {
					int daysinmonth = 28;
					
					if (scanday > daysinmonth) {
						System.out.println("Ugyldig dato");	
						break;
					}
					
					if (daysinmonth == scanday) {
						scanmonth++;
						scanday = 1;
					} else if (daysinmonth > scanday){
						scanday++;
					}
				}
			}
		}


		System.out.println("dag: " +scanday+ " month: " +scanmonth+ "year: " +scanyear);
		break;
		}
		

	}
}
}