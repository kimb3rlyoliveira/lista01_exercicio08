import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Variaves e Scanner.
        double salarioH;
        double salarioM;
        Scanner teclado = new Scanner(System.in);
        // Ação 1
        System.out.println("Quanto você ganha por hora?");
        salarioH = teclado.nextDouble();
        teclado.close();
        salarioM = (salarioH * 8) * 22;
        System.out.println("Seu salario mensal é R$:" + salarioM);
    }
}