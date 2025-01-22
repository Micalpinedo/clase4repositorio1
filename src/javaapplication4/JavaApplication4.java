/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author Mical Pinedo
 */
import java.util.Scanner;
public class JavaApplication4 {

    public static void main(String[] args) {
        // Declarar variable
        int n1,n2,n3,suma;
        Scanner lectura = new Scanner (System.in);
        System.out.print("Ingresar Numero 1:");
        n1=lectura.nextInt();
        System.out.print("Ingresar Numero 2:");
        n2=lectura.nextInt();
        System.out.print("Ingresar Numero 3:");
        n3=lectura.nextInt();
        
        //proceso de datos 
        suma=n1+n2+n3;
        //Salida de datos
        System.out.print("La suma de los nuúmeroses:"+suma);
    }
    
}
