
import java.util.Scanner;

public class EXE1017{
    public static void main (String args[]){
       int tempo, velocidade;
       float consumo;

        Scanner teclado;
        teclado = new Scanner(System.in);

        tempo = teclado.nextInt();
        velocidade = teclado.nextInt();
      
        consumo = (float)((tempo*velocidade))/12;

        System.out.printf("%.3f\n",consumo);  

    }

}