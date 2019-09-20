package edu.gcccd.csis;

public class Container {
    private Rectangle rectangle;
    private Circle circle;

    public void setRectangle(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    public Rectangle getRectangle(){
        return rectangle;
    }
    public void setCircle(Circle circle){
        this.circle = circle;
    }
    public Circle getCircle(){
        return  circle;
    }

    public int size() {
        if(this.rectangle == null && this.circle==null)
        return 0;
        else return 1;
    }
}
