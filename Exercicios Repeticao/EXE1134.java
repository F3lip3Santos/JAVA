import java.util.Scanner;

public class EXE1134{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        int combustivel, qtdAlcool, qtdGasolina, qtdDisel;
        qtdAlcool = 0;
        qtdGasolina = 0;
        qtdDisel = 0;
        
        do{
            combustivel = teclado.nextInt();

            if (combustivel == 1){
                qtdAlcool++;
            }
            else if (combustivel == 2){
                qtdGasolina++;
            }
            else if (combustivel == 3){
                qtdDisel++;
            }

        } while (combustivel != 4);

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " +qtdAlcool);
        System.out.println("Gasolina: " +qtdGasolina);
        System.out.println("Diesel: "+qtdDisel);

    }
}