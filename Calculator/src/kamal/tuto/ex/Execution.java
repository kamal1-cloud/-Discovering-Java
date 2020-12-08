package kamal.tuto.ex;

import java.util.Scanner;

public class Execution {
    public static void main(String[] args) {

        System.out.println("Combien avez-vous re�u d'argent (MAD) ?");
        Scanner clavier = new Scanner(System.in);
        int input = clavier.nextInt();
        clavier.close();
        TanteFortunee  test = new TanteFortunee (input);
        test.affichage();

    }
}
