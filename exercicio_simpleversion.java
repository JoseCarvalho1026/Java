/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author enta
 */
public class JavaApplication2 {

    private static int div3;
    private static int div7;
    private static int par;
    private static int impar;
    private static int total;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        limpar();
        for (int i = 50; i < 101; i++) {
            calcular(i);

            //  System.out.println("Hello " + i + "total=" + total++);
        }
        System.out.printf("Total= %d Divisiveis por 3 = %d Divisiveis por 7 = %d Pares = %d Impares = %d\n", total, div3, div7, par, impar);

        limpar();
        int i = 50;
        do {
            calcular(i);
            i++;

        } while (i < 101);
        System.out.printf("Total= %d Divisiveis por 3 = %d Divisiveis por 7 = %d Pares = %d Impares = %d\n", total, div3, div7, par, impar);

        limpar();
        i = 50;
        while (i < 101) {
            calcular(i);
            i++;
        }
        System.out.printf("Total= %d Divisiveis por 3 = %d Divisiveis por 7 = %d Pares = %d Impares = %d\n", total, div3, div7, par, impar);

    }

    private static void limpar() {
        total = 0;
        div3 = 0;
        div7 = 0;
        par = 0;
        impar = 0;
    }

    private static void calcular(int i) {
        total += i;
        i++;
        if (i % 3 == 0) {
            div3++;

        }
        if (i % 7 == 0) {
            div7++;

        }
        if (i % 2 == 0) {
            par++;
        } else {
            impar++;
        }
    }

}
