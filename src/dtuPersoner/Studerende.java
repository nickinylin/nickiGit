package dtuPersoner;

public class Studerende extends Person {

	protected String studienummer;

	public Studerende(String navn, String studienummer) {
		super(navn);
		this.studienummer = studienummer;
		
	}
	@Override
	public String toString() {
		return "class Studerende\n\t[navn="+getNavn()+"]" + "\n\t[studienummer="+studienummer+"]";
//		return "Studerende [studienummer=" + studienummer + "]";
	}

	public String getStudienummer() {
		return studienummer;
	}

	public void setStudienummer(String studienummer) {
		this.studienummer = studienummer;
	}
	

}
