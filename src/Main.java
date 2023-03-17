public class Main {
    public static void main(String[] args) {
        int numFactorial = 5;
        int numRecursivo = 5;
        System.out.println("El factorial de " + numFactorial + " (iterativo) es: " + Factorial.factorialIterativo(numFactorial));
        System.out.println("El factorial de " + numRecursivo + " (recursivo) es: " + Factorial.factorialRecursivo(numRecursivo));
    }


}
