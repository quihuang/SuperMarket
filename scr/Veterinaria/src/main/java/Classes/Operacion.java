/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author quihu
 */
public class Operacion {
    
    
    public long sumar(long num1,long num2){
        return num1 + num2;
    }
    
    public long sumar(long[] listaNumeros){
        long resultado = 0;
        for (long num : listaNumeros){
            resultado = resultado + num;
        }
        return resultado;
    }
    
    public long restar(long num1,long num2){
        return num1 - num2;
    }
    
}
