package uge05;

public class Car {

	private String brand;
	private String licenseplate;
	private String color;

	public Car(String mærke, String nummerplade, String farve){
		this.brand = mærke;
		this.licenseplate = nummerplade;
		this.color = farve;

	}
	@Override
	public String toString() {
		return "["+licenseplate+"] "+color+" "+brand;
	}
	public boolean equals(Car otherCar) {
		if (this == otherCar)
			return true;
		if (otherCar == null)
			return false;
		if (getClass() != otherCar.getClass())
			return false;
		Car other = (Car) otherCar;
		if (licenseplate == null) {
			if (other.licenseplate != null)
				return false;
		} else if (!licenseplate.equals(other.licenseplate))
			return false;
		return true;
	}


	public boolean alike(Car otherCar) {
		if (this == otherCar)
			return true;
		if (otherCar == null)
			return false;
		if (getClass() != otherCar.getClass())
			return false;
		Car other = (Car) otherCar;
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
