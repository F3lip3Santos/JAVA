import java.util.Scanner;

public class EXE1142v2{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        int valor, valorTabela;
        valorTabela = 1;
        valor = teclado.nextInt();

        for(int i=1; i<=4*valor; i++){
            if (i % 4 != 0){
                System.out.print(i + " ");
            }
            else{
                System.out.print("PUM\n");
            }    
        }
    }
}