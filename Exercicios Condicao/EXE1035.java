
import java.util.Scanner;

public class EXE1035{
    public static void main (String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        int a,b,c,d,soma1,soma2;

        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();
        d = teclado.nextInt();

        soma1 = c + d;
        soma2 = a + b;

        if (((b > c && d > a) && (soma1 > soma2)) && ((c > 0 && d > 0) && (a % 2 == 0))){
            System.out.println("Valores aceitos");  
        }
        else{
            System.out.println("Valores nao aceitos");  
        }

    }

}