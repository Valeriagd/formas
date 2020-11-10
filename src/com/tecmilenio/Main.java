package com.tecmilenio;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion = 0,figura=0, forma=0;
        boolean salir = false;

            while (!salir) {

                System.out.println("Escriba el numero de su opcion");
                System.out.println("Seleccionar propiedad a calcular: 1.área o 2.perímetro.");
                System.out.println("Seleccionar la figura: 3. Circulo, 4.Cuadrado, 5.Triangulo, 6.Rectangulo");
                System.out.println("7.Solicitar los atributos de la figura");
                System.out.println("0.Salir");

                try {
                    opcion = scanner.nextInt();


                    switch (opcion) {



                        case 1: figura = 1;
                        System.out.println("ya se eligio");
                            break;

                        case 2: figura= 2;
                            System.out.println("ya se eligio");
                            break;

                        case 3: Circulo circulo = new Circulo();
                        forma = 1;
                            if (figura==1){
                                System.out.println("el area es: "+circulo.area());
                            }else
                                System.out.println("el perimetro es: "+circulo.perimeter());
                            break;

                        case 4:  Cuadrado cuadrado = new Cuadrado();
                        forma= 2;
                            if (figura==1){
                                System.out.println("el area es: "+cuadrado.area());
                            }else
                                System.out.println("el perimetro es: "+cuadrado.perimeter());

                            break;

                        case 5: triangulo triangulo = new triangulo();
                        forma= 3;
                            if (figura==1){
                                System.out.println("el area es: "+triangulo.area());
                            }else
                                System.out.println("el perimetro es: "+triangulo.perimeter());

                            break;

                        case 6: rectangulo rectangulo = new rectangulo();
                        forma= 4;
                            if (figura==1){
                                System.out.println("el area es: "+rectangulo.area());
                            }else
                                System.out.println("el perimetro es: "+rectangulo.perimeter());

                            break;
                        case 7:
                            if (forma==1) {
                                Circulo circulo1 = new Circulo();
                            }else if (forma==2) {
                                    Cuadrado cuadrado1 = new Cuadrado();
                                }else if (forma==3) {
                                triangulo triangulo1 = new triangulo();
                            }else if (forma == 4) {
                                rectangulo rectangulo1 = new rectangulo();
                            }
                                break;
                        case 0:
                            salir=true;
                            System.out.println("Gracias. Adios");
                            break;

                        default:
                            throw new IllegalStateException("Opcion invalida: " + opcion);
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Ingresa una opcion valida");
                    scanner.next();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
    }
}
