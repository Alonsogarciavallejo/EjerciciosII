    import java.util.ArrayList;
import java.util.List;

public class Ejercicios {

    // Ejercicio1
    public static int sumaN(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + sumaN(n - 1);
        }
    }

    //Ejercicio2
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    //Ejercicio3
    public static int potencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else {
            return base * potencia(base, exponente - 1);
        }
    }

    //Ejercicio4
    public static int sumaLista(List<Integer> lista) {
        if (lista.isEmpty()) {
            return 0;
        } else {
            return lista.get(0) + sumaLista(lista.subList(1, lista.size()));
        }
    }

    //Ejercicio5
    public static double mediaLista(List<Integer> lista) {
        if (lista.isEmpty()) {
            return 0;
        } else {
            return (double) sumaLista(lista) / lista.size();
        }
    }

    //Ejercicio6
    public static double desviacionTipica(List<Integer> lista) {
        double media = mediaLista(lista);
        double sumaCuadrados = 0;
        for (int num : lista) {
            sumaCuadrados += Math.pow(num - media, 2);
        }
        return Math.sqrt(sumaCuadrados / lista.size());
    }

    //Ejercicio7
    public static int sumaPares(int n) {
        if (n == 2) {
            return 2;
        } else if (n % 2 == 0) {
            return n + sumaPares(n - 2);
        } else {
            return sumaPares(n - 1);
        }
    }

    //Ejercicio8
    public static int sumaParesLista(List<Integer> lista) {
        if (lista.isEmpty()) {
            return 0;
        } else {
            int primero = lista.get(0);
            if (primero % 2 == 0) {
                return primero + sumaParesLista(lista.subList(1, lista.size()));
            } else {
                return sumaParesLista(lista.subList(1, lista.size()));
            }
        }
    }

    //Ejercicio9
    public static List<Integer> listaPares(int n) {
        List<Integer> pares = new ArrayList<>();
        if (n == 2) {
            pares.add(2);
            return pares;
        } else if (n % 2 == 0) {
            pares.add(n);
            pares.addAll(listaPares(n - 2));
            return pares;
        } else {
            return listaPares(n - 1);
        }
    }

    //Ejercicio10
    public static int productoEscalar(List<Integer> lista1, List<Integer> lista2) {
        if (lista1.isEmpty() || lista2.isEmpty() || lista1.size() != lista2.size()) {
            return -1; // Error
        } else {
            return lista1.get(0) * lista2.get(0) + productoEscalar(lista1.subList(1, lista1.size()), lista2.subList(1, lista2.size()));
        }
    }

    //Ejercicio11
    public static List<Integer> obtenerListaPares(List<Integer> lista) {
        List<Integer> pares = new ArrayList<>();
        if (lista.isEmpty()) {
            return pares;
        } else {
            int primero = lista.get(0);
            if (primero % 2 == 0) {
                pares.add(primero);
            }
            pares.addAll(obtenerListaPares(lista.subList(1, lista.size())));
            return pares;
        }
    }

    // Método para probar las funciones
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);

        System.out.println("Suma de números del 0 a 5: " + sumaN(5));
        System.out.println("Factorial de 5: " + factorial(5));
        System.out.println("Potencia de 2 a la 3: " + potencia(2, 3));
        System.out.println("Suma de elementos de la lista " + lista + ": " + sumaLista(lista));
        System.out.println("Media de la lista " + lista + ": " + mediaLista(lista));
        System.out.println("Desviación típica de la lista " + lista + ": " + desviacionTipica(lista));
        System.out.println("Suma de los primeros números pares hasta 9: " + sumaPares(9));
        System.out.println("Suma de los elementos pares de la lista " + lista + ": " + sumaParesLista(lista));
        System.out.println("Lista de números pares hasta 9: " + listaPares(9));
        System.out.println("Producto escalar de dos listas iguales " + lista + ": " + productoEscalar(lista, lista));
        System.out.println("Obtener lista de números pares de " + lista + ": " + obtenerListaPares(lista));
    }
}

