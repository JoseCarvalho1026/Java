package javaapplication3;


import java.util.ArrayList;

public class novaaplicacao {

    public static void main(String[] args) {
        int lista[] = {1, 2, 3, 4, 5, 6};

        for (int x = 0; x < lista.length; x++) {
            ArrayList<Integer> combos = new ArrayList<Integer>();
            int temp[] = {0, 0};
            for (int y = x + 1; y < lista.length; y++) {
                temp[0] = lista[x];
                temp[1] = lista[y];
                combos.add(temp[0],temp[1]);
                
            }

        }
        for (int x = 0; x < combos.size();x++){
            System.out.println(combos.get(x)[0] + "-" + combos.get(x)[1]);
        }
    }

}
---------------------------------------------------------------------------------------
package javaapplication3;

import java.util.ArrayList;

public class fugaprisao {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        int bananas[] = {1, 1, 3, 5, 2, 4};

        if (distraidos(bananas)) {
            System.out.println("Distraidos");
        } else {
            System.out.println("Atentos");
        }
    }

    private static boolean distraidos(int[] bananas) {

        for (int x = 0; x < bananas.length - 1; x++) {
            int g1 = bananas[x];
            int g2 = bananas[x + 1];
            ArrayList<Integer> nums = new ArrayList<Integer>();
            boolean loop = isLoop(nums, g1, g2);

        }

        return true;

    }

    private static boolean isLoop(ArrayList<Integer> nums, int g1, int g2) {
        if (g1 < g2) {
            g2 = g2 - g1;
            g1 = g1 * 2;

        } else if (g2 > g1) {
            g1 = g1 - g2;
            g2 = g2 * 2;
        } else {
            return false;
        }
        if (nums.contains(g1) || nums.contains(g2)) {
            return true;
        }

        nums.add(g1);
        nums.add(g2);
        isLoop(nums,g1,g2);
        return false;
    }
}
