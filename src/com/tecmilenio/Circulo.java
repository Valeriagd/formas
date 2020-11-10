package com.tecmilenio;

import java.util.Scanner;

public class Circulo implements Shape {

    public static final double PI = 3.141592;

    public double radius;



    public Circulo(double radius) {
        this.radius = radius;
    }

    public Circulo() {
        System.out.println("ingresa el valor del radio");
        Scanner lector = new Scanner(System.in);
        radius = lector.nextInt();
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getDiameter() {
        return radius * 2;
    }

    @Override
    public double area() {
        return PI*radius*radius;
    }

    @Override
    public double perimeter() {
        return PI*getDiameter();
    }
}
