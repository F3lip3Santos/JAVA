
import java.util.Scanner;

public class EXE1046{
    public static void main (String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        int horaIni, horaFim, result;

        horaIni = teclado.nextInt();
        horaFim = teclado.nextInt();
       
        result = horaFim - horaIni;

        if (result <= 0){
           result = result + 24;
           
        }
        System.out.println("O JOGO DUROU " + result + " HORA(S)");  
           
           
        

    }

}