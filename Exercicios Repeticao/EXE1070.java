import java.util.Scanner;

public class EXE1070{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        int valor, count;
        
        valor = teclado.nextInt();
        count = 0;

        while (count < 6){
            if (valor % 2 !=0){
                System.out.println(valor);
                count++;
            }
            valor++;
        }
    }
}