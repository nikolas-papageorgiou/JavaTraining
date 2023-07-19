import com.sun.nio.sctp.AbstractNotificationHandler;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<String>();

        list.add("John");
        list.add("Tzeni");
        list.add("Nick");
        list.add("Maria");

        //Για να σαρώσω την list χρειάζομαι ένα iterator. Δεν γίνεται η σάρωση όπως στην ArrayList
        //O iterator δείχνει σε ένα στοιχείο πριν το πρώτο στοιχείο αρχικά
        Iterator<String> iter = list.iterator();

        //Για να διατρέξω την λίστα θα πρέπει να ελέγχω αν υπάρχει επόμενο στοιχείο
        while (iter.hasNext()){
            //Μπορώ να προσπελάσω το επόμενο στοιχείο ζητώντας από τον iterator να μου φέρει το επόμενο
            String name = iter.next(); //Η προσπέλαση της λίστας μετακινώντας τον iterator όταν καλώ την next().
            System.out.println("Name "+name);

            //Ο λόγος που χρησιμοποιούμε Linked Lists είναι ότι η εισαγωγή και διαγραφή δεδομένων γίνεται ταχύτερα
            if(name.equals("Maria")){
                iter.remove();
            }
            //Όταν εκτελείται μια διάσχιση με iterator ο iterator παραμένει στο τέλος
            }
        //Εναλλακτικά μπορούμε να χρησιμοποιήσουμε for each
        for(String name: list){
            System.out.println("Name "+name);
            //Το μειονέκτημα με τον τρόπο αυτό είναι ότι δεν είναι τόσο απλό να διαγράψουμε ένα στοιχείο
        }


    }
}