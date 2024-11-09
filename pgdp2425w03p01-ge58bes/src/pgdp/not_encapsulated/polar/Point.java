package pgdp.not_encapsulated.polar;

import pgdp.MathHelpers;

public class Point {

    public double radius;
    public double angle;

    // TODO: Implementiere alle Methoden der Klasse Point gegeben der neuen Repräsentation als Polarkoordinaten.
    //       Achte beim Implementieren des Konstruktors darauf, dass die Parameter nach wie vor als kartesische
    //       Koordinaten interpretiert werden müssen, um konsistent mit der "alten Version" zu sein.

    public Point(double x, double y) {
        this.radius = MathHelpers.xyToRadius(x,y);
        this.angle = MathHelpers.xyToAngle(x,y);
    }

    public double distanceToOrigin() {
        return radius;
    }

    public double distanceTo(Point other) {
        double distance = Math.sqrt(Math.pow(radius,2) + Math.pow(other.radius,2) - 2 * radius * other.radius * Math.cos(angle-other.angle));
        return distance;
    }
  
  	public double getX() {
      	return MathHelpers.angleRadiusToX(angle,radius);
    }

  	public double getY() {
      	return MathHelpers.angleRadiusToY(angle,radius);
    }
  
}
