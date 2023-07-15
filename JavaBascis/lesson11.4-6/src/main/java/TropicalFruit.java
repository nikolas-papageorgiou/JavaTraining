class TropicalFruit extends Food {
    public String type;

    public TropicalFruit(String name, int calories, String type) {
        super(name, calories);
        this.type = type;
    }

    @Override
    double eat (){
        System.out.println("I am eating "+super.name+"("+type+")");
        return getCalories();
    }
}
