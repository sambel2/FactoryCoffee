class Sugar extends CoffeeDecorator {

    private double cost = .50;

    public Sugar(Coffee specialCoffee) {
        super(specialCoffee);
    }

    public double makeCoffee() {
        return specialCoffee.makeCoffee() + addSugar();
    }

    private double addSugar() {
        System.out.println(" + add Sugar: $.50");
        return cost;
    }
}
