package parimpar;

import java.util.Scanner;

public class ParImpar {

    public static void main(String[] args) {
        System.out.println("Programa que determina si un numero es par o impar:");
        
        Scanner entrada = new Scanner(System.in);
        int num;
        
        num = entrada.nextInt();
        
        if(num==0){//Se tomó en cuenta que el numero cero no es par ni impar para futuras eventualidades con el código.
            System.out.println("El numero es cero.");
        }
        else{
            if((Math.abs(num))%2 == 1){//Se usó el recurso de valor absoluto para incrementar la eficacia del algoritmo.
                System.out.println("El numero es impar.");
            }
            else{
                System.out.println("El numero es par.");
            }
        }
        
    }
    
}
