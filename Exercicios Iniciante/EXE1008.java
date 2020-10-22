
import java.util.Scanner;

public class EXE1008{
    public static void main (String args[]){
        int numFun, numHoras;
        float valorReceb, valorHoras;

        Scanner teclado;
        teclado = new Scanner(System.in);

        numFun = teclado.nextInt();
        numHoras = teclado.nextInt();
        valorHoras = teclado.nextFloat();
       

        valorReceb = (float)numHoras * valorHoras;

        System.out.println("NUMBER = " + numFun);
        System.out.printf("SALARY = U$ %.2f\n ", valorReceb);
        

    }

}