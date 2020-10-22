
import java.util.Scanner;

public class EXE1014{
    public static void main (String args[]){
       int distancia;
       float combustivel, consumo;


        Scanner teclado;
        teclado = new Scanner(System.in);

        distancia = teclado.nextInt();
        combustivel = teclado.nextFloat();
      
        consumo = distancia/combustivel;

        System.out.printf("%.3f km/l\n",consumo);  

    }

}