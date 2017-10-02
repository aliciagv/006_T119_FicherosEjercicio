/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.fichero.business;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 *
 * @author cice
 */
public class Fichero {

    private File file = new File("ficheros/notas.txt");
    private final static String separator = "|";

    public void calculoMedia() {

        FileReader fileReader = null;
        try {
            double media;
            int contador = 0;
            double suma = 0;
            /*CON SPLIT*/
            //  String valores[];
            fileReader = new FileReader(file);
            BufferedReader bf = new BufferedReader(fileReader);
            String cadena;
            StringTokenizer st = null;
            while ((cadena = bf.readLine()) != null) {
                System.out.println(cadena);

                st = new StringTokenizer(cadena, separator);
                while (st.hasMoreTokens()) {
                    contador++;
                    suma += Double.parseDouble(st.nextToken().trim());
                }

                /*
                 CON SPLIT
                 valores=cadena.split("\\|");
                 for (String valor: valores) {
                     System.out.println("VALOR:" + valor);
                     contador++;
                     suma+=Double.parseDouble(valor.trim());
                 }
                 */
            }

            if (contador != 0) {
                media = suma / contador;

                System.out.println("Media:" + media);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("El fichero a leer no existe");
        } catch (IOException ex) {
            System.out.println("Problema al leer el fichero");
        } catch (NumberFormatException nfe) {
            System.out.println("El fichero no tiene el formato correcto");
        } finally {
            try {
                fileReader.close();
            } catch (IOException ex) {

            }
        }

    }

    public void calculoMedia2() {

        FileReader fileReader = null;
        try {
            double media;
            double suma = 0;
            String valores[];
            fileReader = new FileReader(file);
            BufferedReader bf = new BufferedReader(fileReader);
            String cadena;
            String cadenaTotal = "";
            while ((cadena = bf.readLine()) != null) {
                cadenaTotal += cadena + "|";
            }
            valores = cadenaTotal.split("\\|");
            for (String valor : valores) {
                 suma += Double.parseDouble(valor.trim());
            }

            if (valores.length != 0) {
                media = suma / valores.length;
                System.out.println("Media:" + media);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("El fichero a leer no existe");
        } catch (IOException ex) {
            System.out.println("Problema al leer el fichero");
        } catch (NumberFormatException nfe) {
            System.out.println("El fichero no tiene el formato correcto");
        } finally {
            try {
                fileReader.close();
            } catch (IOException ex) {

            }
        }

    }

}
