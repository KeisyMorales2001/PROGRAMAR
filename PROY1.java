package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        int option;
        String nombre;
        final int valor1=15, valor2=10, valor3=15;
        double cantidad, costo, total,descuento,neto;

        System.out.println("\t ALMACEN DE TECNOLOGIA");
        System.out.println("\n ");
        System.out.println(" Seleccione 1 si es tipo de cliente 1");
        System.out.println(" Seleccione 2 si es tipo de cliente 2");
        System.out.println(" Seleccione 3 si es tipo de cliente 3");
        System.out.println(" Seleccione 4 para salir ");

        System.out.println("Ingrese el tipo del cliente");
        option=scan.nextInt();

        scan.skip("\n");

        switch (option){
            case 1: System.out.println( "  Ingrese el nombre del cliente: ");
                    nombre= scan.nextLine();
                    System.out.println( "Ingrese la cantidad de articulos: ");
                    cantidad = scan.nextDouble();
                    System.out.println( "Ingrese el costo por articulos: ");
                    costo= scan.nextDouble();
                    total= cantidad * costo;
                    descuento= total * valor1/100;
                    neto= total-descuento;
                    System.out.println("\n\n <---------FACTURA DE LA COMPRA DEL ALMACEN DE TECNOLOGIA-----------> ");
                    System.out.println("  NOMBRE DEL CLIENTE: " + nombre);
                    System.out.println("  TOTAL A PAGAR: " + total);
                    System.out.println("  DESCUENTO: " + descuento);
                    System.out.println("  NETO A PAGAR: " + neto);
                    System.out.println( "----------GRACIAS POR SU COMPRA-------" );
                break;

            case 2:  System.out.println( "  Ingrese el nombre del cliente: ");
                     nombre=scan.nextLine();
                     System.out.println( "  Tipo de cliente 2");
                     System.out.println( "  Ingrese la cantidad de articulos: ");
                     cantidad = scan.nextDouble();
                     System.out.println( "Ingrese el costo por articulos: ");
                     costo= scan.nextInt();
                     total= cantidad * costo;
                     descuento= total * valor2/100;
                     neto= total-descuento;
                     System.out.println("\n\n <---------FACTURA DE LA COMPRA DEL ALMACEN DE TECNOLOGIA-----------> ");
                     System.out.println("  NOMBRE DEL CLIENTE: " + nombre);
                     System.out.println("  TOTAL A PAGAR: " + total);
                     System.out.println("  DESCUENTO: " + descuento);
                     System.out.println("  NETO A PAGAR: " + neto);
                     System.out.println( "----------GRACIAS POR SU COMPRA-------" );
                break;
            case 3: System.out.println( "  Ingrese el nombre del cliente: ");
                    nombre=scan.nextLine();
                    System.out.println( "  Tipo de cliente 3");
                    System.out.println( "  Ingrese la cantidad de articulos: ");
                    cantidad = scan.nextDouble();
                    System.out.println( "Ingrese el costo por articulos: ");
                    costo= scan.nextDouble();
                    total= cantidad * costo;
                    descuento= total * valor3/100;
                    neto= total-descuento;
                System.out.println("\n\n <---------FACTURA DE LA COMPRA DEL ALMACEN DE TECNOLOGIA-----------> ");
                System.out.println("  NOMBRE DEL CLIENTE: " + nombre);
                System.out.println("  TOTAL A PAGAR: " + total);
                System.out.println("  DESCUENTO: " + descuento);
                System.out.println("  NETO A PAGAR: " + neto);
                System.out.println( "----------GRACIAS POR SU COMPRA-------" );
                break;
            default:  System.out.println("HASTA LUEGO");
        }

    }
}
