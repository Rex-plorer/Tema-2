package maquinadesencillo;
import java.util.Scanner;
public class MaquinaDeSencillo {

    public static void main(String[] args) {
        System.out.println("Programa que segmenta una cantidad de dinero en billetes y monedas: ");
        Scanner entrada = new Scanner(System.in);
        
        double cantidad = entrada.nextDouble();
	int B200, B100, B50, B20, B10, B5, B2, B1;
	int C200, C100, C50, C20, C10, C5, C2, C1;
        int C_5, C_2;
        double Cent;
        int B_5, B_2, B_1;
	
	B200 = (int)Math.floor(cantidad)/200;
	C200 = (int)Math.floor(cantidad)%200;
	
	B100 = (int)Math.floor(C200)/100;
	C100 = (int)Math.floor(C200)%100;
	
	B50 = (int)Math.floor(C100)/50;
	C50 = (int)Math.floor(C100)%50;
	
	B20 = (int)Math.floor(C50)/20;
	C20 = (int)Math.floor(C50)%20;
	
	B10 = (int)Math.floor(C20)/10;
	C10 = (int)Math.floor(C20)%10;
	
	B5 = (int)Math.floor(C10)/5;
	C5 = (int)Math.floor(C10)%5;
	
	B2 = (int)Math.floor(C5)/2;
	C2 = (int)Math.floor(C5)%2;
	
	B1 = (int)Math.floor(C2)/1;
        
        Cent = (cantidad - Math.floor(cantidad))*10;
        B_5 = (int)Cent/5;
	C_5 = (int)Cent%5;
	
	B_2 = C_5/2;
	B_1 = C_5%2;
        	
        System.out.println("Su dinero ha sido ordenado en: ");
        System.out.println("Billetes de S/ 200: "+B200);
        System.out.println("Billeres de S/ 100: "+B100);
        System.out.println("Billetes de S/ 50: "+B50);
        System.out.println("Billetes de S/ 20: "+B20);
        System.out.println("Billetes de S/ 10: "+B10);
        System.out.println("Monedas de S/ 5: "+B5);
        System.out.println("Monedas de S/ 2: "+B2);
        System.out.println("Monedas de S/1: "+B1);
        System.out.println("Monedas de S/ 0.50: "+B_5);
        System.out.println("Monedas de S/ 0.20: "+B_2);
        System.out.println("Monedas de S/ 0.10: "+B_1);
    }
    
}
