package kamal.collections.ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
public class Collection {
    public static void main(String[] args) {
        // Question 1
        /*
        ArrayList<String> mois = new ArrayList<String>();
        mois.add("Jnavier");
        mois.add("Février");
        mois.add("Mars");
        mois.add("Avril");
        mois.add("Mai");
        mois.add("Juin");
        mois.add("Juillet");
        mois.add("Aout");
        mois.add("Octobre");
        mois.add("Novembre");
        mois.add("Décembre");

        System.out.println(mois);

        // Question 2
        System.out.println(mois.get(2));
        // Question 3
        System.out.println(mois.get(5));
        // Question 4
        for (int i = 0; i < mois.size(); i++) {
            System.out.println(mois.get(i));
        }
        // Question 5
        mois.set(7, "Août");
        System.out.println(mois);
        // Question 6
        mois.add(0, "First");
        System.out.println(mois);
        // Question 7
        mois.remove(2);
        System.out.println(mois);
        // Question 8
        int position = mois.indexOf("Mars");
        System.out.println(position);
        // Question 9
        Collections.sort(mois);
        System.out.println(mois);
        // Question 10
        ArrayList mois2 = new ArrayList(mois);
        // Question 11
        System.out.println(mois2);

          */
        // Question 13 HashSet
        HashSet<String> mois = new HashSet<String>();
        mois.add("Jnavier");
        mois.add("Février");
        mois.add("Mars");
        mois.add("Avril");
        mois.add("Mai");
        mois.add("Juin");
        mois.add("Juillet");
        mois.add("Aout");
        mois.add("Octobre");
        mois.add("Novembre");
        mois.add("Décembre");
        System.out.println(mois);

        // Qustion 14
        mois.add("13");
        // Question 15
        System.out.println(mois);
        // Question 16
        System.out.println(mois.size());
        // Question 17
        mois.clear();
        // Question 18
        System.out.println(mois.isEmpty());
        // Question 19
        // Create a HashMap object called capitalCities
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);
        // Question 20
        System.out.println(capitalCities.size());
        // Question 21
        HashMap copyCapitalCities = new HashMap(capitalCities);
        System.out.println(copyCapitalCities);
        // Question 22
        copyCapitalCities.remove("USA");
        System.out.println(copyCapitalCities);
    }
}
