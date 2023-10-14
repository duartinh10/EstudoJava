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
public class DeverSe10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        int produto;
            System.out.println("O valor do produto: ");
                produto = ler.nextInt();
        int compra;
            System.out.println("O valor da compra é: ");
                compra = ler.nextInt();
        int troco;
            troco = compra - produto;
                System.out.println("O troco é: "+ troco);
        if (troco >=1 ){
        float troco1;
            troco1 = troco/1;
               System.out.println("O troco só com nota de 1 real: "+troco1); 
        float troco10;
            troco10 = troco/10;
                System.out.println("O troco só com nota de 10 reais: "+troco10);
        float troco100;
            troco100 = troco/100;
                System.out.println("O troco em nota de 100 reais: "+troco100);
        }else
        {
            System.out.println("Falta dinheiro");
        }
        
    }
    
}
