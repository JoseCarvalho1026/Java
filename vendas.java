/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author enta
 */
public class JavaApplication3 {

    public static void main(String[] args) {
        String ilhas[] = {"Terceira", "Graciosa", "São Jorge", "Pico", "Faial"};
        int vendas[] = {10, 20, 30, 40, 50};
        for (int i = 0; i < vendas.length; i++) {
            System.out.println(ilhas[i] + ":" + vendas[i]);
        }

        int i = 0;
        while (i < vendas.length) {
            System.out.println(ilhas[i] + ":" + vendas[i]);
            i++;
        }
        
        i = 0;
        do {
            System.out.println(ilhas[i] + ":" + vendas[i]);
            i++;
        }while(i < vendas.length);
    }

}
