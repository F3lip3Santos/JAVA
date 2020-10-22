import java.util.Scanner;

public class EXE1064 {
    public static void main(String arg[]){

        float valor, soma, med;
        int qtdPositivo=0;

        Scanner teclado;
        teclado = new Scanner(System.in);

        soma = 0;
        for (int i=1; i<=6;i++){
            valor = teclado.nextFloat();
            if (valor >0){
                qtdPositivo++;
                soma+=valor;
            }
        }
        med = soma/qtdPositivo;
        System.out.println(qtdPositivo+" valores positivos");
        System.out.printf("%.1f\n",med);


    }
}