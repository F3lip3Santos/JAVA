import java.util.Scanner;

public class EXE1143{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        int linhas, valorTabela;
        valorTabela = 1;
        linhas = teclado.nextInt();

        for(int i=1; i<=linhas; i++){
            System.out.println(i + " "+ (i*i) + " " + ((i*i)*i)) ;  
        }
    }
}