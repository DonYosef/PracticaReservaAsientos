package com.mycompany.pruebasleetcode;

import java.util.Scanner;

public class PruebasLeetCode {
       
    //Metodo para imprimir asientos disponibles
    static void verAsientos(char array[][]) {
        System.out.println("   0  1  2  3  4  5  6  7  8  9 ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(i+" ");
            for (int j = 0; j < array.length; j++) {
                System.out.print("["+array[i][j]+"]");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int bandera = 1;
        String respuesta;
        int eleccionFila;
        int eleccionAsiento;
        
        //Creacion y llenados de asientos
        char[][] asientos = new char[10][10];
        for(int i = 0; i<asientos.length; i++){
            for(int j = 0; j<asientos.length; j++){
                asientos[i][j] = 'L';
            }
        }
        //Mapeo de asientos disponibles
        System.out.println("Bienvenido al sistema de reservas de asientos, asientos actualmente disponibles:  ");
        verAsientos(asientos);
        
        //Menu compra de asientos
        while (bandera != 0) {
            System.out.println("¿Qué asiento desea comprar?");
            System.out.print("Seleccione la fila, entre la 0 y 9: ");
            eleccionFila = teclado.nextInt();

            System.out.println("Seleccione el asiento, entre 0 y 9: ");
            eleccionAsiento = teclado.nextInt();

            if (asientos[eleccionFila][eleccionAsiento] == 'L') {
                System.out.println("Su asiento a sido reservado con éxito!");
                System.out.println("");
                asientos[eleccionFila][eleccionAsiento] = 'X';
            } else {
                System.out.println("El asiento que desea reservar no se encuentra disponible");
            }

            System.out.println("¿Desea realizar una nueva reservacion? ");
            System.out.println("Marque 'S' para si y marque 'N' para no: ");
            teclado.nextLine();
            respuesta = teclado.nextLine();

            if (respuesta.equalsIgnoreCase("n")) {
                
                System.out.println("El programa finaliza con los siguientes asientes reservados:");
                verAsientos(asientos);
                bandera = 0;
            }else{
                verAsientos(asientos);
            }

        }
        

        
    }
}
