
package ejercicio12;


public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int horas,valor_horas;
        double fuente,salario,salario_neto,retencion_final;
        
        horas = 48;
        valor_horas = 5000;
        fuente = 0.125;
        salario = horas*valor_horas;
        retencion_final = salario*fuente;
        salario_neto = salario-retencion_final;

        System.out.println("Salario Bruto: "+salario);
        System.out.println("Retención en la fuente: "+retencion_final);
        System.out.println("Salario Neto: "+salario_neto);
    }
    
}
