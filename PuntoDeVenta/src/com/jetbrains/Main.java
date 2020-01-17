package com.jetbrains;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int tribunaNorte = 0;
        int tribunaSur = 0;
        int tribunaOriente = 0;
        int tribunaoccidente = 0;
        int totalPersonas =0;
        int personas = 0;
        int montoTotal = 0;
        int seleccionDeTribuna =0;
        Scanner leer = new Scanner(System.in);
        do{
            System.out.println("\n\nMenu Principal Estadio Futbol");
            System.out.println("1. Tribuna Norte.");
            System.out.println("2. Tribuna sur");
            System.out.println("3. Tribunal oriente");
            System.out.println("4. Tribunal occidente ");
            System.out.println("5. Venta total");
            System.out.println("6. Salir");
            System.out.println("Selecciona una tribuna");
            seleccionDeTribuna=leer.nextInt();

            switch (seleccionDeTribuna){
                case 1:
                    System.out.println("-------------------------");
                    System.out.println("Numero de personas");
                    personas =leer.nextInt();
                    System.out.println("Usted selecciono la tribuna norte para"+personas+"Personas el monto a pagar es: $"+(personas*25));
                    totalPersonas+=personas;
                    tribunaNorte+=personas;
                    montoTotal+=personas*25;
                    personas =0;
                    break;

                case 2:
                    System.out.println("-------------------------");
                    System.out.println("Numero de personas");
                    personas =leer.nextInt();
                    System.out.println("Usted selecciono la tribuna Sur para "+personas+" Personas el monto a pagar es: $"+(personas*25));
                    totalPersonas+=personas;
                    tribunaSur+=personas;
                    montoTotal+=personas*25;
                    personas =0;
                    break;
                case 3:
                    System.out.println("-------------------------");
                    System.out.println("Numero de personas");
                    personas =leer.nextInt();
                    System.out.println("Usted selecciono la tribuna Oriente para"+personas+"Personas el monto a pagar es: $"+(personas*45));
                    totalPersonas+=personas;
                    tribunaOriente+=personas;
                    montoTotal+=personas*45;
                    personas =0;
                    break;

                case 4:
                    System.out.println("-------------------------");
                    System.out.println("Numero de personas");
                    personas =leer.nextInt();
                    System.out.println("Usted selecciono la tribuna Occidente  para"+personas+"Personas el monto a pagar es: $"+(personas*65));
                    totalPersonas+=personas;
                    tribunaoccidente+=personas;
                    montoTotal+=personas*65;
                    personas =0;

                case 5:
                    System.out.println("-------------------------");
                    System.out.println("--La venta total del estadio de fultbol es la siguiente--");
                    System.out.println("--La venta total en la tribuna zona  Sur es: "+tribunaSur);
                    System.out.println("--La venta total en la tribuna zona es: "+tribunaNorte);
                    System.out.println("--La venta total en la tribuna zona es: "+tribunaOriente);
                    System.out.println("--La venta total en la tribuna zona  es: "+tribunaoccidente);
                    System.out.println("El numero de entradas vendidas en total es: "+totalPersonas);
                    System.out.println("El monto total de es: "+montoTotal);

            }

        }while (seleccionDeTribuna !=6);
        System.out.println("Adios");
    }
}

