package ejercicio14;
import java.util.Scanner;
public class Ejercicio14 {
        
    public static void main(String[] args) {
        Scanner escaneo = new Scanner(System.in);
        int numero;
        System.out.println("Digite su número:");
        numero = escaneo.nextInt();
        System.out.println("Su número al cuadrado: "+(numero*numero));
        System.out.println("Su número al cubo: "+(numero*numero*numero));
    }
    
}
