package dtuPersoner;

public class Tap extends Ansat {

	private int arbejdstid;

	public Tap(String navn, String institutnavn, int arbejdstid) {
		super(navn, institutnavn);
		this.arbejdstid = arbejdstid;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "class Tap\n\t[navn="+getNavn()+"]" + "\n\t[institutnavn="+getInstitutnavn()+"]" + "\n\t[arbejdstid="+arbejdstid+"]";
//		return "Tap [arbejdstid=" + arbejdstid + "]";
	}

	
}
