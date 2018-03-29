package modelo;

import java.util.Locale;
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numeroNormal = 0;
        
        
        try {
            System.out.println("Ingrese un numero entre 1 y 1000");
            numeroNormal = sc.nextInt();
            if (numeroNormal < 1001 && numeroNormal > 0) {
                System.out.println("El numero en romano se expresa: "+ convertToRoman(numeroNormal));
            } else {
                System.out.println("El numero debe ser mayor a cero y menor a 1001");
            }
            
        } catch (Exception e) {
            System.out.println("El programa solo convierte numeros");
        }
        
    }
    
    public static String convertToRoman(int numero){
        int centenas, decenas, unidades;
        centenas = numero / 100 % 10;
        decenas = numero / 10 % 10;
        unidades = numero % 10;
        
        String cadena = "";
        //Operacion para el valor maximo(1000)
        if (numero == 1000) {
            cadena += "M";
        }
        //Operacion para las centenas 
        if (centenas == 9) {
            cadena += "CM";
        } else if (centenas >= 5) {
            cadena += "D";
            for (int i = 6; i <= centenas; i++) {
                cadena += "C";
            }
        } else if (centenas == 4) {
            cadena += "CD";
        } else {
            for (int i = 1; i <= centenas; i++) {
                cadena += "C";
            }
        }   
        //Operacion para las decenas
        if (decenas == 9) {
            cadena += "XC";
        } else if (decenas >= 5) {
            cadena += "L";
            for (int i = 6; i <= decenas; i++) {
                cadena += "X";
            }
        } else if (decenas == 4) {
            cadena += "XL";
        } else {
            for (int i = 1; i <= decenas; i++) {
                cadena += "X";
            }
        }  
        //Operacion para las unidades
        if (unidades == 9) {
            cadena += "IX";
        } else if (unidades >= 5) {
            cadena += "V";
            for (int i = 6; i <= unidades; i++) {
                cadena += "I";
            }
       } else if (unidades == 4) {
           cadena += "IV";
       } else {
           for (int i = 1; i <= unidades; i++) {
               cadena += "I";
           }
       }        
        return cadena;
    }
}
