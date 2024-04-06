package aleatorio;
import java.util.Random;//Se usará la librería especial Random.
public class Aleatorio {

    public static void main(String[] args) {
        System.out.println("Programa que arroja 4 numeros aleatorios y obtiene promedio, máximo y mínimo: ");
        
        Random random = new Random();
        //Establecemos el rango en que podrán variar los números aleatorios.
        int n1 = random.nextInt(101);
        int n2 = random.nextInt(101);
        int n3 = random.nextInt(101);
        int n4 = random.nextInt(101);
        
        //Calculamos el promedio.
        double prom = (n1+n2+n3+n4)/4;
        //Calculamos el mayor.
        int mayor = n1;
        if (n2 > mayor) {
            mayor = n2;
        }
        if (n3 > mayor) {
            mayor = n3;
        }
        if (n4 > mayor) {
            mayor = n4;
        }
        //Calculamos el menor.
        int menor = n1;
        if (n2 < menor) {
            menor = n2;
        }
        if (n3 < menor) {
            menor = n3;
        }
        if (n4 < menor) {
            menor = n4;
        }
        
        System.out.println("Los nnumeros son: ");
        System.out.println(n1+","+n2+","+n3+","+n4);
        
        System.out.println("Los resultados son: ");
        System.out.println(prom);
        System.out.println(mayor);
        System.out.println(menor);
    }
    
}
