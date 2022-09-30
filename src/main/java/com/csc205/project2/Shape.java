package com.csc205.project2;

public abstract class Shape implements ThreeDimensionalShape {

    protected int faces;


    public int getFaces() {
        return faces;
    }

    public void setFaces(int faces) {
        this.faces = faces;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Shape {");
        sb.append("faces= ").append(faces);
        sb.append('}');
        return sb.toString();
    }
}
