import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o número a obter a tabela de múltiplos");
        int numeroMultiplicado = scanner.nextInt();

        int[] tabelaQuantidade = new int[10];
        System.out.println("\nTabela de multiplicação de " + numeroMultiplicado + ", de 1 a 10:");
        
        for (int i = 0; i <= tabelaQuantidade.length; i++) {
        System.out.println(numeroMultiplicado * i);
        }
        
    }
}
