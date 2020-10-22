
import java.util.Scanner;

public class EXE1043{
    public static void main (String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        float a, b, c, perimetro, soma, area;

        a = teclado.nextFloat();
        b = teclado.nextFloat();
        c = teclado.nextFloat();
       
        if (((a + b) > c) && ((b + c) > a) && ((a + c) > b)){
            perimetro = a + b + c;
            System.out.printf("Perimetro = %.1f\n",perimetro);  
        }
        else{
            area = (a + b)*c/2;
            System.out.printf("Area = %.1f\n",area);  
        }

    }

}