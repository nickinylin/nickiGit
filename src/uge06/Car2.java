package uge06;

public class Car2 {

	private String brand;
	private String licenseplate;
	private String color;
	
	
	
	private static int counter = 0;

	private int instanceCounter = 0;
	
	public Car2(String mærke, String nummerplade, String farve){
		
		/** For at hvert nyt objekt får et induviduelt nr, skal den også have en instanceCounter
		 * og counter er den som hele tiden tæller op!
		 */
		
		counter++;
		instanceCounter = counter;
		this.brand = mærke;
		this.licenseplate = nummerplade;
		this.color = farve;
		

	}
	
	//her bliver det pågældende nr for hvert objert returneret.
	public int getRegno(){
		
		return instanceCounter;
	}
	
	// counter er den som hele tiden tæller op, og giver her bare det næste nr i rækken
	public static int getNextRegno(){
		int nextCounter = counter; 
		return ++nextCounter;
		
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "["+licenseplate+"] "+color+" "+brand;
	}
	public boolean equals(Car2 otherCar) {
		if (this == otherCar)
			return true;
		if (otherCar == null)
			return false;
		if (getClass() != otherCar.getClass())
			return false;
		Car2 other = (Car2) otherCar;
		if (licenseplate == null) {
			if (other.licenseplate != null)
				return false;
		} else if (!licenseplate.equals(other.licenseplate))
			return false;
		return true;
	}


	public boolean alike(Car2 otherCar) {
		if (this == otherCar)
			return true;
		if (otherCar == null)
			return false;
		if (getClass() != otherCar.getClass())
			return false;
		Car2 other = (Car2) otherCar;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		return true;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getLicenseplate() {
		return licenseplate;
	}
	public void setLicenseplate(String licenseplate) {
		this.licenseplate = licenseplate;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}	

}
