package doscilindros;

public class DosCilindros {

    public static void main(String[] args) {
        System.out.println("Programa que el area total de dos cilindros de distintas dimensiones.");
        
        //declaramos las variables
        float R1, R2, L1, L2;
        double C1, C2;
        
        //Realizamos las operaciones
        R1 = 4;
        R2 = R1/2;
        L2 = 5;
        L1 = L2/2;
        
        C1 = 2*(3.14*Math.pow(R1, 2)) + (L1*2*3.14*R1);
        C2 = 2*(3.14*Math.pow(R2, 2)) + (L2*2*3.14*R2);
        
        //Mostramos resultados en la consola
        System.out.println("El area total del 1er cilindro es: "+C1);
        System.out.println("El area total del 2do cilindro es: "+C2);
    }
    
}
