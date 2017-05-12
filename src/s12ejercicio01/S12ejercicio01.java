/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s12ejercicio01;

/**
 *
 * @author alumno
 */
public class S12ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {                
        Cuenta miCuenta= new Cuenta("Mi Cuenta", 100.00);                    
        miCuenta.realizarDeposito(20.0);       
        miCuenta.realizarRetiro(50.0);               
        System.out.println(miCuenta.toString());
    }
    
}
