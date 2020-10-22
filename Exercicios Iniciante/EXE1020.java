
import java.util.Scanner;

public class EXE1020{
    public static void main (String args[]){
        int idadeEmDias;
        int anos, meses, dias, resto;

        Scanner teclado;
        teclado = new Scanner(System.in);

        idadeEmDias = teclado.nextInt();
        anos = (idadeEmDias / 365);
        resto = (idadeEmDias % 365);
        meses = (resto / 30);
        dias = (resto % 30);

        System.out.println(anos + " ano(s)");  
        System.out.println(meses + " mes(es)");  
        System.out.println(dias + " dia(s)");  


    }

}