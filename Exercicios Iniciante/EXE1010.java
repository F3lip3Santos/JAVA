
import java.util.Scanner;

public class EXE1010{
    public static void main (String args[]){
        int codPeca1, numPeca1, codPeca2, numPeca2;
        double valorPeca1, valorPeca2, valorPagar;
        

        Scanner teclado;
        teclado = new Scanner(System.in);

        
        codPeca1 = teclado.nextInt();
        numPeca1 = teclado.nextInt();
        valorPeca1 = teclado.nextDouble();

        codPeca2 = teclado.nextInt();
        numPeca2 = teclado.nextInt();
        valorPeca2 = teclado.nextDouble();

        valorPagar = ((double)numPeca1 * valorPeca1) + ((double)numPeca2 * valorPeca2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorPagar);
        

    }

}