package prueba;
/**
 * Esta clase representa un ejemplo simple de una calculadora.
 * Permite realizar operaciones básicas como suma, resta, multiplicación y división.
 */
public class Calculadora {
    
    /**
     * Suma dos números enteros.
     * 
     * @param a El primer número entero.
     * @param b El segundo número entero.
     * @return La suma de los dos números enteros.
     */
    public int sumar(int a, int b) {
        return a + b;
    }
    
    /**
     * Resta dos números enteros.
     * 
     * @param a El primer número entero.
     * @param b El segundo número entero.
     * @return La resta del primer número menos el segundo.
     */
    public int restar(int a, int b) {
        return a - b;
    }
    
    /**
     * Multiplica dos números enteros.
     * 
     * @param a El primer número entero.
     * @param b El segundo número entero.
     * @return El resultado de la multiplicación.
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }
    
    /**
     * Divide dos números enteros.
     * 
     * @param a El dividendo.
     * @param b El divisor.
     * @return El cociente de la división.
     * @throws ArithmeticException Si el divisor es 0.
     */
    public int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
        return a / b;
    }
}
