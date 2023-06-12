package klase5;
import java.util.Scanner;
public class MillasMetros {
    public static void main(String[] args) {

            Scanner entrada = new Scanner(System.in);
            System.out.print("Ingresa Distancia en Millas:");
            int millas = entrada.nextInt();
            int metros = (int) (millas/1.61);
            System.out.println(millas +" Millas, son: "+metros + " Metros");

    }
}
