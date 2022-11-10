//Distancia de los dos puntos

package modelo;

import java.util.Scanner;
public class Coodenada {
    public static void main(String[] args) {
        Scanner Temp = new Scanner(System.in);
        int x1;
        int x2;
        int y1;
        int y2;
        int x;
        int y;
        double Distancia_Resultante;

        System.out.print("Introduzca los valores de las coordenadas del primer punto : ");
        x1 = Temp.nextInt();
        y1 = Temp.nextInt();
        System.out.print("Introduzca los valores de las coordenadas del segundo punto : ");
        x2 = Temp.nextInt();
        y2 = Temp.nextInt();

        x = x2-x1;
        y = y2-y1;
        Distancia_Resultante = Math.sqrt(x*x + y*y);

        System.out.println("La distancia entre los dos puntos es : " + Distancia_Resultante);
    }
}