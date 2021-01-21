/*
 * Copyright 2020 Ivan Emilov Pashev  ivanemilov.pashev.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.libraries;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Ivan Emilov Pashev ivanemilov.pashev.alum@iescamp.es
 */
public class UtilesEntrada {
    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static final double obtenerReal(String msgUsr, String msgErr) {
        double numero = 0;
        boolean entradaOK = false;

        do {
            try {
                System.out.print(msgUsr);
                numero = SCN.nextDouble();
                entradaOK = true;
            } catch (Exception e) {
                System.out.println(msgErr);
            } finally {
                SCN.nextLine();
//                System.out.println("---");
            }
        } while (!entradaOK);

        return numero;
    }

    public static final int obtenerEntero(String msgUsr, String msgErr) {
        return (int) obtenerReal(msgUsr, msgErr);
    }

    public static final char obtenerCaracter(String msgUsr, String msgErr) {
        char dato = 0;
        boolean entradaOK = false;

        do {
            try {
                System.out.print(msgUsr);
                dato = SCN.nextLine().charAt(0);
                entradaOK = true;
            } catch (Exception e) {
                System.out.println(msgErr);
            } finally {
//                System.out.println("---");MSG_USR_ENT
            }
        } while (!entradaOK);

        return dato;
    }

    public static final boolean obtenerLogico(String msgUsr, String msgErr) {
        boolean dato = false;
        boolean entradaOK = false;

        do {
            try {
                System.out.print(msgUsr);
                dato = SCN.nextBoolean();
                entradaOK = true;
            } catch (Exception e) {
                System.out.println(msgErr);
            } finally {
                SCN.nextLine();
//                System.out.println("---");
            }
        } while (!entradaOK);

        return dato;
    }

    public static final String obtenerTexto(String msgUsr) {
        System.out.print(msgUsr);
        return SCN.nextLine();
    }
    public static final int obtenerEnteroRango(String msgUsr, String msgErr, int min, int max) {
        boolean semaforo = false;
        int dato;
        do {            
           dato = obtenerEntero(msgUsr, msgErr);
            
            if (dato >= min && dato <= max) {
                semaforo = true;
            } else {
                System.out.println(msgErr);
            }
        } while (!semaforo);
        
       
        return dato;
    }
}