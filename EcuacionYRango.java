package ecuacionyrango;
import java.util.Scanner;
public class EcuacionYRango {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double x, y;
        System.out.println("Programa que determina si el resultado de la ecuacion del numero ingresado se encuentra en el rango de -1 a 1.");
        System.out.print("Digite un nmuero a evaluar: ");
         x = entrada.nextInt();
        if(x != 0){
             y = (2*Math.pow(x, -3)+5*Math.pow(x, 2)-8*x)/(Math.sqrt(9*Math.pow(x, 3)-2*Math.pow(x, 2)+x));
             System.out.println("El numero es "+y);

             if((y<1)&&(-1<y)){
                 System.out.println("El numero se encuentra dentro del rango.");
             }
             else{
                 System.out.println("El numero está fuera del rango.");
             }
        }
        else{
            System.out.println("El numero resultado está fuera de los numeros reales.");
        }
    }
}
