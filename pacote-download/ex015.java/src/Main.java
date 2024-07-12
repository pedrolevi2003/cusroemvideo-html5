// EXERCÍCIO 015 - LISTA 01
/* O número 3025 possui a seguinte característica: 30 + 25 = 55 => 55*55 = 3025. Fazer um
programa para ler um número inteiro de 4 dígitos e verificar se ele possui essa propriedade.
Imprima a primeira parte do número, a segunda parte e o valor da multiplicação. Caso o
usuário digite um número que não tenha 4 dígitos, apresente uma mensagem de erro. */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numero, a1, a2;

        System.out.println("Digite um número de 4 algarismos: ");
        numero = teclado.nextInt();

        if (numero <= 999 || numero >= 10000)
            System.out.println("O número digitado não possui 4 dígitos.");
        else {
            a1 = (numero / 100);
            a2 = numero % 100;
            System.out.printf("Primeira parte: %d \nSegunda parte: %d \nProduto: %d", a1, a2, (a1 + a2) * (a1 + a2) );
        }


    }
}