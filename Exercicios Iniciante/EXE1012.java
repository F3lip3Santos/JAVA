
import java.util.Scanner;

public class EXE1012{
    public static void main (String args[]){
        double baseA, baseB, altura;
        double areaTri, areaC, areaTra, areaQ, areaR, pi;


        Scanner teclado;
        teclado = new Scanner(System.in);

        baseA = teclado.nextDouble();
        baseB = teclado.nextDouble();
        altura = teclado.nextDouble();
        pi = 3.14159;

        areaTri = (baseA * altura)/2;
        areaC = pi * (altura*altura);
        areaTra = (baseA + baseB)*altura/2;
        areaQ = (baseB * baseB);
        areaR = (baseA * baseB);

        System.out.printf("TRIANGULO: %.3f\n", areaTri);
        System.out.printf("CIRCULO: %.3f\n", areaC);
        System.out.printf("TRAPEZIO: %.3f\n", areaTra);
        System.out.printf("QUADRADO: %.3f\n", areaQ);
        System.out.printf("RETANGULO: %.3f\n", areaR);

        

    }

}