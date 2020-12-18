package ordenamientopormezcladirecta;

import java.util.Scanner;

/**
 *
 * @author Eduardo
 */
public class OrdenamientoporMezclaDirecta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner introducido = new Scanner(System.in);

        MezclaDirecta mez = new MezclaDirecta();//Instanciación de la clase mezclaDirecta

        System.out.println("\n METODO DE ORDENAMIENTO MEZCLA DIRECTA  \n");

        int elementos;//Variable de tipo entero
        System.out.println("\nIntroduzca el número de elementos del arreglo:");
        elementos = introducido.nextInt();

        int arreglo[] = new int[elementos];// Crea el arreglo y Asigna el tamaño al arreglo
        for (int i = 0; i < elementos; i++) {//Recorre al arreglo
            System.out.println("Introduzca el elemento que estará en la posición " + (i + 1) + ":");
            arreglo[i] = introducido.nextInt();
        }

        System.out.println("\n ORDENAMIENTO POR EL MÉTODO MEZCLA DIRECTA \n");

        String datos = "Los elementos que ha Introducido Son: \n";//Muestra el arreglo original
        for (int k = 0; k < arreglo.length; k++) {
            datos = datos + arreglo[k] + "\n";
        }

        System.out.println(datos + "");

        mez.mezcla(arreglo);

        String datos1 = "Los Elementos Ordenados Ascendentemente son:\n";//Recorre al arreglo ascendentemente
        for (int i = 0; i < arreglo.length; i++) {
            datos1 = datos1 + arreglo[i] + "\n";
        }

        System.out.println(datos1);

        String datos2 = "Los Elementos Ordenados Descendentemente son:\n";//Recorre al arreglo descendentemente
        for (int i = arreglo.length - 1; i >= 0; i--) {
            datos2 = datos2 + arreglo[i] + "\n";
        }

        System.out.println(datos2);

    }

}
