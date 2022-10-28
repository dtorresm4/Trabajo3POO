/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.trabajo3poo;

/**
 *
 * @author Pc Daniel
 */
public class Trabajo3POO {

    public static void main(String[] args) {
        var universidad1 = new Universidad("Universidad Politecnica Salesiana ",
                "Calle vieja y Turuhuayco", 1994);

        var carrera1 = new Carrera("Electronica", "Ing Diego Soto ", 4);

        var asignatura1 = new Asignatura("Electronica Analogica", "ING Luis Bolaños", "Electronica");

        var universidad2 = new Universidad("Universidad de Cuenca",
                "Av Doce de Abril", 1867);

        var carrera2 = new Carrera("Telecomunicaciones", "Ing Luis Diaz ", 5);

        var asignatura2 = new Asignatura("Teoria Electromagnetica", "ING Marco Lopez", "Telecomunicaciones ");

        System.out.println(universidad1.getinfoUniversidad());
        System.out.println(carrera1.getinfoCarrera());
        System.out.println(asignatura1.getinfoAsignatura());
        System.out.println(universidad2.getinfoUniversidad());
        System.out.println(carrera2.getinfoCarrera());
        System.out.println(asignatura2.getinfoAsignatura());

    }
}
