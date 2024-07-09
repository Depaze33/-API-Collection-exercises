package fr.afpa;

import java.util.HashMap;
import java.util.Map;

//TODO Faites l'import de java HashMap


public class HashMapApp {
    public static void main(String[] args) {

        // Ressources :
        // https://www.youtube.com/watch?v=I9aBP0xm-lE
        // https://www.w3schools.com/java/java_hashmap.asp
        // https://www.jmdoudoux.fr/java/dej/chap-collections.htm#collections-5


        // Instanciez une nouvelle HashMap sur le theme de votre choix
        HashMap<String, String> superHero= new HashMap<>();

        // Ajoutez des paires clé/valeur à votre HashMap - au moins 5 paires
        // skate.
superHero.put("Name ", "Green Arrow - Olivier Queen");
superHero.put("Age ", "30" );
superHero.put("Outfit ", "Green cap" );
superHero.put("Arme ", "Arc" );
superHero.put("Best Friend ", "Felicity Smoack");
        // Récupérez la valeur d'une de vos paires
        
        System.out.println(superHero.get("Age"));

        //  Vérifiez si une de vos clés est contenue dans la collection
       System.out.println(superHero.containsKey("Age "));//true
       System.out.println(superHero.containsKey("Animal"));//false

        //  Vérifiez si une de vos valeurs est contenue dans la collection
        
       System.out.println(superHero.containsValue("Arc"));//true
       System.out.println(superHero.containsValue("Doberman"));//false

        //  Ajoutez une paire clé/valeur à votre HashMap
        superHero.put("Lover ", "Black Canary - Dinah Laurel Lance ");

        //  Utilisez une méthode pour trouver le nombre de paires (la longueur de votre HashMap) et affichez la en console
        System.out.println(superHero.size());

        //  Affichez toutes les clés de votre HashMap (avec une boucle for each & avec une méthode de HashMap)
        for (String key : superHero.keySet()) {
            System.out.println("keys is:"  + key);
            
        }

        // Affichez toutes les valeurs de votre HashMap (avec une boucle for each & avec une méthode de HashMap)
       for (String values : superHero.values()) {
        System.out.println("values is : " + values);
       }


        // Affichez toutes les clés/valeurs de votre HashMap (avec une boucle for each & avec une méthode de HashMap)
        for (Map.Entry<String, String> entry : superHero.entrySet()) {
            
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Clé: " + key + ", Valeur: " + value);
        }

        // Supprimez une de vos paires
       superHero.remove("Age");
       System.out.println(superHero);

        // Vérifiez si votre HashMap est vide
       System.out.println(superHero.isEmpty());

        // Supprimez tous les éléments de votre HashMap
      superHero.clear();
      System.out.println(superHero);

        // Refaites la vérification
    System.out.println(superHero.isEmpty());

    }
}
