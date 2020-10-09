import java.util.Scanner;

public class CNegocio {
    /**
     * Utilizei o os objetos : Scanner e Calculate
     * cirando todas as regras de acesso para a calculadora.
     */
    Scanner scn = new Scanner(System.in);
    Calculate calcN = new Calculate();


    public void somarDoisnumeros() {
        System.out.println("Soma");
        System.out.println("1º numero: ");
        calcN.num1 = scn.nextInt();
        System.out.println("2º numero: ");
        calcN.num2 = scn.nextInt();
        calcN.somar(calcN.num1, calcN.num2);
    }


    public void dividirDoisNumero() {
        System.out.println("Dividir");
        System.out.println("1º numero: ");
        calcN.num1 = scn.nextInt();
        System.out.println("2º numero: ");
        calcN.num2 = scn.nextInt();
        calcN.dividir(calcN.num1, calcN.num2);
    }

    public void subtrairDoisNumeros() {
        System.out.println("Subtrair");
        System.out.println("1º numero: ");
        calcN.num1 = scn.nextInt();
        System.out.println("2º numero: ");
        calcN.num2 = scn.nextInt();
        calcN.subtrair(calcN.num1, calcN.num2);
    }

    public void multiplicarDoisNumeros() {
        System.out.println("Multiplicar");
        System.out.println("1º numero: ");
        calcN.num1 = scn.nextInt();
        System.out.println("2º numero: ");
        calcN.num2 = scn.nextInt();
        calcN.multiplicar(calcN.num1, calcN.num2);
    }

}

