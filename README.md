# Métodos de Ordenamiento en Java: ShellSort y QuickSort

## Datos Académicos
* **Institución:** Instituto Tecnológico Superior de Xalapa (ITSX)
* **Carrera:** Ingeniería en Sistemas Computacionales (ISC)
* **Asignatura:** Estructura de Datos (AED-1026)
* **Alumno:** David Domínguez López

---

## Descripción del Proyecto
Este repositorio contiene la implementación en lenguaje Java de dos algoritmos clásicos de ordenamiento interno: **ShellSort** y **QuickSort**. El objetivo de la práctica es analizar su funcionamiento lógico, completar su codificación y comparar su eficiencia en términos de complejidad temporal y espacial.

---

## Estructura del Repositorio
```text
├── src/
│   └── Metodos_de_ordenamiento/
│       ├── ShellSort.java
│       └── QuickSort.java
└── README.md
```

---

## Algoritmos Implementados

### 1. ShellSort (`ShellSort.java`)
Es una optimización del método de inserción directa. Permite el intercambio de elementos distantes mediante una secuencia de intervalos (*gaps*) que se reducen progresivamente hasta llegar a `1`, logrando que el arreglo quede prácticamente ordenado antes de la última pasada.

* **Complejidad promedio:** \(O(n^{1.25})\) a \(O(n^{1.5})\) (según la secuencia de saltos).
* **Complejidad espacial:** O(1) (*in-place* e iterativo).

### 2. QuickSort (`QuickSort.java`)
Algoritmo basado en la estrategia de **divide y vencerás**. Selecciona un elemento como **pivote** y particiona el arreglo de modo que los elementos menores queden a su izquierda y los mayores a su derecha, aplicando el proceso de forma recursiva en cada subarreglo.

* **Complejidad promedio:** \(O(n \log n)\)
* **Complejidad espacial:** \(O(\log n)\) (por la pila de llamadas recursivas).

---

## Comparativa Técnica

| Característica | ShellSort | QuickSort |
| :--- | :--- | :--- |
| **Paradigma** | Inserción mejorada por saltos (*gaps*) | Divide y vencerás (recursivo) |
| **Mejor caso** | \(O(n \log n)\) | \(O(n \log n)\) |
| **Peor caso** | O(n²) | O(n²) |
| **Memoria auxiliar** | O(1) | \(O(\log n)\) |
| **Estabilidad** | No estable | No estable |

---

## Requisitos y Ejecución

1. Tener instalado **Java JDK 8** o superior.
2. Clonar este repositorio en tu equipo local:
   ```bash
   git clone https://github.com
   ```
3. Compilar y ejecutar desde la terminal dentro de la carpeta `src`:
   ```bash
   javac Metodos_de_ordenamiento/ShellSort.java
   java Metodos_de_ordenamiento.ShellSort
   ```

---

## Ejemplo de Salida en Consola
```text
Arreglo original: |45, 12, 89, 3, 27, 64, 10|
Arreglo ordenado: |3, 10, 12, 27, 45, 64, 89|
```
