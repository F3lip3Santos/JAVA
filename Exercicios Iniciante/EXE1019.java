
import java.util.Scanner;

public class EXE1019{
    public static void main (String args[]){
       int valor,horas,minutos,segundos,resto;

        Scanner teclado;
        teclado = new Scanner(System.in);

        valor = teclado.nextInt();
      
        horas = (valor / 3600);
        resto = (valor % 3600);
        minutos = (resto / 60);
        segundos = (valor % 60);

        System.out.println(horas+":"+minutos+":"+segundos);  

    }

}