
import java.util.Scanner;

public class EXE1006{
    public static void main (String args[]){
        double a,b,c,m;
        Scanner teclado;
        teclado = new Scanner(System.in);

        a = teclado.nextDouble()*2;
        b = teclado.nextDouble()*3;
        c = teclado.nextDouble()*5;

        m = (a+b+c)/10;

        System.out.printf("MEDIA = %.1f\n", m);

    }

}