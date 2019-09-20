package edu.gcccd.csis;

public class Rectangle {
    private double width;
    private double height;
    private static long numOfRectangles = 0;
    public Rectangle() {

        height = 10;
        width = 20;
        numOfRectangles++;
    }

    public Rectangle(double w, double h) {
        width = w;
        height = h;
        numOfRectangles = numOfRectangles +1;
    }

   public double getArea(){
        return height*width;

    }
    public double getCircumference(){
        return (height+width)*2;
}
    public boolean isSquare(){
        if (width == height)
        return true;
        else
            return  false;
    }
}

