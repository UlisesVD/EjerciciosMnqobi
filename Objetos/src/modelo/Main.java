package modelo;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static Cubo cuadro = new Cubo();
    private static float lado;
    private static int seleccion;
    
    public static void main(String[] args) {
        pedirValor();
        boolean op = true;
        while (op) {            
            System.out.println("Valor ingresado "+lado);
            System.out.println("¿Que operacion desea realizar?");
            System.out.println("1.- Calcular Area de un cuadrado.");
            System.out.println("2.- Calcular Perimetro de un cuadrado.");
            System.out.println("3.- Calcular Volumen de un cubo.");
            System.out.println("4.- Calcular Pelrimetro de un cubo.");
            System.out.println("5.- Cancelar.");
            System.out.println("6.- Salir.");
            
            seleccion = sc.nextInt();
            switch(seleccion){
                case 1:
                    System.out.println("Area del cuadrado con lado " + lado +" = "+cuadro.calcularArea());
                    segundaPedida();
                    break;
                case 2:
                    System.out.println("Perimetro del cuadrado con lado "+ lado +" = "+cuadro.calcularPerimetro());
                    segundaPedida();
                    break;
                case 3:
                    System.out.println("Volumen del cubo con lado "+ lado +" = "+cuadro.calcularVolumen());
                    segundaPedida();
                    break;
                case 4:
                    System.out.println("Perimetro del cubo con lado"+ lado +" = "+cuadro.calcularPerimetroCubo());
                    segundaPedida();
                    break;
                case 5:
                    pedirValor();
                    break;
                case 6:
                    System.out.println("Gracias por usar la aplicacion");
                    op = false;
                    break;    
            }
        }
        
        
    }
    public static void pedirValor(){
        System.out.println("Dame un lado del cuadado: ");
        lado = sc.nextFloat();
        cuadro.setLado(lado);
        
    }
    
    public static void segundaPedida(){
        System.out.println("A hora ¿Que desea hacer?");
        System.out.println("1.- Volver al menu");
        System.out.println("2.- Salir al inicio");
        seleccion = sc.nextInt();
        if(seleccion == 2){pedirValor();}
    }
}
