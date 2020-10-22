
import java.util.Scanner;

public class EXE1048{
    public static void main (String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        float salario, novoSal, reajuste;

        salario = teclado.nextFloat();
      

        if (salario >= 0 && salario <= 400.00f){
            novoSal = salario + (salario*0.15f);
            reajuste = (salario*0.15f);
            System.out.printf("Novo salario: %.2f\n",novoSal);  
            System.out.printf("Reajuste ganho: %.2f\n",reajuste);  
            System.out.println("Em percentual: 15 %");  
        }
        else if (salario > 400.00f && salario <= 800.00f) {
            novoSal = salario + (salario*0.12f);
            reajuste = (salario*0.12f);
            System.out.printf("Novo salario: %.2f\n",novoSal);  
            System.out.printf("Reajuste ganho: %.2f\n",reajuste);  
            System.out.println("Em percentual: 12 %"); 
        }
        else if (salario > 800.00f && salario <= 1200.00f) {
            novoSal = salario + (salario*0.10f);
            reajuste = (salario*0.10f);
            System.out.printf("Novo salario: %.2f\n",novoSal);  
            System.out.printf("Reajuste ganho: %.2f\n",reajuste);  
            System.out.println("Em percentual: 10 %"); 
        }
        else if (salario > 1200.00f && salario <= 2000.00f) {
            novoSal = salario + (salario*0.07f);
            reajuste = (salario*0.07f);
            System.out.printf("Novo salario: %.2f\n",novoSal);  
            System.out.printf("Reajuste ganho: %.2f\n",reajuste);  
            System.out.println("Em percentual: 7 %"); 
        }
        else if (salario > 2000.00f) {
            novoSal = salario + (salario*0.04f);
            reajuste = (salario*0.04f);
            System.out.printf("Novo salario: %.2f\n",novoSal);  
            System.out.printf("Reajuste ganho: %.2f\n",reajuste);  
            System.out.println("Em percentual: 4 %"); 
        }
        
    }

}