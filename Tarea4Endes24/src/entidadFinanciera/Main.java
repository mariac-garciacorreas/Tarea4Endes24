/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entidadFinanciera;


public class Main {

    public static void main(String[] args) {
        CCuenta objetoCuenta;
        double saldoActual;
        

        objetoCuenta = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = objetoCuenta.estado();
        System.out.println("El saldo actual es"+ saldoActual );
        
    
    }
    
    public static void probarIngresar(CCuenta c, int cantidad) throws Exception{
        try {
            c.ingresar(cantidad);
            double cantidadEsperada = 0;
            if (c.estado() != cantidadEsperada){
                throw new Exception("Salario incorrecto tras el ingreso.");
            }
        } catch (Exception e) {
            System.out.println("Error de ingreso: " + e.getMessage());
        }
    }
    
    public static void probarRetirar(CCuenta c, int cantidad) throws Exception{
        try {
            c.retirar(cantidad);
            double cantidadEsperada = 0;
            if (c.estado() != cantidadEsperada){
                throw new Exception("Salario incorrecto tras la retirada.");
            }
        } catch (Exception e) {
            System.out.println("Error de retirada: " + e.getMessage());
        }
    }
    
}

