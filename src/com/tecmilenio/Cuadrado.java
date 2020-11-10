package com.tecmilenio;

import java.util.Scanner;

public class Cuadrado implements Shape {

    protected double sideLength;

    public Cuadrado(double sideLength) {
        this.sideLength = sideLength;
    }

    public Cuadrado() {
        System.out.println("ingresa el valor del lado");
        Scanner lector = new Scanner(System.in);
         sideLength= lector.nextInt();
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    @Override
    public double area() {
        return sideLength*sideLength;
    }

    @Override
    public double perimeter() {
        return sideLength*4;
    }
}
