package LabI;


public class Line {
	private Point startPoint;
	private Point endPoint;
	
	public Line(Point startPoint, Point endPoint) {
	this.startPoint = new Point(startPoint.getXCoordinate(), startPoint.getYCoordinate());
	this.endPoint = new Point(endPoint.getXCoordinate(), endPoint.getYCoordinate()) ;
	}
	
	public void setStartPoint(Point startPoint) {
		this.startPoint = new Point(startPoint.getXCoordinate(), startPoint.getYCoordinate());
	}
	
	public void setEndPoint(Point endPoint) {
		this.startPoint = new Point(endPoint.getXCoordinate(), endPoint.getYCoordinate());
	}
	
	public Point getStartPoint() {
		return new Point(startPoint.getXCoordinate(), startPoint.getYCoordinate());
	}
	//check for deep copy
	public Point getEndPoint() {
		return new Point(endPoint.getXCoordinate(), endPoint.getYCoordinate());
	}
	
	public double getLength () {
		return Math.sqrt(Math.pow(endPoint.getXCoordinate() - startPoint.getXCoordinate(), 2) + Math.pow(endPoint.getYCoordinate() - startPoint.getYCoordinate(), 2));
	}
	
}
