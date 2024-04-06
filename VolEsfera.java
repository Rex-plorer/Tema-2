package volesfera;

import java.util.Scanner;

public class VolEsfera {

    public static void main(String[] args) {
        System.out.println("Programa que calcula el volumen de una esfera mediante su radio.");
        
        Scanner entrada = new Scanner(System.in);
        double R, resul;
        R = entrada.nextDouble();
        
        resul = (4/3)*(Math.PI*Math.pow(R, 3));//Se usó el recurso de la biblioteca de Java, Math.PI
        
        System.out.println("El volumen de la esfera es: "+resul);
    }
    
}
