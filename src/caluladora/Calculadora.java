/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caluladora;

/**
 *
 * @author Alejandro
 */
public class Calculadora {
    
    public int sumar(int a, int b) {
        return a + b;
    }
    
    public int restar(int a, int b) {
        return a - b;
    }
    
   
    
    public int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("¡División por cero!");
        }
        return a / b;
    }
    
   
}
