/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadores;
import java.util.Scanner;
/**
 *
 * @author Jeisson Huerfano
 */
public class Operadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          //se declara el objetivo del programa
        System.out.println("operaciones entre dos numero");
        
         //se declaran las variables
        int num1, num2, suma, resta, multiplicacion;
        double division;
        Scanner in = new Scanner(System.in);
        
        //se pide el ingreso de datos
        System.out.print("ingrese su primer numero: ");
        num1 = in.nextInt();
        System.out.print("ingrese su segundo numero: ");
        num2 = in.nextInt();
        
         //proceso
        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;
        division = num1 / num2;
        
         //salida de datos o resultados
         System.out.println("///////////////////////////////////////////");
        System.out.println("las operaciones de los numeros son: ");
        System.out.println("-la suma de los numeros es: " + suma);
        System.out.println("-la resta de los numeros es: " + resta);
        System.out.println("-la multiplicacion de los numeros es: " + multiplicacion);
        System.out.println("-la division de los numeros es: " + division);
        System.out.println("muchas gracias");
        System.out.println("////////////////////////////////////////////");
    }
    
}
