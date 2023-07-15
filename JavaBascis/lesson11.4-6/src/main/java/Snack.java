class Snack extends Food {
    public Snack(String name, int calories) {
        super(name, calories);
    }

    @Override
    public double eat() {
        System.out.println("I am eating a snack "+super.name);
        return getCalories();
    }
}
