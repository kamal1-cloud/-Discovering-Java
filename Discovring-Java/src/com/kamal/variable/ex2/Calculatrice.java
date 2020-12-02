package com.kamal.variable.ex2;

import java.util.Scanner;

public class Calculatrice {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        double Ht = 0, tva = 0, ttc = 0, r = 0, netc = 0;
        System.out.println("Enter N");
        int n = clavier.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Entrer prix");
            double prix = clavier.nextDouble();
            Ht += prix;
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("Voulez-vous de remise");
        String a = scan.nextLine();
        if (a.equals("yes")) {
            r = Ht * 0.1;
            netc = Ht - r;
            System.out.println("Le montant est " + Ht +" "+ "MAD");
            System.out.println("La REMISE 1% est " + r +" "+"MAD");
            System.out.println("net commerciel est " + netc +" "+ "MAD");
            System.out.println("TVA est " + tva +" "+ "MAD");
            System.out.println("TTC " + ttc +" "+ "MAD");
        }else {
            netc = Ht;
            tva = netc * 0.2;
            ttc = netc + tva;
            System.out.println("Le montant est " + Ht +" "+"MAD");
            System.out.println("net commerciel est " + netc +" "+"MAD");
            System.out.println("TVA est " + tva +" "+"MAD");
            System.out.println("TTC " + ttc +" "+ "MAD");
            System.out.println("Aucune remise n'a été appliquée");
        }




        clavier.close();
    }

}