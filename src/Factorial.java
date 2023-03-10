public class Factorial {

    // Método para calcular el factorial de manera Iterativa.
    public static int factorialIterativo(int n) {
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    // Método para calcular el factorial de manera Recursiva.
    public static int factorialRecursivo(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorialRecursivo(n - 1);
        }
    }
}

