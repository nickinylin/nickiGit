package uge4;

import java.text.NumberFormat;


public class Dato {

	private int year;
	private int month;
	private int day;

	public Dato(int year, int month, int day) {	
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public String danish() {
		return day+ "/"+month+"-"+year;

	}
	public String danishText() {

		String monthString;
		switch (month) {
		case 1:  monthString = "Januar";      	break;
		case 2:  monthString = "Februar";      	break;
		case 3:  monthString = "Marts";         break;
		case 4:  monthString = "April";         break;
		case 5:  monthString = "Maj";           break;
		case 6:  monthString = "Juni";          break;
		case 7:  monthString = "Juli";          break;
		case 8:  monthString = "August";        break;
		case 9:  monthString = "September";     break;
		case 10: monthString = "Oktober";       break;
		case 11: monthString = "November";      break;
		case 12: monthString = "December";      break;
		default: monthString = "Invalid month"; break;
		}

		return  day+ ". "+monthString+" "+year;
	}

	public String iso() {

		// Get a default NumberFormat instance.
		NumberFormat nummerTil2Digits = NumberFormat.getInstance();

		// Set the minimum integer digits to 10.
		nummerTil2Digits.setMinimumIntegerDigits(2);


		/**Returnerer rent faktisk en double, men da der kun er 2 digits, så returnerer den ikke
		 * det efter kommaet.
		 */

		return year+"-"+ nummerTil2Digits.format(month) +"-"+ nummerTil2Digits.format(day);
	}

}

//}
