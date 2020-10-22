import java.util.Scanner;

public class EXE1142{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        int valor, valorTabela;
        valorTabela = 1;
        valor = teclado.nextInt();

        for(int i=1; i<=valor; i++){
            for(int j=1; j<=4; j++){
                if (j % 4 == 0){
                    System.out.print(" PUM\n");
                    valorTabela++;
                }
                else{
                    System.out.print(valorTabela + " ");
                    valorTabela++;
                }
            }
        }
    }
}