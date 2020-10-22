
import java.util.Scanner;

public class EXE1007{
    public static void main (String args[]){
        int a,b,c,d,dif;
        Scanner teclado;
        teclado = new Scanner(System.in);

        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();
        d = teclado.nextInt();

        dif = ((a * b) - (c * d));

        System.out.println("DIFERENCA = " + dif);

    }

}