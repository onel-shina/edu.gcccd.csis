package edu.gcccd.csis;

public class Circle{
    private double radius;
    private String color;
    private static long numOfCircles = 0;
    public Circle(String c) {
        radius = 1.0;
        color = c;
        numOfCircles = numOfCircles + 1;
    }
    public Circle(double r, String c) {
        radius = r;
        color = c;
        numOfCircles = numOfCircles + 1;
    }
    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public double getCircumference(){
        return radius*2*Math.PI;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String c) {
        color = c;
    }
}