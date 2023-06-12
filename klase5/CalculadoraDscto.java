package klase5;
import java.util.Scanner;
public class CalculadoraDscto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese Precio del Producto:");
        float producto = entrada.nextFloat();
        System.out.print("Ingrese porcentaje de Descuento:");
        int porcentaje = entrada.nextInt();
        float precio_final = producto - (producto*porcentaje/100);
        System.out.println("Precio Final: "+precio_final);
    }
}
