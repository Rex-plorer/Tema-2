package areacirculo;

import java.util.Scanner;

public class AreaCirculo {

    public static void main(String[] args) {
        System.out.println("Programa que calcula el area de un circulo por medio de su radio. ");
        
        Scanner entrada = new Scanner(System.in);
        double R, resul;
        
        R = entrada.nextDouble();
        
        resul = (Math.PI)*Math.pow(R, 2);
        
        System.out.println("El area del circulo es: "+resul);
    }
    
}
