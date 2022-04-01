package edu.wpi.teamname;

public class Circle implements IRectangle {

  double radius;

  public Circle(double r) {
    radius = r;
  }

  @Override
  public double getPerimeter() {
    return 2*Math.PI*radius;
  }

  @Override
  public double getArea() {
    return Math.PI*radius*radius;
  }
}
