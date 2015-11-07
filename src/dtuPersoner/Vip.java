package dtuPersoner;

import java.util.Arrays;

public class Vip extends Ansat {
	
	String[] kurser = new String[3];
	
	
	public Vip(String navn, String institutnavn, String[] kurser) {
		super(navn, institutnavn);
		this.kurser = kurser;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "class Vip\n\t[navn="+getNavn()+"]" + "\n\t[institutnavn="+getInstitutnavn()+"]" + "\n\t[kursus="+kurser[0]+"]"+ "\n\t[kursus="+kurser[1]+"]"+ "\n\t[kursus="+kurser[2]+"]";
	}
	public String[] getKurser() {
		return kurser;
	}
	public void setKurser(String[] kurser) {
		this.kurser = kurser;
	}


	
	

}
