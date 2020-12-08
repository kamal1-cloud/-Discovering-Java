package com.company;

import java.util.ArrayList;
public class Main {

	public void firstMethode() {
		int i = 0;
		while(i < 10) {
			System.out.println(i);
			i++;
		}
	}

	public void secMethod() {
		int num1 = 1;
		int num2 = 22;
		while(num1 < 30) {
			int result = num1 * num2;
			System.out.println(result);
			num1 ++;
		}
	}

	public void thMethod() {

		for (int i = 1; i < 10;i++){
            i += i * 0.5;
			System.out.println("On y arrive presque..." + i);
		}
	}

	public void foMethod() {

		for (int i = 0; i < 15 ; i++){

				System.out.println("On y arrive presque..." + i);
		}
		}

		public void fiMethode(){
			for (int i = 20; i > 0 ; i--){

				System.out.println("C'est presque bon..." + i);

			}
		}

	public void seMethode(){
		for (int i = 1; i < 100 ; i = i + 15){

			System.out.println("On tient le bon bout..." + i);

		}
	}

	public void sevMethode(){
		for (int i = 200; i > 0 ; i = i - 12){

			System.out.println("On tient le bon bout..." + i);

		}
	}

	public boolean eiMethode(int x, int y){
		System.out.println(x > y);
		return x > y;
	}

	public String neMethode(String Chaine){

		System.out.println(Chaine);
		return Chaine;
	}

	public void nteMethode(String myCha1, String myChar2){

		System.out.println(myCha1 + " " + myChar2);
	}

	public int elMethode(int i, int j){

		if ( i > j){
			System.out.println(i + " " + "est plus grand que" + " " + j);
		}
		else if(i == j){
			System.out.println("Les deux nombres sont identiques ");
		}
		else {
			System.out.println(i + " " + "est plus petit  que" + " " + j);
		}
   return 0;
	}

	public void tweMethode(int i, String myChar){

		System.out.println(i + " " + myChar);
	}
	public void thiMethode(String nom,String prenom,int age){

		System.out.println("Bonjour" + " " + nom + " " + prenom + " " + ", tu as " + age);
	}

	public void forMethode(int age, String genre[]){

	//	System.out.println(age + " " + nom + " " + prenom + " " + ", tu as " + age);
	}

	public void forMethode(int age, String genre) {
		if (age > 18 && genre.equals("Homme")){
			System.out.println("Vous êtes un homme et vous êtes majeur");
		}else if (age < 18 && genre.equals("Homme")){
			System.out.println("Vous êtes un homme et vous êtes mineur");
		}else if (age > 18 && genre.equals("Femme")){
			System.out.println("Vous êtes une femme et vous êtes majeur");
		}else{
			System.out.println("Vous êtes une femme et vous êtes mineur");
		}
	}
	public int fifMethode(int i, int j, int k){
		System.out.println(i+j+k);
		return i+j+k;
	}


}