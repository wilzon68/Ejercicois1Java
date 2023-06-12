package klase5;
import java.util.Scanner;
public class CAlculadoraPerruna {

            public static void main(String[] args) {
                Scanner entrada = new Scanner(System.in);
                System.out.print("Ingresa Años :");
                int edad = entrada.nextInt();
                int edadCan = (edad * 7);
                System.out.println("La Edad en Perruno es:" + edadCan +" Años");
            }

}
