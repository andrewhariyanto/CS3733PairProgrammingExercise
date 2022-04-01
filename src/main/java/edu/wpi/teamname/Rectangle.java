package edu.wpi.teamname;

public class Rectangle implements IRectangle{

    double length;
    double width;

    public Rectangle(double l, double w){
        length = l;
        width = w;
    }

    @Override
    public double getPerimeter() {
        return 2*length + 2*width;
    }

    @Override
    public double getArea() {
        return length*width;
    }
}
