package upiiz.org;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(10, 5, 8, 3, 15, 20, 7, 12, 4, 9);

        System.out.println("=== 9.1 PROGRAMACIÓN ESTRUCTURADA ===");

        System.out.println("1. Todos los números:");
        for (int i = 0; i < numeros.size(); i++) {
            System.out.print(numeros.get(i) + " ");
        }
        System.out.println("\n");

        System.out.println("2. Números mayores que 10:");
        for (int n : numeros) {
            if (n > 10) {
                System.out.print(n + " ");
            }
        }
        System.out.println("\n");

        System.out.println("3. Números pares:");
        for (int n : numeros) {
            if (n % 2 == 0) {
                System.out.print(n + " ");
            }
        }
        System.out.println("\n");

        System.out.println("4. Números impares:");
        for (int n : numeros) {
            if (n % 2 != 0) {
                System.out.print(n + " ");
            }
        }
        System.out.println("\n");

        System.out.println("5. Multiplicar cada número por 2:");
        for (int n : numeros) {
            System.out.print((n * 2) + " ");
        }
        System.out.println("\n\n=== 10. LAMBDAS Y STREAMS ===");

        List<Integer> mayoresIguales8 = numeros.stream()
                .filter(n -> n >= 8)
                .collect(Collectors.toList());
        System.out.println("6. Mayores o iguales a 8: " + mayoresIguales8);

        List<Integer> pares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("7. Colección de pares: " + pares);

        List<Integer> menorAMayor = numeros.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("8. Ordenados de menor a mayor: " + menorAMayor);

        List<Integer> mayorAMenor = numeros.stream()
                .sorted((a, b) -> b.compareTo(a))
                .collect(Collectors.toList());
        System.out.println("9. Ordenados de mayor a menor: " + mayorAMenor);

        int maximo = numeros.stream()
                .max(Integer::compareTo)
                .orElse(0);
        System.out.println("10. Valor máximo: " + maximo);

        int minimo = numeros.stream()
                .min(Integer::compareTo)
                .orElse(0);
        System.out.println("11. Valor mínimo: " + minimo);

        int suma = numeros.stream()
                .reduce(0, Integer::sum);
        System.out.println("12. Suma total: " + suma);

        double promedio = numeros.stream()
                .mapToInt(n -> n)
                .average()
                .orElse(0.0);
        System.out.println("13. Promedio: " + promedio);

        long countMayores10 = numeros.stream()
                .filter(n -> n > 10)
                .count();
        System.out.println("14. Cantidad de números mayores que 10: " + countMayores10);

        List<Integer> imparesOrdenados = numeros.stream()
                .filter(n -> n % 2 != 0)
                .sorted()
                .collect(Collectors.toList());
        System.out.println("15. Impares ordenados de menor a mayor: " + imparesOrdenados);
    }
}