public class Main {
    public static void main(String[] args) {

        Food[] array = new Food[5];
        array[0] = new Snack("Apple pie",200);
        array[1]= new Snack("Club sandwich", 700);
        array[2]= new TropicalFruit("Mango", 150,"African");
        array[3] = new TropicalFruit("Kiwi", 120,"Asian");
        array[4] = new TropicalFruit("Coconut", 250,"Caribbean");

        int totalAmount = 0;
        for(var elem:array){
            totalAmount +=elem.eat();
        }
        System.out.println("Total amount of calories: "+totalAmount );
    }
}
