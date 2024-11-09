package pgdp.encapsulated.polar;

import pgdp.MathHelpers;

public class Point {

    private double radius;
    private double angle;

    // TODO: Implementiere alle Methoden der Klasse Point gegeben der neuen Repräsentation als Polarkoordinaten.
    //       Achte beim Implementieren des Konstruktors darauf, dass die Parameter nach wie vor als kartesische
    //       Koordinaten interpretiert werden müssen, um konsistent mit der "alten Version" zu sein.

    public Point(double x, double y) {
        this.radius = MathHelpers.xyToRadius(x,y);
        this.angle = MathHelpers.xyToAngle(x,y);
    }

    public double getX() {
        return MathHelpers.angleRadiusToX(angle, radius);
    }

    public double getY() {
        return MathHelpers.angleRadiusToY(angle, radius);
    }

    public void setX(double x) {
        this.angle = MathHelpers.xyToAngle(x, getY());
        this.radius = MathHelpers.xyToRadius(x,getY());
    }

    public void setY(double y) {
        this.angle = MathHelpers.xyToAngle(getX(), y);
        this.radius = MathHelpers.xyToRadius(getX(), y);
    }
  
  	public double getAngle() {
      	return angle;
    }
  
  	public double getRadius() {
      	return radius;
    }

    public double distanceToOrigin() {
        return radius;
    }

    public double distanceTo(Point other) {
        double distance = Math.sqrt(Math.pow(radius,2) + Math.pow(other.getRadius(),2) - 2 * radius * other.getRadius() * Math.cos(angle-other.getAngle()));
        return distance;
    }

}
