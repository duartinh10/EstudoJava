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
public class DeverSe6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
    int n1;
        System.out.println("Digite um numero: ");
    n1 = ler.nextInt();
    if (n1<=10)
    {
        System.out.println("F1");  
    }else if(n1>10 & n1<=100)
    {
        System.out.println("F2");
    }else if(n1>100)
    {
        System.out.println("F3");
    }
    }
    
}
