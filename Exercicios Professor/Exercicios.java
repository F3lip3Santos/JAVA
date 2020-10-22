import java.util.Scanner;

public class Exercicios{
    public static void main (String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        //MULTI VARIAVEIS
        float base, altura, area;

        //2B - AREA DE UM RETANGULO
      
        /*System.out.println("CALCULANDO AREA DE UM RETANGULO");
        System.out.println("Digite o valor da base");
        base = teclado.nextFloat();
        System.out.println("Digite agora o valor da altura: ");
        altura = teclado.nextFloat();
        area = base * altura;
        System.out.println("O valor da area do RETANGULO: " + area);*/

        //2C - AREA DE UM TRIANGULO
    
        /*System.out.println("CALCULANDO AREA DE UM TRIANGULO");
        System.out.println("Digite o valor da base");
        base = teclado.nextFloat();
        System.out.println("Digite agora o valor da altura: ");
        altura = teclado.nextFloat();
        area = (base * altura)/2;
        System.out.println("O valor da area do TRIANGULO: " + area);*/

        //2E - AREA DE UM TRAPEZIO
    
        float baseMaior, baseMenor, alturaTrapezio;

        System.out.println("CALCULANDO AREA DE UM TRAPEZIO");
        System.out.println("Digite o valor da base maior");
        baseMaior = teclado.nextFloat();
        System.out.println("Digite o valor da base menor");
        baseMenor = teclado.nextFloat();
        System.out.println("Digite agora o valor da altura: ");
        alturaTrapezio = teclado.nextFloat();
        area = (baseMaior + baseMenor)*alturaTrapezio/2;
        System.out.printf("Valores area  %.3f \n", area);


    }

}