package com.tecmilenio;

import java.util.Scanner;

public class triangulo implements Shape {

    private double sideLength;   // cm
    private double heightLength; // cm
    private double lado;

    public triangulo(double sideLength, double heightLength, double lado) {
        this.sideLength = sideLength;
        this.heightLength = heightLength;
        this.lado = lado;
    }

    public triangulo() {
        System.out.println("ingresa el valor de la base");
        Scanner lector = new Scanner(System.in);
        sideLength= lector.nextInt();

        System.out.println("ingresa el valor de la altura");
        Scanner lector1 = new Scanner(System.in);
        heightLength= lector1.nextInt();

        System.out.println("ingresa el valor del lado");
        Scanner lector2 = new Scanner(System.in);
        lado= lector2.nextInt();
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

     public void setHeightLength(double heightLength){
        this.heightLength = heightLength;
     }

    public double getHeightLength() {
        return heightLength;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    @Override
    public double area() {
        return sideLength*heightLength/2;
    }

    @Override
    public double perimeter() {
        return lado*3;
    }
}
