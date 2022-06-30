package javaapplication2.exerciciosteste;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author enta
 */
public class ex2 {

   public static void main(String[] args) {
        String[] frutas = new String[10];
        String continuar = null;
        int idx = 0;
        int novas = 0, tentativas = 0, total = 0;
        String fruta = null;

            do {
                Scanner sc = new Scanner(System.in);
                System.out.println("Insere uma fruta: ");
                fruta = sc.nextLine();
                total++;

                if (fruta.contains(" ")){
                    System.out.println("Nao pode ter mais que uma palavra ");
                    tentativas++;
                }else{
                if (!existe(frutas, fruta)) {
                    if (idx == frutas.length) {
                        String[] frutas2 = new String[idx * 2];
                        System.arraycopy(frutas,0,frutas2,0,frutas.length); 
                            frutas = frutas2;
                        
                    }
                    frutas[idx++] = fruta;
                    System.out.println("Não conhecia esta fruta");
                    novas++;
                    imprimir(frutas);
                }   
                }


            System.out.println("Continuar (s/n) ?");
            continuar = sc.next();
        } while (continuar.equals("s"));
        System.out.printf("------------------------------------------------\n");
        System.out.printf("Total: %d , Novas: %d , Tentativas: %d\n",total,novas,tentativas);
    }

    private static boolean existe(String[] frutas, String fruta) {
        for (int x = 0; x < frutas.length; x++) {
            if (fruta.equals(frutas[x])) {
                System.out.println("O número " + fruta + " já foi inserido!");
                return true;
            }
        }
        return false;

    }

    private static void imprimir(String[] frutas) {
       for (String fruta : frutas) {
           System.out.println(fruta);
       }
    }
}
