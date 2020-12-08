package kamal.tuto;

import java.util.Scanner;

public class TanteFortunee {

    int input;
    int cafee = 10;
    int carte = 10;
    int billet = 8;

    public TanteFortunee(int input) {
        this.input = input;
    }

    public double Pourcentage() {
        return this.input * 0.75;
    }

    public int Rest() {
        return (this.input - (int) this.Pourcentage()) / 3;
    }

    public int result(int prix) {
        return this.Rest() / prix;
    }

    public int modulo(int prix1, int prix2) {
        int sum;
        sum = +this.Rest() % prix1;
        sum = +(this.Rest() % prix2) * 2;
        return sum;

    }

    public void affichage() {
        System.out.println("Livre et Fournitures : " + this.Pourcentage() + " MAD");
        System.out.println("Vous pouvez ensuite acheter :");
        System.out.println(this.result(this.cafee) + " cafée");
        System.out.println(this.result(this.carte) + " Carte");
        System.out.println(this.result(this.billet) + " billets");
        System.out.println("et il vous restera " + this.modulo(this.billet, this.cafee) + " MAD pour les roses blanches.");
    }
    public static void main(String[] args) {

        System.out.println("Combien avez-vous reçu d'argent (MAD) ?");
        Scanner clavier = new Scanner(System.in);
        int input = clavier.nextInt();
        clavier.close();
        TanteFortunee  test = new TanteFortunee (input);
        test.affichage();

    }

}
