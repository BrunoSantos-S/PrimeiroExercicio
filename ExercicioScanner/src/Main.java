import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String seuNome;
        int suaIdade, tempoIdade;
        double suaAltura, alturaEmCm;


        // Nome do usuário
        System.out.print("Digite o seu nome: ");
        seuNome = scanner.nextLine();

        // Idade atual do usuário
        System.out.print("Digite sua idade: ");
        suaIdade = scanner.nextInt();

        // Altura do usuário em metros
        System.out.print("Digite sua altura em metros: ");
        suaAltura = scanner.nextDouble();

        // Cálculo da idade para 50 anos e conversão de altura para centímetros
        tempoIdade = 50 - suaIdade;
        alturaEmCm = suaAltura * 100;

        // Mostrar os resultados
        System.out.println("\nOlá, " + seuNome + "!");
        System.out.println("Em " + tempoIdade + " anos, você terá 50 anos.");
        System.out.println("Sua altura em centímetros é " + alturaEmCm + " cm.");

        scanner.close();
    }
}