import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite sua altura (em metros): ");
        double altura = scanner.nextDouble();

        System.out.print("Digite seu peso (em kg): ");
        double peso = scanner.nextDouble();

        // Cálculo do IMC
        double imc = peso / (altura * altura);

        System.out.printf("Seu IMC é: %.2f\n", imc);

        // Verificação da categoria
        if (imc <= 18.5) {
            System.out.println("Classificação: Abaixo do peso");
        } else if (imc <= 24.9) {
            System.out.println("Classificação: Peso ideal");
        } else if (imc <= 29.9) {
            System.out.println("Classificação: Levemente acima do peso");
        } else if (imc <= 34.9) {
            System.out.println("Classificação: Obesidade Grau I");
        } else if (imc <= 39.9) {
            System.out.println("Classificação: Obesidade Grau II (Severa)");
        } else {
            System.out.println("Classificação: Obesidade Grau III (Mórbida)");
        }

        scanner.close();
    }
}