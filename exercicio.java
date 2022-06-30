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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int total = 0;
        int div3 = 0;
        int div7 = 0;
        int par = 0;
        int impar = 0;

        for (int i = 50; i < 101; i++) {
            total += i;
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

            //  System.out.println("Hello " + i + "total=" + total++);
        }
        System.out.printf("Total= %d Divisiveis por 3 = %d Divisiveis por 7 = %d Pares = %d Impares = %d\n", total, div3, div7, par, impar);

        total = 0;
        div3 = 0;
        div7 = 0;
        par = 0;
        impar = 0;
        int i = 50;
        do {
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

        } while (i < 101);
        System.out.printf("Total= %d Divisiveis por 3 = %d Divisiveis por 7 = %d Pares = %d Impares = %d\n", total, div3, div7, par, impar);

        total = 0;
        div3 = 0;
        div7 = 0;
        par = 0;
        impar = 0;
        i = 50;
        while (i < 101) {
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
        System.out.printf("Total= %d Divisiveis por 3 = %d Divisiveis por 7 = %d Pares = %d Impares = %d\n", total, div3, div7, par, impar);

    }

}
