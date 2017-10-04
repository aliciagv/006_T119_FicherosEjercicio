/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.fichero.principal;

import com.cice.fichero.business.Notas;
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
public class Ejercicio2 {
    
    public static void main (String[] args) {
        
       Notas notas = new Notas();
       notas.mostrarMenu();
       
      /* Scanner sc = new Scanner(System.in);
       List<String> lNotas = new ArrayList<>();
       
       String dato=null;
        System.out.println("Introduce la primera nota: ");
        while (!(dato=sc.nextLine()).equals("")) {
            lNotas.add(dato);
            System.out.println("Introduce otra nota o pulsa enter para salir");
        }
        File file = new File("ficheros/misnotas.txt");
        String separator = "|";
         try (FileWriter fw = new FileWriter(file,true)) {
                for(String nota: lNotas){
                    fw.write(nota);
                    fw.write(separator);
                }
            } catch (IOException ex) {
            Logger.getLogger(Ejercicio2.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    */
    
    
    }
    
}
