import java.util.Scanner;

public class AppConversor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a unidade a ser convertida [C, F, K, KM, MI, I]: ");
        String unidadeEntrada = sc.next().toUpperCase();

        System.out.print("Digite para qual unidade convertê-la [C, F, K, KM, MI, I]: ");
        String unidadeSaida = sc.next().toUpperCase();

        System.out.print("Digite o valor de entrada (em " + unidadeEntrada + "): ");
        double valorEntrada = sc.nextDouble();
        sc.close();

        String chave = unidadeEntrada + " to " + unidadeSaida;
        Conversor conv = ConversorFactory.getConversor(chave);

        if (conv == null) {
            System.out.println("Conversão não suportada: " + chave);
            return;
        }

        double valorSaida = conv.converte(valorEntrada);
        System.out.printf("%.2f%s -> %.2f%s\n", valorEntrada, unidadeEntrada, valorSaida, unidadeSaida);
    }
}
