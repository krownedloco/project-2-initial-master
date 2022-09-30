package com.csc205.project2;

public class PentagonalPrism extends Shape {

    private double apothem, baseEdge, height;

    public PentagonalPrism(){
        super();
        this.height = 0.0;
    }


    public PentagonalPrism(double apothem, double baseEdge, double height){
        super();
        this.apothem = apothem;
        this.baseEdge = baseEdge;
        this.height = height;
    }

    public double getApothem() {
        return apothem;
    }

    public void setApothem(double apothem) {
        this.apothem = apothem;
    }

    public double getBaseEdge() {
        return baseEdge;
    }

    public void setBaseEdge(double baseEdge) {
        this.baseEdge = baseEdge;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double surfaceArea(){
        double lsa; // Lateral surface area

        lsa = (5.0 * baseEdge * height);

        return (5.0 *apothem*baseEdge) + lsa;
    }

    public double volume(){
        return ((5.0/2.0)*(apothem*baseEdge*height));
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pentagonal Prism {");
        sb.append("Apothem=").append(apothem);
        sb.append(", Base Edge=").append(baseEdge);
        sb.append(", Height=").append(height);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", Volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
