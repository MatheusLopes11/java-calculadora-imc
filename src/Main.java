import java.util.*;

public class Main {

    public static void main (String[] args) {

        Locale.setDefault(Locale.US);

        Scanner entrada = new Scanner(System.in);

        System.out.println("------------------");
        System.out.println("CALCULADORA DE IMC");
        System.out.println("------------------\n");

        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();
        System.out.println();

        System.out.printf("Olá %s! Bora calcular o seu IMC?\n\n", nome);

        System.out.println("Primeiro, digite o seu peso em kg: \n");
        double peso = entrada.nextDouble();
        System.out.println();

        System.out.println("Beleza, agora digita a sua altura em metros: \n");
        double altura = entrada.nextDouble();
        System.out.println();

        System.out.println("Processando... \n");

        double imc = peso / (Math.pow(altura, 2));

        System.out.printf("Resultado: ≈ %.2f kg/m²", imc);

        entrada.close();

    }

}
