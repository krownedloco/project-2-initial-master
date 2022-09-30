package com.csc205.project2;

public class Cuboid extends Shape{

    private double width, height, length;

    public Cuboid (){
        super();
        this.width = 0.0;
        this.height = 0.0;
        this.length = 0.0;
    }

    public Cuboid (double width, double height, double length) {
        super();
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double surfaceArea() {
        return (2 * (length*width + width*height + height*length));
    }

    public double volume() {
        return width*height*length;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cuboid {");
        sb.append("width=").append(width);
        sb.append(", height=").append(height);
        sb.append(", length=").append(length);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
