
import java.util.Scanner;

public class EXE1001{
    public static void main (String args[]){
        int a,b,x;
        Scanner teclado;
        teclado = new Scanner(System.in);

        a = teclado.nextInt();
        b = teclado.nextInt();
        x = a + b;

        System.out.println("X = " + x);

    }

}