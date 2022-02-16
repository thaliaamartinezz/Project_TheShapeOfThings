package com.csc205.project2;

public class Tetrahedron extends Shape {
    private double edge;

    public Tetrahedron() {
        super();
        this.edge = 0.0;
    }

    public Tetrahedron(double v) {
        super();
        this.edge = v;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    public double surfaceArea() {
        return Math.sqrt(3.0) * Math.pow(edge, 2);
    }

    public double volume() {
        return (Math.pow(edge, 3))/(6.0 * Math.sqrt(2.0));
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Tetrahedron {");
        sb.append("edge=").append(edge);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
