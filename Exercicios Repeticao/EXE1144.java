import java.util.Scanner;

public class EXE1144{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        int linhas, quadrado, cubo;

        linhas = teclado.nextInt();

        for(int i=1; i<=linhas; i++){
            quadrado =i*i;
            cubo = (i*i)*i;
            System.out.println(i + " "+ quadrado + " " + cubo);  
            System.out.println(i + " "+ (quadrado+1) + " " + (cubo+1));  
       
        }
    }
}