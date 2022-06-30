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
        for (int i = 50; i < 101; i++) {
            total += i;
            
          //  System.out.println("Hello " + i + "total=" + total++);
        }
        System.out.println("Total=" + total);
        
        
        total = 0;
        int i = 50;
        do{
              total += i;
              i++;

        } while(i < 101);
            System.out.println("Total=" + total);
        
            
        total = 0;   
        i = 50;
        while(i < 101){
            total += i;
            i++;
        }
        System.out.println("Total=" + total);
        
    }
    
}
