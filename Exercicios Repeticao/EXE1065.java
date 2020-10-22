import java.util.Scanner;

public class EXE1065 {
    public static void main(String arg[]){

        float valor;
        int qtdPares=0;

        Scanner teclado;
        teclado = new Scanner(System.in);
        
        for (int i=1; i<=5;i++){
            valor = teclado.nextFloat();
            if (valor % 2 == 0){
                qtdPares++;
            }
        }
        System.out.println(qtdPares+" valores pares");


    }
}