package gradosminutossegundos;

import java.util.Scanner;

public class GradosMinutosSegundos {

    public static void main(String[] args) {
        System.out.println("Programa que entrega un angulo con decimales en su forma con minutos y segundos: ");
        
        Scanner entrada = new Scanner(System.in);
        
        double ang = entrada.nextDouble();
        
        int grados = (int)Math.floor(ang);
        double rest1 = ang - grados;
        
        double min = (rest1*60);
        double minutos = Math.floor(min);
        
        double segundos = 60*(min-minutos);
        
        System.out.println("El angulo convertido es "+grados+" "+(int)minutos+"' "+segundos+"''");
    }
    
}
