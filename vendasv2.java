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

    private static int totalvendas;
    private static int maior;
    private static int menor;
    private static int media;

    public static void main(String[] args) {
        String ilhas[] = {"Terceira", "Graciosa", "São Jorge", "Pico", "Faial"};
        String ilhamaior = null, ilhamenor = null;
        int vendas[] = {10, 20, 30, 40, 50};
        valores();
        for (int i = 0; i < vendas.length; i++) {
            totalvendas += vendas[i];
            media = totalvendas / vendas.length;
            if (i == 0) {
                maior = vendas[0];
                ilhamaior = ilhas[0];
                menor = vendas[0];
                ilhamenor = ilhas[0];
            } else {
                if (vendas[i] > maior) {
                    maior = vendas[i];
                    ilhamaior = ilhas[i];
                }
                if (vendas[i] < menor) {
                    menor = vendas[i];
                    ilhamenor = ilhas[i];
                }

            }

            System.out.println(ilhas[i] + ":" + vendas[i]);
            System.out.println("Total de Vendas: " + totalvendas);
            System.out.println("Ilha com maior vendas: " + ilhamaior + " Montante:" + maior);
            System.out.println("Ilha com menor vendas: " + ilhamenor + "Montante" + menor);
            System.out.println("Média das vendas:" + media);
        }
        valores();
        int i = 0;
        while (i < vendas.length) {
            System.out.println(ilhas[i] + ":" + vendas[i]);
            i++;
        }
        valores();
        i = 0;
        do {
            System.out.println(ilhas[i] + ":" + vendas[i]);
            i++;
        } while (i < vendas.length);
    }

    private static void valores() {
        totalvendas = 0;
        maior = 0;
        menor = 0;
        media = 0;

    }

}
