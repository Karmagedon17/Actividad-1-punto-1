package ejercicio4;
import java.util.Scanner;
public class Ejercicio4 {
    
    public static void main(String[] args) {
        int edad_juan;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la edad de juan: ");
        edad_juan = entrada.nextInt();
        System.out.println("La edad de Juan es: "+(edad_juan)+"años");
        System.out.println("La edad de Alberto es: "+(edad_juan*2/3)+"años");
        System.out.println("La edad de Ana es: "+(edad_juan*4/3)+"años");
        System.out.println("Y la edad de la Mamá es: "+(edad_juan*4/3+edad_juan*2/3+edad_juan)+"años");
    }
    
}
