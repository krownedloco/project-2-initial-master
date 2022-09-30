package com.csc205.project2;

public class Octahedron extends Shape{

    private double lengthOfEdge;

    public Octahedron(){
        super();
        this.lengthOfEdge = 0.0;
    }

    public Octahedron(double lengthOfEdge) {
        super();
        this.lengthOfEdge = lengthOfEdge;
    }

    public double getLengthOfEdge() {
        return lengthOfEdge;
    }

    public void setLengthOfEdge(double lengthOfEdge) {
        this.lengthOfEdge = lengthOfEdge;
    }

    public double surfaceArea() {
        return (2 * Math.sqrt(3) * Math.pow(lengthOfEdge, 2));
    }

    public double volume() {
        return ((Math.sqrt(2) / 3) * Math.pow(lengthOfEdge, 3));
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Octahedron {");
        sb.append("Length of edge=").append(lengthOfEdge);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
