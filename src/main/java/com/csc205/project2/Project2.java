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

        /*
        The following code works with the example design given.
         */

        /*

        */
        ThreeDimensionalShape sphere = new Sphere(2.0);
        System.out.println(sphere);

        ThreeDimensionalShape cube = new Cube(5.0);
        System.out.println(cube);

        ThreeDimensionalShape cylinder = new Cylinder(1.0 ,4.0);
        System.out.println(cylinder);

        ThreeDimensionalShape tetrahedron = new Tetrahedron(5.0);
        System.out.println(tetrahedron);

        /*/ We'll cover this stuff in module 4
        List<ThreeDimensionalShape> shapes = new ArrayList<>();
        shapes.add(sphere);
        shapes.add(cube);
        shapes.add(cylinder);

        shapes.forEach(System.out::println);*/

        /*
        The following code works with the code given.
         */

        //Sphere sphere = new Sphere(2.0);
        //System.out.println(sphere);


    }

}

