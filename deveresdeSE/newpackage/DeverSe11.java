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
public class DeverSe11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        int quaparafuso;
            System.out.println("Quantidade de parafusos: ");
                quaparafuso = ler.nextInt();
        if(quaparafuso > 0){
        String nome;
            System.out.println("Digite o seu nome: ");
                nome = ler.next();
        int valorparafuso;
            System.out.println("Digite o valor dos parafusos: ");
                valorparafuso = ler.nextInt();
        int parafuso;
                parafuso = valorparafuso * quaparafuso;
                    System.out.println("Total a pagar: "+ parafuso);
        int desparafuso;
            desparafuso = (int) (parafuso * 0.2);
        int parafusofin;
            parafusofin = parafuso - desparafuso;
                System.out.println("Valor com desconto: "+parafusofin);
        }
        int quaporcas;
            System.out.println("Quantidade de porcas: ");
                quaporcas = ler.nextInt();
        if(quaporcas > 0){
        String nome1;
            System.out.println("Digite o seu nome: ");
                nome1 = ler.next();
        int valorporcas;
            System.out.println("Digite o valor dos porcas: ");
                valorporcas = ler.nextInt();
        int porcas;
                porcas = valorporcas * quaporcas;
                    System.out.println("Total a pagar: "+ porcas);
        int desporcas;
            desporcas = (int) (porcas * 0.1);
        int porcasfin;
            porcasfin = porcas - desporcas;
                System.out.println("Valor com desconto: "+porcasfin);
        }
        int quaarruelas;
            System.out.println("Quantidade de arruelas: ");
                quaarruelas = ler.nextInt();
        if(quaarruelas > 0){
        String nome2;
            System.out.println("Digite o seu nome: ");
                nome2 = ler.next();
        int valorarruelas;
            System.out.println("Digite o valor dos arruelas: ");
                valorarruelas = ler.nextInt();
        int arruelas;
                arruelas = valorarruelas * quaarruelas;
                    System.out.println("Total a pagar: "+ arruelas);
        int desarruelas;
            desarruelas = (int) (arruelas * 0.3);
        int arruelasfin;
            arruelasfin = arruelas - desarruelas;
                System.out.println("Valor com desconto: "+arruelasfin);
        }
    }
    
}
