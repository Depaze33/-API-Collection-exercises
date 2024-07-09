package fr.afpa;

import java.util.Stack;

public class StackApp {
    public static void main(String[] args) {

        // Ressources :
        // https://www.jmdoudoux.fr/java/dej/chap-collections.htm#collections-5 -> crtl + F : '14.6.7.1. L'interface java.util.Deque' (ca aide si vous y retrouvez sinon utilisé les autres)
        // https://codegym.cc/fr/groups/posts/fr.828.pile-java
        // https://www.youtube.com/watch?v=KInG04mAjO0
        

        // Instanciez une nouvelle Stack(Pile) sur le theme de votre choix
        Stack<String> skate = new Stack<>();

        //  Ajoutez des valeurs dans votre stack
            skate.push("Magenta");
            skate.push("Palace");
            skate.push("Sour");
            skate.push("Flip");


        //  Ajoutez une valeur a la fin  de la stack
        skate.push("Hockey");

        //  Affichez votre stack
        System.out.println("My Stack is "+ skate);

        
        
        //  Affichez l'élément du dessus de votre stack
        System.out.println("First element is : " );
        //  Supprimez le dernier élément de votre stack
        skate.pop();
        System.out.println("My new stack is : " + skate);

        //  Affichez le premier élément de votre stack
        // String myFirstMark = skate.pop();
        // System.out.println("My last mark is :  " + myFirstMark);
        System.out.println("My highest mark is : " + skate.peek());
       
        //  Cherchez et affichez la position d'un de vos éléments (la valeur indiquera la position de l'élément par rapport au dessus de la stack)
           System.out.println(skate.search("Magenta"));

        //  Vérifiez si votre stack est vide 
        System.out.println("Is Stack is empty : " + skate.empty());

        //  Supprimez tous les éléments de votre stack
        skate.pop();
        skate.pop();
        skate.pop();
        skate.pop();


        //  Refaites la vérification
        System.out.println("Is Stack is empty : " + skate.empty());

    }
}
