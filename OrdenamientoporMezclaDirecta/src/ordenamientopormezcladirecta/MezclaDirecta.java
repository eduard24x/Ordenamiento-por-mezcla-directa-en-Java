package ordenamientopormezcladirecta;

/**
 *
 * @author Eduardo
 */
public class MezclaDirecta {

    //Método mezcla directa
    public int[] mezcla(int[] arreglo) {//Método mezcla que recibe como parámetro a un arreglo
        int i, j, k;//Variables de tipo entero
        if (arreglo.length > 1) {
            int nElementosIzq = arreglo.length / 2;
            int nElementosDer = arreglo.length - nElementosIzq;
            int arregloIzq[] = new int[nElementosIzq];
            int arregloDer[] = new int[nElementosDer];

            //Copiar elementos del arreglo original al arregloIzq
            for (i = 0; i < nElementosIzq; i++) {
                arregloIzq[i] = arreglo[i];
            }
            //Copiar elementos restantes del arreglo original al arregloDer
            for (i = nElementosIzq; i < nElementosIzq + nElementosDer; i++) {
                arregloDer[i - nElementosIzq] = arreglo[i];
            }
            //Recursividad
            arregloIzq = mezcla(arregloIzq);
            arregloDer = mezcla(arregloDer);
            i = 0;//inicialización de i,j y k  en cero
            j = 0;
            k = 0;
            while (arregloIzq.length != j && arregloDer.length != k) {//Mientras el tamaño del arreglo izquierdo y derecho sea diferente de j y k respectivamente
                if (arregloIzq[j] < arregloDer[k]) {
                    arreglo[i] = arregloIzq[j];
                    i++;
                    j++;
                } else {//De manera contraria
                    arreglo[i] = arregloDer[k];
                    i++;//Incrementación del contador i y k
                    k++;
                }
            }
            //Arreglo final
            while (arregloIzq.length != j) {
                arreglo[i] = arregloIzq[j];//Asignación de los elementos de arreglo izquierdo al arreglo original
                i++;
                j++;
            }
            while (arregloDer.length != k) {
                arreglo[i] = arregloDer[k];//Asignación de los elementos de arreglo derecho al arreglo original
                i++;
                k++;
            }
        }
        return arreglo;//Retorna al arreglo ordenado
    }
}
