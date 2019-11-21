/* 
 * Copyright 2019 Elísabet Palomino .
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
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Elísabet Palomino
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {

        //Constantes
        final int MAX_DIAS = 7;
        final double PESO_MAX = 250;
        final double PESO_MIN = 0;

        //Variables
        double peso = 0;
        int dia = 1;
        double mediaPeso = 0;

        //Bucle
        do {
            try {
                //Pedir dato
                System.out.printf("Cuanto pesa el día %d? ", dia);
                peso = SCN.nextDouble();

                //Condicion
                if (peso >= PESO_MIN && peso <= PESO_MAX) {
                    System.out.println("dia " + dia + " pesa " + peso + " Kg");

                    dia++;

                    //Cálculo de la media del peso
                    mediaPeso = mediaPeso + peso;

                } else {

                    //Mensaje de error
                    System.out.println("No es un peso válido");
                }
            } catch (Exception e) {

                //Mensaje de error
                System.out.println("No es un valor válido");

            } finally {
                SCN.nextLine();
            }
        } while (dia <= MAX_DIAS);

        //Cálculo de la media del peso
        mediaPeso = mediaPeso / 7;

        //Mostrar por pantalla
        System.out.printf(Locale.ENGLISH, "La media del peso es %.2f Kg%n", mediaPeso);

    }//main

}//class
