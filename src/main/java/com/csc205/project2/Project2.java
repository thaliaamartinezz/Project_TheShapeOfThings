package com.csc205.project2;

import java.util.ArrayList;
import java.util.List;

/**
 * Driver for project 2.
 *
 * Modify the driver as needed to demonstrate your classes.
 *
 */
public class Project2 {

    public static void main(String[] args) {

        //Creates Sphere
        ThreeDimensionalShape sphere = new Sphere(2.0);
        //Prints name, volume, & surface area
        System.out.println(sphere);

        //Creates Cube
        ThreeDimensionalShape cube = new Cube(5.0);
        //Prints name, volume, & surface area
        System.out.println(cube);

        //Creates Cylinder
        ThreeDimensionalShape cylinder = new Cylinder(1.0 ,4.0);
        //Prints name, volume, & surface area
        System.out.println(cylinder);

        //Creates Tetrahedron
        ThreeDimensionalShape tetrahedron = new Tetrahedron(5.0);
        //Prints name, volume, & surface area
        System.out.println(tetrahedron);

    }

}

