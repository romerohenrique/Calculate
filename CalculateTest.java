
import java.util.Scanner;

public class CalculateTest {
    public static void main(String[] args) {
        /**
         * Calculadora:
         * Classe Calculate: Variáveis e metodos de calculos
         * Classe CNegocio: faz interação entre o usuário e os métodos e atributos da Classe Calculate.
         */

        Calculate calc = new Calculate();
        Scanner scanner = new Scanner(System.in);
        CNegocio negocio = new CNegocio();

        negocio.apresentar();
        int opc = scanner.nextInt();

        if (opc == 1) {
            negocio.somarDoisnumeros();
        } else if (opc == 2) {
            negocio.subtrairDoisNumeros();
        } else if (opc == 3) {
            negocio.dividirDoisNumero();
        } else if (opc == 4) {
            negocio.multiplicarDoisNumeros();
        } else {
            System.out.println("Opção Inválida");
        }
    }
}
