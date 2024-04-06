package sumacubos;

import java.util.Scanner;

public class SumaCubos {

    public static void main(String[] args) {
        System.out.println("Programa que calcula la suma de cubos de los 1ros n numeros naturales.");
        Scanner entrada = new Scanner(System.in);
        
        int n;
        double resul;
        n= entrada.nextInt();
        
        resul = Math.pow((n*(n+1)), 2)/4;
        
        System.out.println("El resultado es: "+resul);
    }
    
}
