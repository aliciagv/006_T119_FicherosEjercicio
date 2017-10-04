/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.fichero.business;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cice
 */
public class Notas {
    
    Scanner sc = new Scanner(System.in);
    File file = new File("ficheros/misnotas.txt");
    private final static String separator = "|";
    String opcion;
    
    private void grabar(List<String> notas) {
        try {
            try (FileWriter fw = new FileWriter(file,true)) {
                for(String nota: notas){
                    fw.write(nota);
                    fw.write(separator);
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(Notas.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    public void mostrarMenu() {
        System.out.println("===================");
        System.out.println("APP GUARDAR NOTAS");
        System.out.println("===================");
        List<String> lnotas = new ArrayList<>();
        
        do {
            System.out.println("1.Añadir nota");
            System.out.println("0. Salir");
            opcion=sc.nextLine();
            switch (opcion) {
                case "0":
                    grabar(lnotas);
                   break; 
                case "1":
                    System.out.println("Introduce una nota");
                    if (sc.hasNextDouble()) {
                        lnotas.add(sc.nextLine());
                      } else {
                        System.out.println("ERROR. La nota introducida no tiene formato correcto");
                        sc.next();
                    }
                    
                    break;
                default:
                    System.out.println("La opcion introducida no es correcta");
                    
            }
            
        
        } while (!opcion.equalsIgnoreCase("0"));
                
        
        
        
        
    
    }
    
    
}
