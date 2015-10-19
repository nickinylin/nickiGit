package Uge03;

import java.util.Scanner;

public class Datoer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Indtast år:");
		int scanyear = scanner.nextInt();
		System.out.println("Indtast måned:");
		int scanmonth = scanner.nextInt();
		System.out.println("Indtast dag:");
		int scanday = scanner.nextInt();
		scanner.close();

		int indtastetår = scanyear;
		int indtastetmåned = scanmonth;
		int indtastetdag = scanday;
		



		while (true){
			if (scanyear<0 || scanmonth<1 || scanmonth>12){
				System.out.println("Ugyldig dato");
				break;
			}

			if(scanmonth == 1 || scanmonth == 3 || scanmonth == 5 || scanmonth == 7 || scanmonth == 8 || scanmonth == 10 || scanmonth == 12 ){
				int daysinmonth = 31;
				if (scanday > daysinmonth){
					System.out.println("Ugyldig dato");
					break;
				}

				//Hvis det er den 12 måned og den sidste dag i måneden, tæller den et år op
				if (scanmonth == 12 && daysinmonth == scanday){
					scanyear++;
					scanmonth = 1;
					scanday = 1;
				}
				else if (daysinmonth == scanday){
					scanmonth++;
					scanday = 1;
				} else if (scanday<daysinmonth){
					scanday++;
				}

			} else if (scanmonth == 4 || scanmonth == 6 || scanmonth == 9 || scanmonth == 11){
				int daysinmonth = 30;
				if (scanday > daysinmonth){
					System.out.println("Ugyldig dato");
					break;
				}

				if (daysinmonth == scanday){
					scanmonth++;
					scanday = 1;
				} else if (scanday<daysinmonth){
					scanday++;
				}

			} else if (scanmonth == 2){
				int leapyear = scanyear%400;

				if (leapyear == 0){
					int daysinmonth = 29;
					if (scanday > daysinmonth){
						System.out.println("Ugyldig dato");
						break;
					}
					if (daysinmonth == scanday){
						scanmonth++;
						scanday = 1;
					}else if (daysinmonth>scanday){
						scanday++;
					}

				}else if(leapyear>0){
					leapyear = scanyear%100;

					if (leapyear == 0){
						int daysinmonth = 28;
						if (scanday > daysinmonth){
							System.out.println("Ugyldig dato");
							break;
						}
						if (daysinmonth == scanday){
							scanmonth++;
							scanday = 1;
						}else if (daysinmonth>scanday){
							scanday++;
						}

					}else if (leapyear > 0){
						leapyear = scanyear%4;

						if (leapyear == 0){
							int daysinmonth = 29;
							if (scanday > daysinmonth){
								System.out.println("Ugyldig dato");
								break;
							}
							if (daysinmonth == scanday){
								scanmonth++;
								scanday = 1;
							}else if (daysinmonth>scanday){
								scanday++;
							}
						} else if (leapyear>0){
							int daysinmonth = 28;
							if (scanday > daysinmonth){
								System.out.println("Ugyldig dato");
								break;
							}
							if (daysinmonth == scanday){
								scanmonth++;
								scanday = 1;
							}else if (daysinmonth>scanday){
								scanday++;
							}
						}


					}

				}
			}
			System.out.println("Dagen efter "+indtastetdag+"/"+indtastetmåned+" "+indtastetår+" er "+scanday+ "/"+ scanmonth +" "+ scanyear);
			break;
		}
	}
}
