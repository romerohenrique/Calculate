
import java.util.Scanner;

public class CalculateTest {
    public static void main(String[] args) {

        Calculate calc = new Calculate();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecione a opçao");
        System.out.println("Somar, digie: 1");
        System.out.println("Subtrair, digite: 2");
        System.out.println("Dividir, digite: 3");
        System.out.println("Multiplcar, digite: 4");
        System.out.println("___________________________");
        System.out.println("digite a opção: ");
        int opc = scanner.nextInt();

        if (opc == 1) {
            System.out.println("Soma");
            System.out.println("1º numero: ");
            calc.num1 = scanner.nextInt();
            System.out.println("2º numero: ");
            calc.num2 = scanner.nextInt();
            calc.somar(calc.num1, calc.num2);
        } else if (opc == 2) {
            System.out.println("Subtração");
            System.out.println("1º numero: ");
            calc.num1 = scanner.nextInt();
            System.out.println("2º numero: ");
            calc.num2 = scanner.nextInt();
            calc.subtrair(calc.num1, calc.num2);
        } else if (opc == 3) {
            System.out.println("Divisão");
            System.out.println("1º numero: ");
            calc.num1 = scanner.nextInt();
            System.out.println("2º numero: ");
            calc.num2 = scanner.nextInt();
            calc.dividir(calc.num1, calc.num2);
        } else if (opc == 4) {
            System.out.println("Multiplicação");
            System.out.println("1º numero: ");
            calc.num1 = scanner.nextInt();
            System.out.println("2º numero: ");
            calc.num2 = scanner.nextInt();
            calc.multiplicar(calc.num1, calc.num2);
        } else {
            System.out.println("Opção inválida");
        }
    }
}
