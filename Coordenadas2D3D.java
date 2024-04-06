package coordenadas2d3d;

import java.util.Scanner;

public class Coordenadas2D3D {

    public static void main(String[] args) {
        System.out.println("Programa que calcula la distancia entre dos puntos en el plano y dos puntos en el espacio.");
        
        Scanner entrada = new Scanner(System.in);
        //Se priorizará el ahorro de líneas al declarar directamente las variables a la vez que se les asigna un valor.
        System.out.println("Se procede a calcular la distancia en el plano: ");
        System.out.println("Ingrese X1: ");
        double A1 = entrada.nextDouble();
        System.out.println("Ingrese X2: ");
        double A2 = entrada.nextDouble();
        System.out.println("Ingrese Y1: ");
        double B1 = entrada.nextDouble();
        System.out.println("Ingrese Y2: ");
        double B2 = entrada.nextDouble();
        
        double resulP = Math.sqrt(Math.pow((A2-A1), 2)+Math.pow((B2-B1), 2));
        
        System.out.println("Ahora calcularemos la distancia en el espacio: ");
        System.out.println("Ingrese X1: ");
        double X1 = entrada.nextDouble();
        System.out.println("Ingrese X2: ");
        double X2 = entrada.nextDouble();
        System.out.println("Ingrese Y1: ");
        double Y1 = entrada.nextDouble();
        System.out.println("Ingrese Y2: ");
        double Y2 = entrada.nextDouble();
        System.out.println("Ingrese Z1: ");
        double Z1 = entrada.nextDouble();
        System.out.println("Ingrese Z2: ");
        double Z2 = entrada.nextDouble();
        
        double resulE = Math.sqrt(Math.pow((X2-X1), 2)+Math.pow((Y2-Y1), 2)+Math.pow((Z2-Z1), 2));
        
        System.out.println("La distancia de los puntos en el plano es: "+resulP);
        System.out.println("La distancia de los puntos en el espacio es: "+resulE);
    }
    
}
