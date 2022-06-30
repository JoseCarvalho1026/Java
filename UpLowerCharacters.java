package javaapplication8;

public class JavaApplication8 {

    public static void main(String[] args) {
        String name = "Jose gASPAR sousa CARVALHO";
        int maisculas = 0 , minusculas = 0;
        for (int x = 0; x < name.length(); x++) {
            
            if (Character.isUpperCase(name.charAt(x))) {
                maisculas++;
            } else if (Character.isLowerCase(name.charAt(x))) {
                minusculas++;
            }

        }
        System.out.println("Existem " + maisculas + " letras maisculas");
        System.out.println("Existem " + minusculas + " letras minusculas");
        
    }
}
