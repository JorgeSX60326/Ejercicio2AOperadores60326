/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2aoperadores60326;

/**
 *
 * @author Jun
 */
public class Ejercicio2AOperadores60326 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
      int[][] matriz = new int[3][3];
      int determinante = 0;
      
      // Asignamos valores a nuestra matriz.
      matriz[0][0] = 15;
      matriz[0][1] = 11;
      matriz[0][2] = 22;
      
      matriz[1][0] = 33;
      matriz[1][1] = 8;
      matriz[1][2] = 14;
      
      matriz[2][0] = 18;
      matriz[2][1] = 9;
      matriz[2][2] = 17;
      
      // Hacemos la operacion para calcular la determinante.
      determinante = ( matriz[0][0] * matriz[1][1] * matriz[2][2]) - ( matriz[0][2] * matriz[1][1] * matriz[2][0]);
      
      // Imprimimos el valor de la determinante.
      System.out.println("El valor de la determinante es: " + determinante);
    }
    
}
