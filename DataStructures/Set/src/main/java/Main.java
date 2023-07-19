import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

//        //Αρχικά αναλύουμε την HashSet
//        //Στα σύνολα δεν επιτρέπονται διπλότυπα
//        HashSet<String> set = new HashSet<String>();
//
//        set.add("Maria");
//        set.add("Tzeni");
//        set.add("Nikos");
//        set.add("Maria");
//
//        for (String name:set){
//            System.out.println("Name " + name);
//        }
//        //Το όνομα Maria δεν καταχωρείται δεύτερη φορά. Όμως κράτησε το δεύτερο
//        //Σημαντική δυνατότητα που παρέχουν τα Collections είναι η μετατροπή από το
//        //ένας είδος δομών δεδομένων σε άλλο.
//
//        ArrayList<String> list = new ArrayList<String>();
//        list.add("John");
//        list.add("Maria");
//        list.add("Nikos");
//        list.add("John");
//        list.add("Tzeni");
//
//        System.out.println("-------------ArrayList----------------");
//        for(String name: list){
//            System.out.println("Name "+name);
//        }
//
//        //Για να μετατρέψω από την μια δομή σε μια αλλή απλά το περνάω ως παράμετρο.
//        HashSet<String> set = new HashSet<String>(list);
//        System.out.println("-------------HashSet----------------");
//        for(String name: set){
//            System.out.println("Name "+name);
//        }


        Collection<String> set1 = new HashSet<String>();
        set1.add("Α");
        set1.add("Β");
        set1.add("C");
        set1.add("D");

        Collection<String> set2 = new HashSet<String>();
        set2.add("D");
        set2.add("E");
        set2.add("F");

        //Έστω ότι θέλω να βρώ αν το set2 είναι υποσύνολο του set2
        if(set1.containsAll(set2))
            System.out.println("set2 is subset of set1");
        else System.out.println("set2 is not subset of set1");

        //Έστω ότι θέλω να βρώ την ένωση των δύο συνόλων
        set1.addAll(set2);
        System.out.println("------Union-----------");
        //To D δεν θα επαναληφθεί δύο φορές
        for(String s: set1)
            System.out.println(s);

        //Έστω ότι θέλουμε την τομή
        set1.retainAll(set2);
        System.out.println("-----Intersection-----------");
        for (String s: set1)
            System.out.println(s);


    }

}