/**
 * Clase que implementa el algoritmo de ordenamiento QuickSort.
 * Utiliza la estrategia de "divide y venceras" seleccionando un elemento
 * como pivote y particionando el arreglo de forma recursiva.
 */
public class QuickSort {

    /**
     * Metodo publico de entrada para ordenar un arreglo de enteros de forma ascendente.
     */
    public static void ordenar(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        quickSort(arr, 0, arr.length - 1);
    }

    /**
     * Metodo recursivo que divide el arreglo en subarreglos a partir del pivote.
     */
    private static void quickSort(int[] arr, int inicio, int fin) {
        if (inicio < fin) {
            // Obtenemos el indice donde el pivote queda en su posicion definitiva
            int indicePivote = particionar(arr, inicio, fin);

            // Ordenamos recursivamente la sublista izquierda y la sublista derecha
            quickSort(arr, inicio, indicePivote - 1);
            quickSort(arr, indicePivote + 1, fin);
        }
    }

    /**
     * Reorganiza los elementos tomando el ultimo elemento como pivote.
     * Los menores o iguales van a la izquierda y los mayores a la derecha.
     */
    private static int particionar(int[] arr, int inicio, int fin) {
        int pivote = arr[fin]; // Elegimos el ultimo elemento como pivote
        int i = inicio - 1;    // Indice del elemento mas pequeno

        for (int j = inicio; j < fin; j++) {
            // Si el elemento actual es menor o igual al pivote, lo intercambiamos hacia la izquierda
            if (arr[j] <= pivote) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Colocamos el pivote en su posicion final correcta
        int temp = arr[i + 1];
        arr[i + 1] = arr[fin];
        arr[fin] = temp;

        return i + 1;
    }

    /**
     * Imprime el contenido del arreglo con el mismo formato que ShellSort.
     */
    public static void imprimirArreglo(int[] arr) {
        System.out.print("|");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + (i < arr.length - 1 ? ", " : ""));
        }
        System.out.println("|");
    }

    // Metodo main de prueba para validar la salida en consola
    public static void main(String[] args) {
        int[] datos = {45, 12, 89, 3, 27, 64, 10};
        System.out.print("Arreglo original: ");
        imprimirArreglo(datos);

        ordenar(datos);

        System.out.print("Arreglo ordenado: ");
        imprimirArreglo(datos);
    }
}
