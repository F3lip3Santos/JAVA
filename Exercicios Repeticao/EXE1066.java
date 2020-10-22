import java.util.Scanner;

public class EXE1066 {
    public static void main(String arg[]){

        int valor;
        int qtdPares, qtdImpar, qtdPositivo, qtdNegativo;

        qtdPares = 0;
        qtdImpar = 0;
        qtdPositivo = 0;
        qtdNegativo = 0;

        Scanner teclado;
        teclado = new Scanner(System.in);

        for (int i=1; i<=5;i++){
            valor = teclado.nextInt();
            if (valor > 0 && valor != 0){
                qtdPositivo++;
            }
            else if (valor < 0 && valor != 0){
                qtdNegativo++;
            }
            if (valor % 2 == 0){
                qtdPares++;
            }
            else{
                qtdImpar++;
            }
        }
        System.out.println(qtdPares+" valor(es) par(es)");
        System.out.println(qtdImpar+" valor(es) impar(es)");
        System.out.println(qtdPositivo+" valor(es) positivo(s)");
        System.out.println(qtdNegativo+" valor(es) negativo(s)");


    }
}