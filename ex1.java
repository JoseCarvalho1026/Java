package javaapplication2.exerciciosteste;

import java.util.Scanner;

public class array {

    public static void main(String[] args) {
        int[] nums = new int[10];
        String continuar = null;
        Scanner sc = new Scanner(System.in);
        int num, idx = 0;
        int par = 0, impar = 0, total = 0;
        do {
            do {
                System.out.println("Insere um número entre 1 e 99: ");
                num = sc.nextInt();
                total++;
                if (num % 2 == 0){
                    par++;
                  
                }else{
                impar++;
                }
                if (num < 1 || num > 99) {
                    System.out.println("Este número não está entre 1 e 99");
                    continue;
                }

                if (!existe(nums, num)) {
                    if (idx == nums.length) {
                        int[] nums2 = new int[idx * 2];
                        System.arraycopy(nums,0,nums2,0,nums.length); 
                            nums = nums2;
                        
                    }
                    nums[idx++] = num;
                    
                }
            } while (num < 1 || num > 99);

            for (int x = 0; x < nums.length; x++) {
                System.out.println(nums[x] + "\t");
            }

            System.out.println("Continuar (s/n) ?");
            continuar = sc.next();
        } while (continuar.equals("s"));
        System.out.printf("------------------------------------------------\n");
        System.out.printf("Total: %d , Par: %d , Impar: %d\n",total,par,impar);
    }

    private static boolean existe(int[] nums, int num) {
        for (int x = 0; x < nums.length; x++) {
            if (num == nums[x]) {
                System.out.println("O número " + num + " já foi inserido!");
                return true;
            }
        }
        return false;

    }
}
