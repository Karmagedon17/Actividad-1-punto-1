package ejercicio17;
import java.util.Scanner;
public class Ejercicio17 {
    public static void main(String[] args) {
        Double radio;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el radio de su circulo:");
        radio = entrada.nextDouble();
        System.out.println("El area del circulo es: "+radio*radio*Math.PI);        
        System.out.println("La longitud de la circunferencia es: "+radio*Math.PI);    
    }
    
}
