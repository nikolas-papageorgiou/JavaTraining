abstract class Food {
    //Έχουμε χρησιμοποιήσει διαφορετικούς τροποποιητές ώστε να αναδειχθούν οι τρόποι προσπέλασης μελών από τις υποκλάσεις
    //Στην πρώτη περίπτωση που χρησιμοποιούμε τον public τροποποιητή η πρόσβαση γίνεται με την δεσμευμένη λέξη super
    //Στην δεύτερη περίπτωση που χρησιμοποιούμε τον private τρόποποιητή η πρόσβαση γίνεται με getter.
    public String name;
     private int calories;
    abstract double eat();

    public Food(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }

    public int getCalories() {
        return calories;
    }
}
