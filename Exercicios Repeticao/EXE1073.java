import java.util.Scanner;

public class EXE1073{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        int valor, count;

        count = 1;
        valor = teclado.nextInt();

        while (count <= valor){
            if ((count % 2) == 0){
                System.out.println(count+"^2 = " + count*count);
            }
            count++;
        }
    }

}