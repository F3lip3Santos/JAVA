
import java.util.Scanner;

public class EXE1005{
    public static void main (String args[]){
        double a,b,m;
        Scanner teclado;
        teclado = new Scanner(System.in);

        a = teclado.nextDouble();
        b = teclado.nextDouble();
        m = (((a*3.5)+(b*7.5))/11);

        System.out.printf("MEDIA = %.5f\n", m);

    }

}