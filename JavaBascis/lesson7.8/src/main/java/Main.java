public class Main {
    //To project αυτό δημιουργήθηκε με σκοπό να αναδείξει την σχέση έχει μεταξύ των κλάσεων
    //Κατασκευάσαμε μια κλάση Building πού έχει ένα πίνακα από Flats και στην συνέχεια
    //Κατασκευάσαμε μια κλάση Flat που διαθέτει ακέραιο αριθμό αριθμό ανθρώπων.
    public static void main(String[] args) {
        Building b = new Building(3,4);
        b.addPeople(0,2,5);
        b.printPeople();

    }
}