package dtuPersoner;

public class Person {

protected String navn;
	
	public Person(String navn) {
		this.navn = navn;
	}
	
	@Override
	public String toString() {
		return "class Person\n\t[navn="+getNavn()+"]";
//		return "Person [navn=" + navn + "]";Tap\n\t
	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	
	
	
	
//	public static void main(String[] args) {
//		
//		
//	}

}
