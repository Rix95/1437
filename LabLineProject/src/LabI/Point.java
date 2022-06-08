package LabI;

public class Point {
	private double xCoordinate;
	private double yCoordinate; 
	
	public Point(double xCoordinate, double yCoordinate) {
		this.xCoordinate = xCoordinate;
		this.yCoordinate = yCoordinate;
	}
	
	public Point() {
		this(0, 0);
	}
	
	public void setXCoordinate(double xCoordinate) {
		this.xCoordinate = xCoordinate; 
	}
	
	public void setYCoordinate(double YCoordinate) {
		this.yCoordinate = YCoordinate; 
	}
	
	public double getXCoordinate() {
		return xCoordinate; 
	}
	
	public double getYCoordinate() {
		return yCoordinate; 
	}
	
}

