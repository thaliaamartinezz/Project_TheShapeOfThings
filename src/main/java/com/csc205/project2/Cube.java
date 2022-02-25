package com.csc205.project2;

public class Cube extends Shape{
    private double width;

    public Cube() {
        super();
        this.width = 0.0;
    }

    public Cube(double v) {
        super();
        this.width = v;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double surfaceArea() {
        //surface area formula for cube
        return 6.0 * Math.pow(width, 2);
    }

    public double volume() {
        //volume formula for cube
        return Math.pow(width, 3);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cube: \n {");
        sb.append("width = ").append(width);
        sb.append(", surface area = ").append(surfaceArea());
        sb.append(", volume = ").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
