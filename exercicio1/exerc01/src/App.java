import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        Double nota1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota: ");
        Double nota2 = scanner.nextDouble();
        Double media = (nota1 + nota2)/2;
        System.out.println("Sua media e: " + media);
        scanner.close();
    }
}
