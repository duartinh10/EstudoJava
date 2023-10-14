/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package deveresdeSE.newpackage;
import java.util.Scanner;
/**
 *
 * @author mathe
 */
public class DeverSe4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        int n1;
            System.out.println("Digite um numero: ");
        n1 = ler.nextInt();
        if (n1%2 == 0)
        {
            System.out.println("Par");
        }else
        {
            System.out.println("Impar");
        }
    }
    
}
