
import java.util.Scanner;

public class EXE1038{
    public static void main (String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        int qtd, codigo;
        float total;

        codigo = teclado.nextInt();
        qtd = teclado.nextInt();
       

        if (codigo == 1){
            total = qtd * 4.0f;
        }
        else if (codigo == 2){
            total = qtd * 4.5f;
        }
        else if (codigo == 3){
            total = qtd * 5.0f;
        }
        else if (codigo == 4){
            total = qtd * 2.0f; 
        }
        else{
            total = qtd * 1.50f; 
        }
    
        System.out.printf("Total: R$ %.2f\n", total);  

    }

}