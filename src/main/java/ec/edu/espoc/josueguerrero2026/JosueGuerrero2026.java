/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.edu.espoc.josueguerrero2026;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class JosueGuerrero2026 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //PRACTICA 07/11/2024 
        Scanner scanner = new Scanner(System.in);

     /*1.  crear un vector (arreglo) de tamaño 5 para almacenar los precios de los productos 
*Definir variables adicionales para almacenar el promedio de precios, el precio mas alto y el mas bajo, y el 
contador de productos cuyo precio esta por encima del promedio  */
        int[] preciosProductos = new int[5];
        double promedioPrecios;
        int precioMasAlto;
        int precioMasBajo;
        int contadorPorEncimaDelPromedio;

        /* 2.ingresar precios de los productos 
*solicitar al usuario que ingrese el precio de  cada uno de los 5 productos 
*utilizar un bucle para recorrer cada posicion del vector y almacenar los precios ingresados */
        System.out.println("Ingrese los precios de los 5 productos:");
        for (int i = 0; i < preciosProductos.length; i++) {
            System.out.print("Precio del producto " + (i + 1) + ": ");
            preciosProductos[i] = scanner.nextInt();
        }

        /* 3. inplementar menu al usuario con las pociosiones dispinibles:

1. calcular el precio promedio de los productos 
2. mostrar el precio mal alto y el mas bajo 
3. contar productos por encima del promedio 
4. salr
* leer la opcion seleccionada por el usuario y usar una estructura switch case para ejecutar la opcion correspondiente
*/
        int opcion;
        do {
            System.out.println("--- Menú de Opciones ---");
            System.out.println("1. Calcular el precio promedio de los productos");
            System.out.println("2. Mostrar el precio más alto y el más bajo");
            System.out.println("3. Contar productos por encima del promedio");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
    /*4 implementar la opcion 1, calcular el precio promedio de
*inicializaruna variable suma en cero 
*utilizar un bucle FOR  para recorrer el vector de precios y sumar cada uno
*calcular el promedio dividiendo la suma entre el numero de productos 
*imprimir el promedio claculado
         */
                    int sumaPrecios = 0;
                    for (int precio : preciosProductos) {
                        sumaPrecios += precio;
                    }
                    promedioPrecios = (double) sumaPrecios / preciosProductos.length;
                    System.out.println("El precio promedio de los productos es: " + promedioPrecios);
                    break;

                case 2:
////5. implementar la opcion 2; identificar el precio mas alto y el mas bajo
/* inicializar dos variables precioAlto y precioBajo con el valor de la primera posicion del vector
*usar un bucle FOR para recorrer los precios ;
   1. comparar cada precio con precioAlto y alctualizarlo si el precio actual es mayor
   2. cmparar  cada pecio con precioBajo  y alctualizarlo si el precio actual es menor*/
           
           precioMasAlto = preciosProductos[0];
                    precioMasBajo = preciosProductos[0];
                    for (int precio : preciosProductos) {
                        if (precio > precioMasAlto) {
                            precioMasAlto = precio;
                        }
                        if (precio < precioMasBajo) {
                            precioMasBajo = precio;
                        }
                    }
                    System.out.println("El precio más alto es: " + precioMasAlto);
                    System.out.println("El precio más bajo es: " + precioMasBajo);
                    break;

                case 3:
                    // Implementar opción 3: Contar productos por encima del promedio
                    sumaPrecios = 0;
                    for (int precio : preciosProductos) {
                        sumaPrecios += precio;
                    }
                    promedioPrecios = (double) sumaPrecios / preciosProductos.length;
                    contadorPorEncimaDelPromedio = 0;
                    for (int precio : preciosProductos) {
                        if (precio > promedioPrecios) {
                            contadorPorEncimaDelPromedio++;
                        }
                    }
                    System.out.println("Número de productos por encima del promedio: " + contadorPorEncimaDelPromedio);
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}
