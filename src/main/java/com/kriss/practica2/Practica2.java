/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kriss.practica2;

import java.util.Scanner;

/**
 *
 * @author kriss
 */
public class Practica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingresar datos");
        System.out.println("**************");
        System.out.println("Ingresa usuario:");
        String usuario=scanner.next();
        System.out.println("Ingresa nombre:");
        String nombre=scanner.next();
        System.out.println("Ingresa apellidos:");
        String apellido=scanner.next();
        System.out.println("Ingresa edad:");
        String edad=scanner.next();
        System.out.println("Hobbie:");
        String hobbie=scanner.next();
        System.out.println("Editor preferido:");
         String editor=scanner.next();
         System.out.println("Sistema operativo:");
         String SO=scanner.next();
          System.out.println("\tBienvenido al sistema\t");
          System.out.println("*******************************");
          System.out.println("Los datos ingresados son:");
          System.out.println("Usuario: "+usuario);
          System.out.println("Nombre: "+nombre);
          System.out.println("Apellidos: "+apellido);
          System.out.println("Edad: "+edad);
          System.out.println("Hobbie: "+hobbie);
          System.out.println("Editor preferido: "+editor);
          System.out.println("Sistema operativo:"+SO);
          
         
         
         
        
    }
    
}
