package com.tecmilenio;


import java.util.Scanner;

public class rectangulo implements Shape {

    private double base;
    private double altura;

    public rectangulo (double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public rectangulo() {
        System.out.println("ingresa el valor de la base");
        Scanner lector = new Scanner(System.in);
        base= lector.nextInt();

        System.out.println("ingresa el valor de la altura");
        Scanner lector1 = new Scanner(System.in);
        altura= lector1.nextInt();
    }

    public void setBase (double base){
        this.base = base;
    }

    public double getBase (){
        return base;
    }

    public void setAltura (double altura){
        this.altura = altura;
    }

    public double getAltura (){
        return altura;
    }

    @Override
    public double area() {
        return base*altura;
    }

    @Override
    public double perimeter() {
        return base*2+altura*2;
    }
}
