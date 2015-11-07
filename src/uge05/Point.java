package uge05;

public class Point {

	private int x;
	private int y;


	public Point(int x, int y) {
		this.x = x;
		this.y = y;

	}
	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}
	//Denne metode er oprettet automatik ved equals() i source
	public boolean equals(Point obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

	//For at flytte koordinaterne skal dx og dy + med x eller y
	public void move(int dx, int dy){
		this.x += dx;
		this.y += dy;
	}

}
