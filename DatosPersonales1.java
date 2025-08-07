/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2_1datos.personales.pkg1;

import java.util.Scanner;

/**
 *
 * @author Jeisson Huerfano
 */
public class DatosPersonales1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //se declara el objetivo del programa que es sobre los datos personales
        System.out.println(" ingreso de datos personales");
        
        //se declaran las variables
        String nombre;
        char sexo;
        int edad;
        double salario;
        boolean transporte;
        Scanner in = new Scanner(System.in);
        
        // se ingresan los datos
        System.out.print("-ingrese su nombre completo: ");
        nombre = in.next();
        System.out.print("-ingrese su sexo (M,F): ");
        sexo = in.next().charAt(0);
        System.out.print("-ingrese su edad: ");
        edad = in.nextInt();
        System.out.print("-ingrese su salario: ");
        salario = in.nextDouble();
        System.out.print("-ingrese si tiene transporte (V = true, F = false): ");
        transporte = in.nextBoolean();
        
        //resultados
        System.out.println("sus datos personales son: ");
        System.out.println("-su nombre es: " + nombre);
        System.out.println("-su sexo es: " + sexo);
        System.out.println("-su edad es: " + edad);
        System.out.println("-su salario es: " + salario);
        System.out.println("-tiene transporte: " + transporte);
        System.out.println("muchas gracias");
        
     }
    
}
