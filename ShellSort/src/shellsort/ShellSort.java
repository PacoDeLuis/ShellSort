/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shellsort;

/**
 *
 * @author delui
 */
import java.util.Scanner;

public class ShellSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //solicita al usuario que ingrese la cantidad de elementos a ordenar
        System.out.print("Ingrese la cantidad de elementos: ");
        int n = scanner.nextInt();

        //crea un arreglo para almacenar los elementos
        int[] arr = new int[n];

        //solicita al usuario que ingrese los elementos uno por uno
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        //muestra en consola el arreglo original antes de ordenarlo
        System.out.println("Arreglo original:");
        ImprimirArreglo(arr);

        //se llama al método shellSort para ordenar el arreglo
        shellSort(arr);

        //muestra en consola el arreglo ordenado después de aplicar Shell Sort
        System.out.println("Arreglo ordenado:");
        ImprimirArreglo(arr);

        scanner.close();
    }

    static void shellSort(int arr[]) {
        int n = arr.length;

        //establece el tamaño inicial del intervalo
        for (int intervalo = n / 2; intervalo > 0; intervalo /= 2) { 
            // Se realiza un bucle sobre el arreglo con el intervalo actual
            for (int i = intervalo; i < n; i++) { 
                int temp = arr[i];
                int j;

                //compara y mueve elementos dentro del intervalo
                for (j = i; j >= intervalo && arr[j - intervalo] > temp; j -= intervalo) { 
                    arr[j] = arr[j - intervalo];
                }
                arr[j] = temp;
            }
        }
    }
    static void ImprimirArreglo(int arr[]) {
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}